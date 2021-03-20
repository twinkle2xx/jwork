
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 2 - Case Study (18/03/2021)
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

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param idJob dari invoice
     * @param date dari invoice
     * @param totalfee dari invoice
     * @param jobseeker dari jobseeker
     */
    public Invoice(int id, int idJob, int totalFee, String date, Jobseeker jobseeker)
    {
       this.id = id;
       this.idJob = idJob;
       this.totalFee = totalFee;
       this.date = date;
       this.jobseeker = jobseeker;
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
    * getter jobseeker dari jobseeker
    * @return jobseeker dari jobseeker
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
     * Menampilkan jumla harga
     */
    public void printData()
    {
        System.out.println("Jumlah Harga" + getTotalFee());
    }
}
