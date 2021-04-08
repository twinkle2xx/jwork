
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
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
        if (bonus != null && bonus.getActive() && (super.totalFee > bonus.getMinTotalFee()))
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
        System.out.println("\n==========Invoice==========\n");
        System.out.println("ID = "+ super.getId());
        System.out.println("\nJob = "+ super.getJob().getName());
        System.out.println("\nDate = "+ super.getDate());
        System.out.println("\nSeeker = "+ super.getJobseeker().getName());
        System.out.println("\nFee = "+ super.totalFee);

        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee() && bonus.getReferralCode() != null)
        {
            System.out.println("\nReferral Code = "+ bonus.getReferralCode());
        }
        System.out.println("\nStatus = "+ super.getInvoiceStatus().toString());
        System.out.println("\nPayment Type = "+ PAYMENT_TYPE.toString());
    }
}
