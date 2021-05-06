/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JWork
{
    public static void main (String[] args) {
        //Location location1 = new Location("DKI Jakarta", "Jakarta Utara", "Jakut");
        DatabaseJobseeker.addJobseeker(new Jobseeker(1, "Ailsa", "ailsa.syaffa@ui.ac.id", "ilsacantik22"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(2, "Geraldy", "g.c@ui.ac.id", "wow"));
        DatabaseJobseeker.addJobseeker(new Jobseeker(3, "Alex", "a.lex@ui.ac.id", "akuhebat"));

        DatabaseBonus.addBonus(new Bonus(1, "apaya", 5000, 10000, active));
        }
}
