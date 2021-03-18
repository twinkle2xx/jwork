
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private int id;
    private int idJob;
    private int totalFee;
    private String date;

    public Invoice(int id, int idJob, int totalFee, String date)
    {
       this.id = id;
       this.idJob = idJob;
       this.totalFee = totalFee;
       this.date = date;
    }

    public int getId()
    {
        return 0;
    }
    
    public int getJob()
    {
        return 0;
    }
    
    public String getDate()
    {
        return "oop";
    }
    
    public int getTotalFee()
    {
        return 0;
    }
    
    public void setId(int id)
    {}
    
    public void setIdJobs(int idJobs)
    {}
    
    public void setDate(String date)
    {}
    
    public void setTotalFee(int totalFee)
    {}
}
