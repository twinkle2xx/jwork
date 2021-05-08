/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

public class ReferralCodeAlreadyExistsException extends Exception{

    /**
     deklarasi variabel
     */
    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException (Bonus referral_input) {
        super ("Referral Code: ");
        referral_error = referral_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + referral_error + "not found";
    }
}
