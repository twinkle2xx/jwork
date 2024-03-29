
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */

package AilsaSyaffaDynia.jwork;
import java.util.ArrayList;
public class DatabaseJob
{
    /**
     * deklarasi variabel
     */
   private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
   private static int lastId = 0;

    /**
     * method ini digunakan untuk mengambil data job
     * @return JOB_DATABASE
     */
    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    /**
     * get last id
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * method ini digunakan untuk mengambil data job menggunakan id
     * @param id
     * @throws JobNotFoundException
     */public static Job getJobById(int id) throws JobNotFoundException
    {
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getId() == id){
                return JOB_DATABASE.get(i);
            }
        }
        throw new JobNotFoundException(id);
    }

    /**
     * Untuk mendapatkan job dengan menggunakan recruiter
     * @param recruiterId
     * @return temp
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    /**
     * Untuk mendapatkan job dengan menggunakan kategori
     * @param category
     * @return temp
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getCategory() == category){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
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
   public static boolean removeJob(int id) throws JobNotFoundException
   {
       for (int i=0; i < JOB_DATABASE.size(); i++) {
           if(JOB_DATABASE.get(i).getId() == id) {
               JOB_DATABASE.remove(i);
               return true;
           }
       }
       throw new JobNotFoundException(id);
   }
}
   


