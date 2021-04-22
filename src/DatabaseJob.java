
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */
import java.util.ArrayList;
public class DatabaseJob
{
    /**
     * deklarasi variabel
     */
   private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
   private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Job getJobById(int id)
    {
        Job tempVar = null;
        for (Job job: JOB_DATABASE) {
            if (id == job.getId()){
                tempVar = job;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

   /**
     * metode addJob dari DatabaseJob
     * @return false
     */
   public static boolean addJob(Job job)
   {
       JOB_DATABASE.add(job);
       lastId = job.getId();
       return true;
   }
   
   /**
     * metode Removejob dari DatabaseJob
     * @return false
     */
   public static boolean removeJob(int id)
   {
       boolean tempBool = true;
       for (Job job: JOB_DATABASE) {
           if (id == job.getId()){
               JOB_DATABASE.remove(id);
               tempBool = true;
           }
           else{
               tempBool = false;
           }
       }
       return tempBool;
   }
    
   /**
     * getter job dari databasejob
     * @return null
     */
   public static Job getJob()
   {
       return null;
   }
}
   


