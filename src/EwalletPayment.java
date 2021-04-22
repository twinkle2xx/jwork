
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */
import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class EwalletPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
        
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus)
    {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }
    
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
       
    public Bonus getBonus()
    {
        return bonus;
    }
        
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }
    
    @Override
    public void setTotalFee()
    {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if (bonus != null && (bonus.getActive() == true) && fee > bonus.getMinTotalFee()) {
                super.totalFee = fee + bonus.getExtraFee();
            } else {
                super.totalFee = fee;
            }
        }
    }
       
    public String toString()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if ((bonus != null) && (bonus.getActive() == true) && (job.getFee() > bonus.getMinTotalFee())) {
                res.concat("\nId = " + getId() +
                        "\nJob = " + job.getName() +
                        "\nDate = " + date +
                        "\nJob Seeker = " + getJobseeker().getName() +
                        "\nReferral Code = " + bonus.getReferralCode() +
                        "\nTotal Fee = " + getTotalFee() +
                        "\nStatus = " + getInvoiceStatus() +
                        "\nPayment = " + PAYMENT_TYPE);
            }
            else {
                res.concat("\nId = " + getId() +
                        "\nJob = " + job.getName() +
                        "\nDate = " + date +
                        "\nJob Seeker = " + getJobseeker().getName() + bonus.getReferralCode() +
                        "\nTotal Fee = " + getTotalFee() +
                        "\nStatus = " + getInvoiceStatus() +
                        "\nPayment = " + PAYMENT_TYPE);
            }

        }
        return res;
    }
}
