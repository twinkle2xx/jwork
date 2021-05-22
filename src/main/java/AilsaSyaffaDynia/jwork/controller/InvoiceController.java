package AilsaSyaffaDynia.jwork.controller;

import AilsaSyaffaDynia.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) throws InvoiceNotFoundException {
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    @RequestMapping(value = "/Jobseeker/{JobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int JobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(JobseekerId);
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value="id") int id) throws InvoiceNotFoundException {
        Boolean invoice = DatabaseInvoice.removeInvoice(id);
        return invoice;
    }


}
