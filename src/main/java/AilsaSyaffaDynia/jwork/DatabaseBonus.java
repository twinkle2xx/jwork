
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 4 - Case Study (01/04/2021)
 */

package AilsaSyaffaDynia.jwork;
import java.util.ArrayList;

public class DatabaseBonus
{
    /**
     * deklarasi variabel
     */
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    /**
     * get database bonus
     * @return BONUS_DATABASE
     */
    public static ArrayList<Bonus> getBonusDatabase()
    {
        return BONUS_DATABASE;
    }

    /**
     * get last id
     * @return last id
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Untuk mendapatkan bonus dengan menggunakan id
     * @param id
     * @return x
     * @throws BonusNotFoundException
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException
    {
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getId()== id){
                return BONUS_DATABASE.get(i);
            }
        }
        throw new BonusNotFoundException(id);
    }

    /**
     * Untuk mendapatkan bonus dengan menggunakan referral code
     * @param referralCode
     */
    public static Bonus getBonusByReferralCode(String referralCode) {
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getReferralCode()== referralCode){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * Untuk menambahkan bonus
     * @param bonus
     * @return boolean
     * @throws ReferralCodeAlreadyExistsException
     */
   public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException
   {
       for (Bonus bonus1 : BONUS_DATABASE)
       {
           if (bonus1.getReferralCode() == bonus.getReferralCode())
           {
               throw new ReferralCodeAlreadyExistsException(bonus);
           }
       }
       BONUS_DATABASE.add(bonus);
       lastId = bonus.getId();
       return true;
   }

    /**
     * Untuk remove bonus
     * @param id
     * @return boolean
     * @throws BonusNotFoundException
     */
    public static boolean activeBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Untuk melakukan aktivasi terhadap bonus yang ada
     * @param id
     * @return boolean
     */
    public static boolean deactivateBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }

   /**
     * metode removeRecruiter dari DatabaseRecruiter
     * @return false
     */
   public static boolean removeBonus(int id) throws BonusNotFoundException
   {
       for (int i=0; i < BONUS_DATABASE.size(); i++) {
           if(BONUS_DATABASE.get(i).getId() == id) {
               BONUS_DATABASE.remove(i);
               return true;
           }
       }
       throw new BonusNotFoundException(id);
   }
}
