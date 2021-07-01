package AilsaSyaffaDynia.jwork.controller;

import AilsaSyaffaDynia.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Class InvoiceController, untuk mengontrol invoice yang terkoneksi dengan jwork android
 * @author Ailsa Syaffa Dynia
 * @version 28-06-2021
 */

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    /**
     * Untuk mendapatkan database invoice
     * @return DatabaseInvoice
     */
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    /**
     * Untuk mendapatkan invoice dengan id
     * @param id
     * @return invoice
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) throws InvoiceNotFoundException {
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    /**
     * Untuk mendapatkan invoice dengan jobseeker
     * @param JobseekerId
     * @return invoice
     */
    @RequestMapping(value = "/Jobseeker/{JobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int JobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(JobseekerId);
    }

    /**
     * Untuk mendapatkan invoice dengan status
     * @param id
     * @param invoiceStatus
     * @return invoice
     */
    @RequestMapping(value = "/invoiceStatus/", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    /**
     * Untuk melakukan remove invoice, jika membatalkan
     * @param id
     * @return DatabaseInvoice.removeInvoice(id)
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value="id") int id) throws InvoiceNotFoundException {
        Boolean invoice = DatabaseInvoice.removeInvoice(id);
        return invoice;
    }

    /**
     * Untuk membuat bank payment invoice
     * @param jobIdList
     * @param jobseekerId
     * @param adminFee
     * @return invoice
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value="jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value="jobseekerId") int jobseekerId,
                                  @RequestParam(value="adminFee") int adminFee)
    {
        ArrayList<Job> foods = new ArrayList<>();
        for (int job : jobIdList) {
            try {
                foods.add(DatabaseJob.getJobById(job));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new BankPayment(DatabaseInvoice.getLastId()+1, foods,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), adminFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Untuk membuat ewallet invoice
     * @param jobIdList
     * @param jobseekerId
     * @param referralCode
     * @return invoice
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value="jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value="jobseekerId") int jobseekerId,
                                     @RequestParam(value="referralCode") String referralCode)
    {
        ArrayList<Job> jobs = new ArrayList<>();
        for (int job : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(job));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new EwalletPayment(DatabaseInvoice.getLastId()+1, jobs,
                    DatabaseJobseeker.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (JobSeekerNotFoundException | OngoingInvoiceAlreadyExistException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
