
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 4 - Case Study (01/04/2021)
 */
import java.util.ArrayList;

public class DatabaseRecruiter
{
    /**
     * deklarasi variabel
     */
   private static final ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
   private static int lastId=0;
        
   public static ArrayList<Recruiter> getRecruiterDatabase()
   {
       return RECRUITER_DATABASE;
   }

   public static int getLastId()
   {
       return lastId;
   }

    public static Recruiter getRecruiterById(int id){
        Recruiter tempVar = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                tempVar = recruiter;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

   /**
     * metode addRecruiter dari DatabaseRecruiter
     * @return false
     */
   public static boolean addRecruiter(Recruiter recruiter)
   {
       RECRUITER_DATABASE.add(recruiter);
       lastId = recruiter.getId();
       return true;
   }
   
   /**
     * metode removeRecruiter dari DatabaseRecruiter
     * @return false
     */
   public static boolean removeRecruiter(int id)
   {
       boolean tempBool = true;
       for (Recruiter recruiter: RECRUITER_DATABASE) {
           if (id == recruiter.getId()){
               RECRUITER_DATABASE.remove(id);
               tempBool = true;
           }
           else{
               tempBool = false;
           }
       }
       return tempBool;
   }

}

