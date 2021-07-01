/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class ReferralCodeAlreadyExistsException extends Exception{

    /**
     deklarasi variabel
     */
    private Bonus referral_error;

    /**
     * Konstruktor dari class ReferralCodeAlreadyExistException
     * @param referral_input
     */
    public ReferralCodeAlreadyExistsException (Bonus referral_input) {
        super ("Referral Code: ");
        referral_error = referral_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + referral_error + "not found";
    }
}
