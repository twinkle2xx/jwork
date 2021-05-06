
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

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException
    {
        for (int i=0; i < RECRUITER_DATABASE.size(); i++) {
            if(RECRUITER_DATABASE.get(i).getId()== id){
                return RECRUITER_DATABASE.get(i);
            }
        }
        throw new RecruiterNotFoundException(id);
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
   public static boolean removeRecruiter(int id) throws RecruiterNotFoundException
   {
       for (int i=0; i < RECRUITER_DATABASE.size(); i++) {
           if(RECRUITER_DATABASE.get(i).getId() == id) {
               RECRUITER_DATABASE.remove(i);
               return true;
           }
       }
       throw new RecruiterNotFoundException(id);
   }

}

