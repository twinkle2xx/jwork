
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */
public class Invoice
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    private int idJob; //deklarasi variabel int
    private int totalFee; //deklarasi variabel int
    private String date; //deklarasi variabel String
    public Jobseeker jobseeker;
    public PaymentType paymentType;
    public InvoiceStatus status;

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param idJob dari invoice
     * @param date dari invoice
     * @param totalfee dari invoice
     * @param jobseeker dari invoice
     * @param paymentType dari invoice
     * @param status dari invoice
     */
    public Invoice(int id, int idJob, int totalFee, String date, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status)
    {
       this.id = id;
       this.idJob = idJob;
       this.totalFee = totalFee;
       this.date = date;
       this.jobseeker = jobseeker;
       this.paymentType = paymentType;
       this.status = status;
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
    * getter idjob invoice
    * @return idjob invoice
    */
   public int getIdJob()
    {
        return idJob;
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
    * @return paymentType dari invoice
    */
   public PaymentType getPaymentType()
    {
        return paymentType;
    }
    
   /**
    * getter status dari invoice
    * @return status dari invoice
    */
   public InvoiceStatus getInvoiceStatus()
    {
        return status;
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
   public void setIdJob(int idJob)
    {
        this.idJob = idJob;
    }
    
    /**
    * setter tanggal dari invoice
    * @param date dari invoice
    */
   public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
    * setter jumlah biaya dari invoice
    * @param total fee dari invoice
    */
   public void setTotalFee(int totalFee)
    {
        this.totalFee = totalFee;
    }
    
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
   public void setPaymentType(PaymentType paymentType)
    {
        this.paymentType = paymentType;
    }
    
    /**
    * setter status dari invoice
    * @param status dari invoice
    */
   public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    /**
     * Menampilkan jumlah harga
     */
    public void printData()
    {
        System.out.println("\n====Invoice====" +
            "\nID: " + id +
            "\nID Job: " + idJob +
            "\nDate: " + date +
            "\nSeeker: " + jobseeker.getName() +
            "\nFee: " + totalFee +
            "\nStatus: " + status);
    }
}
