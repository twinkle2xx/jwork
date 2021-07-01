/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class EmailAlreadyExistsException extends Exception{

    /**
     deklarasi variabel
     */
    private Jobseeker jobseeker_error;

    /**
     * Konstruktor untuk class EmailAlreadyExistException
     * @param jobseeker_input
     */
    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage(){
        return super.getMessage() + jobseeker_error.getEmail() + "already exists.";
    }
}
