/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class BonusNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int bonus_error;

    public BonusNotFoundException (int bonus_input) {
        super ("Bonus ID: ");
        bonus_error = bonus_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "not found";
    }
}
