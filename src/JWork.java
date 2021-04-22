/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JWork
{
    public static void main (String[] args)
    {
        Location location1 = new Location("DKI Jakarta", "Jakarta Utara", "Jakut");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Ailsa", "ailsasyaffa@gmail.com", "081807312314", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ailsa", "ailsa.syaffa@ui.ac.id", "ilsacantik22", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ailsa", "ailsa.syaffa@ui.ac.id", "ilsacantik22", 2021, 04, 23));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Alex", "alex.siapa@ui.ac.id", "alexsander123", 2021, 03, 6));

    }
}
