
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 4 - Case Study (01/04/2021)
 */
public class EwalletPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    public static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    public Bonus bonus;
        
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker,invoiceStatus);
    }

    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker,invoiceStatus);
        this.bonus = bonus;
    }
    
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
    
    public void setTotalFee()
    {
        if ((bonus != null) && getBonus().getActive() && totalFee > bonus.getMinTotalFee())
        {
            super.totalFee += bonus.getExtraFee();
        }
        
        else
        {
            super.totalFee = super.getJob().getFee();
        }
    }
        
    public void printData()
    {
        System.out.println("\n====Invoice====" +
            "\nID: " + getId() +
            "\nID Job: " + job +
            "\nDate: " + getDate() +
            "\nSeeker: " + jobseeker.getName() +
            "\nFee: " + totalFee +
            "\nStatus: " + invoiceStatus);
    }
}
