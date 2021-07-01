package AilsaSyaffaDynia.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Class BankPayment ini berfungsi untuk memproses tipe pembayaran melalui bank, dimana terdapat 2 konstruktor
 * @author Ailsa Syaffa Dynia
 * @version 28-06-2021
 */

public class BankPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Konstruktor pertama jika tidak terdapat admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    /**
     * Konstruktor kedua terdapat tambahan admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     * @param adminFee
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * Untuk mendapatkan payment type
     * @return PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * Untuk mendapatkan admin fee
     * @return adminFee
     */
    public int getAdminFee()
    {
        return adminFee;
    }

    /**
     * Untuk set nilai admin fee
     * @param adminFee
     */
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }

    /**
     * Untuk set total fee yang ada
     */
    @Override
    public void setTotalFee()
    {
        for(Job job : getJobs()) {
            if(adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            }
            else {
                totalFee = job.getFee();
            }
        }
    }

    /**
     * Method toString
     */
    public String toString()
    {
        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
        String date1 = format1.format(getDate().getTime());
        String jobIn = "";
        for(int i=0; i<getJobs().size();i++){
            jobIn = jobIn + getJobs().get(i).getName() + " ";
        }

        return "\n================INVOICE================\n" +
                "ID: " + getId() +
                "\nJob: " + jobIn +
                "\nDate: " + date1 +
                "\nJobseeker: " + getJobseeker().getName() +
                "\nAdmin Fee: " + getAdminFee() +
                "\nTotal Fee: " + totalFee +
                "\nStatus: " + getInvoiceStatus() +
                "\nPayment Type: " + getPaymentType();
    }
}
