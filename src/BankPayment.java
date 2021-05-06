
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class BankPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
        
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }
    
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
       
    public int getAdminFee()
    {
        return adminFee;
    }
        
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    
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
