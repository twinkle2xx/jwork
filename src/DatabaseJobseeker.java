
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */
import java.util.ArrayList;
public class DatabaseJobseeker
{
    /**
     * deklarasi variabel
     */
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getJobseekerDatabase()
    {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id)
    {
        Jobseeker tempVar = null;
        for (Jobseeker jobseeker: JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()){
                tempVar = jobseeker;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }
         
   /**
     * metode addJobseeker dari DatabaseJobseeker
     * @return false
     */
   public static boolean addJobseeker(Jobseeker jobseeker)
   {
       JOBSEEKER_DATABASE.add(jobseeker);
       lastId = jobseeker.getId();
       return true;
   }
   
   /**
     * metode removeJobseeker dari DatabaseJobseeker
     * @return false
     */
   public static boolean removeJobseeker(int id)
   {
       boolean tempBool = true;
       for (Jobseeker jobseeker: JOBSEEKER_DATABASE) {
           if (id == jobseeker.getId()){
               JOBSEEKER_DATABASE.remove(id);
               tempBool = true;
           }
           else{
               tempBool = false;
           }
       }
       return tempBool;
   }

}
