/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */

public class JWork
{
    public static void main (String[] args)
    {
       Location location1 = new Location("DKI Jakarta", "Jakarta Utara", "Jakut");
       Recruiter recruite1 = new Recruiter(1, "Ailsa Syaffa Dynia", "ailsasyaffa@gmail.com", "081807312314", location1);
       Job job1 = new Job(1, 10000000, "Software Engineer", JobCategory.UI, recruite1);       
       Jobseeker jobseeker1 = new Jobseeker(2, "Elery Queen", "eleryq@gmail.com", "queen&king", "27 Maret 2021");
       Invoice invoice1 = new Invoice(2, 3, 10000000, "27 Maret 2021", jobseeker1, PaymentType.BankPayment, InvoiceStatus.Finished);
       
       job1.printData();
       jobseeker1.printData();
       invoice1.printData();
    }
}
