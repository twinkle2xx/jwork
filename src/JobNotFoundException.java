/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Case Study (06/05/2021)
 */

public class JobNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int job_error;

    public JobNotFoundException (int job_input) {
        super ("Job ID: ");
        job_error = job_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + job_error + "not found";
    }
}
