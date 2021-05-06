/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

public class JobSeekerNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int jobseeker_error;

    public JobSeekerNotFoundException (int jobseeker_input) {
        super ("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error + "not found";
    }

}
