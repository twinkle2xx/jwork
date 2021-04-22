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
        arrJS.add(new EwalletPayment(12, "SE", jobseeker, invoiceStatus));
        arrJS.add(new BankPayment(22, "SE", jobseeker, invoiceStatus));
        
        arrJS.forEach((js) -> {System.out.println(js.toString());});
    
    }
}
