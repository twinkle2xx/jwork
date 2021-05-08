/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

public class BonusNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int bonus_error;

    public BonusNotFoundException (int bonus_input) {
        super ("Bonus ID: ");
        bonus_error = bonus_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "not found";
    }
}
