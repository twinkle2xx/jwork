/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

public class EmailAlreadyExistsException extends Exception{

    /**
     deklarasi variabel
     */
    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage(){
        return super.getMessage() + jobseeker_error.getEmail() + "already exists.";
    }
}
