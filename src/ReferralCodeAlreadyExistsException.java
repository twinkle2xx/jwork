/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

public class ReferralCodeAlreadyExistsException extends Exception{

    /**
     deklarasi variabel
     */
    private int referral_error;

    public ReferralCodeAlreadyExistsException (int referral_input) {
        super ("Bonus ID: ");
        referral_error = referral_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + referral_error + "not found";
    }
}
