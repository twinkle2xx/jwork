
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */

package AilsaSyaffaDynia.jwork;
import java.util.ArrayList;
public class DatabaseJobseeker
{
    /**
     * deklarasi variabel
     */
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    /**
     * Get jobseeker database
     * @return JOBSEEKER_DATABASE
     */
    public static ArrayList<Jobseeker> getJobseekerDatabase()
    {
        return JOBSEEKER_DATABASE;
    }

    /**
     * Get last id
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Untuk mendapatkan jobseeker dengan menggunakan id
     * @param id
     * @return temp
     * @throws JobSeekerNotFoundException
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException
    {
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId()== id){
                return JOBSEEKER_DATABASE.get(i);
            }
        }
        throw new JobSeekerNotFoundException(id);
    }
         
   /**
     * metode addJobseeker dari DatabaseJobseeker
     * @return false
     */
   public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException
   {
       for (Jobseeker buff: JOBSEEKER_DATABASE) {
           if (jobseeker.getEmail().equals(buff.getEmail())) {
               throw new EmailAlreadyExistsException(jobseeker);
           }
       }
       JOBSEEKER_DATABASE.add(jobseeker);
       lastId = jobseeker.getId();
       return true;
   }
   
   /**
     * metode removeJobseeker dari DatabaseJobseeker
     * @return false
     */
   public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException
   {
       for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
           if(JOBSEEKER_DATABASE.get(i).getId() == id) {
               JOBSEEKER_DATABASE.remove(i);
               return true;
           }
       }
       throw new JobSeekerNotFoundException(id);
   }

    /**
     * Untuk mendaptkan parameter login dari jobseeker
     * @param email
     * @param password
     * @return jobseeker
     */
    public static Jobseeker jobseekerLogin(String email, String password)
    {
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++)
            if (JOBSEEKER_DATABASE.get(i).getEmail().equals(email) &&
                JOBSEEKER_DATABASE.get(i).getPassword().equals(password))
                return JOBSEEKER_DATABASE.get(i); 
        return null;
    }
}
