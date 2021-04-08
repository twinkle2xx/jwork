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
       Calendar cal = new GregorianCalendar(2021, 4, 8);

        ArrayList<Jobseeker> arrJS = new ArrayList<Jobseeker>();
        arrJS.add(new Jobseeker(1, "Elery", ".eleryq@gmail.com", "lala", cal));
        arrJS.add(new Jobseeker(1, "Ailsa", "ailsasyaffa@gmail.com", "ilsaCantik22", 2021, 4, 8));
        arrJS.add(new Jobseeker(1, "Alex", "demialek.x@gmail.com", "alexganteng12"));

        arrJS.forEach((js) -> { System.out.println(js.toString()); });

        Jobseeker jsChange = arrJS.get(0);
        jsChange.setEmail("eleryq@gmail.com");
        jsChange.setPassword("Bismillah123");
        System.out.println(jsChange.toString());
       
    }
}
