/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class JobSeekerNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int jobseeker_error;

    /**
     * Konstruktor dari class JobSeekerNotFoundException
     * @param jobseeker_input
     */
    public JobSeekerNotFoundException (int jobseeker_input) {
        super ("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error + "not found";
    }

}
