
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 4 - Case Study (01/04/2021)
 */
public abstract class Invoice
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    //private int idJob; //deklarasi variabel int
    protected int totalFee; //deklarasi variabel int
    private String date; //deklarasi variabel String
    public Jobseeker jobseeker;
   // public PaymentType paymentType;
    public InvoiceStatus invoiceStatus;
    public Job job;

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param job dari invoice
     * @param date dari invoice
     * @param totalfee dari invoice
     * @param jobseeker dari invoice
     * @param paymentType dari invoice
     * @param status dari invoice
     */
    public Invoice(int id, Job job, int totalFee, String date, Jobseeker jobseeker, InvoiceStatus status)
    {
       this.id = id;
       this.job = job;
       this.totalFee = totalFee;
       this.date = date;
       this.jobseeker = jobseeker;
       //this.paymentType = paymentType;
       this.invoiceStatus = invoiceStatus;
    }

    /**
    * getter id dari invoice
    * @return id dari invoice
    */
   public int getId()
    {
        return id;
    }
    
    /**
    * getter job invoice
    * @return job invoice
    */
   public Job getJob()
    {
        return job;
    }
    
    /**
    * getter tanggal dari invoice
    * @return date dari invoice
    */
   public String getDate()
    {
        return date;
    }
    
    /**
    * getter jumlah biaya dari invoice
    * @return totalfee dari invoice
    */
   public int getTotalFee()
    {
        return totalFee;
    }
    
   /**
    * getter tipe pembayaran dari invoice
    */
   public abstract PaymentType PaymentType();
    
   /**
    * getter status dari invoice
    * @return status dari invoice
    */
   public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    } 
    
    /**
    * getter jobseeker dari invoice
    * @return jobseeker dari invoice
    */
   public Jobseeker getJobseeker()
    {
        return jobseeker;
    }
    
    /**
    * setter id dari invoice
    * @param id dari invoice
    */
   public void setId(int id)
    {
        this.id = id;
    }
    
    /**
    * setter idjob dari invoice
    * @param idjob dari invoice
    */
   public void setJob(Job job)
    {
        this.job = job;
    }
    
    /**
    * setter tanggal dari invoice
    * @param date dari invoice
    */
   public void setDate(String date)
    {
        this.date = date;
    }
    
    public abstract void setTotalFee();
       
    /**
    * setter jobseeker dari invoice
    * @param jobseeker dari invoice
    */
   public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }
    
    /**
    * setter tipe pembayaran dari invoice
    * @param paymentType dari invoice
    */
   //public void setPaymentType(PaymentType paymentType);   
    
    /**
    * setter status dari invoice
    * @param status dari invoice
    */
   public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
     * Menampilkan jumlah harga
     */
    public abstract void printData();
    /*{
        System.out.println("\n====Invoice====" +
            "\nID: " + id +
            "\nID Job: " + idJob +
            "\nDate: " + date +
            "\nSeeker: " + jobseeker.getName() +
            "\nFee: " + totalFee +
            "\nStatus: " + status);
    }*/
}
