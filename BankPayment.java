
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */
public class BankPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    public static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    public int adminFee;
        
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker,invoiceStatus);
    }

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, int adminFee, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker,invoiceStatus);
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
        if (adminFee >= 1)
        {
            super.totalFee = super.getJob().getFee() - getAdminFee();
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
        //System.out.println("\nReferral Code = "+ bonus.getReferralCode());
        System.out.println("\nStatus = "+ super.getInvoiceStatus());
        System.out.println("\nPayment Type = "+ PAYMENT_TYPE);
    }
}
