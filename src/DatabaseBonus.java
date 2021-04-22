
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 4 - Case Study (01/04/2021)
 */
import java.util.ArrayList;
public class DatabaseBonus
{
    /**
     * deklarasi variabel
     */
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase()
    {
        return BONUS_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Bonus getBonusById(int id)
    {
        Bonus tempVar = null;
        for (Bonus bonus: BONUS_DATABASE) {
            if (id == bonus.getId()){
                tempVar = bonus;
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
   public static boolean addBonus(Bonus bonus)
   {
       BONUS_DATABASE.add(bonus);
       lastId = bonus.getId();
       return true;
   }
   
   /**
     * metode removeRecruiter dari DatabaseRecruiter
     * @return false
     */
   public static boolean removeBonus(int id)
   {
       boolean tempBool = true;
       for (Bonus bonus: BONUS_DATABASE) {
           if (id == bonus.getId()){
               BONUS_DATABASE.remove(id);
               tempBool = true;
           }
           else{
               tempBool = false;
           }
       }
       return tempBool;
   }
}
