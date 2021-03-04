
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private int id, idJob, totalFee;
    private String date;

    public Invoice(int id, int idJob, int totalFee, String date)
    {
       this.id = id;
       this.idJob = idJob;
       this.totalFee = totalFee;
       this.date = date;
    }

    int getId () {
        return 0;
    }
    
    int getJob () {
        return 0;
    }
    
    String getDate () {
        return "oop";
    }
    
    int getTotalFee () {
        return 0;
    }
       
}
