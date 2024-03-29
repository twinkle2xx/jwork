/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class RecruiterNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int recruiter_error;

    /**
     * konstruktor dari class RecruiterNotFoundException
     * @param recruiter_input
     */
    public RecruiterNotFoundException (int recruiter_input) {
        super ("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + recruiter_error + "not found";
    }
}
