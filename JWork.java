/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */

public class JWork
{
    public static void main (String[] args)
    {
       Location location1 = new Location ("DKI Jakarta", "Jakarta Utara", "Jakut");
       Recruiter recruite1 = new Recruiter(99, "Ailsa Syaffa Dynia", "ailsasyaffa@gmail.com", "081807312314", location1);
       Jobseeker jobseeker1 = new Jobseeker(9, "Elery Queen", "eleryq@gmail.com", "queen&king", "27 Maret 2021");
       Job job1 = new Job(1, 500000, "Software Engineer", JobCategory.UI, recruite1);   
       //Job job2 = new Job(2, 100000000, "Software Engineer", JobCategory.UI, recruite1);   
       //Bonus bonus1 =  new Bonus(9, null, 20000, 20000, true);
       //Bonus bonus2 =  new Bonus(10, "ilsacantikbanget", 20000, 500000, true);
       //Bonus bonus3 =  new Bonus(11, "ilsaanakcantik", 50000, 50000, true);
       BankPayment payment1 = new BankPayment(22, job1, "3 April 2021", jobseeker1, InvoiceStatus.Finished);
       BankPayment payment2 = new BankPayment(23, job1, "3 April 2021", jobseeker1, 200000, InvoiceStatus.Finished);
       //EwalletPayment payment3 = new EwalletPayment(24, job1, "3 April 2021", jobseeker1, bonus3, InvoiceStatus.Finished);
       
       payment1.setTotalFee();
       payment2.setTotalFee();
       
       payment1.printData();
       payment2.printData();
       
    }
}
