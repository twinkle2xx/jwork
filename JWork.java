/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 2 - Case Study (18/03/2021)
 */

public class JWork
{
    public static void main (String[] args)
    {
        Location location1 = new Location("DKI Jakarta", "Jakarta Utara", "Jakut");
        Recruiter recruite1 = new Recruiter(1, "AlexGroup", "group@alex.com", "081234567890", location1);
        Job job1 = new Job(1, 10000000, "Architect", "Interior", recruite1);
        Jobseeker jobseeker1 = new Jobseeker(1 ,"Elery Queen", "eleryq@gmail.com", "queennking", "20 Maret 2021");
        Invoice invoice1 = new Invoice(1,12,50000000, "20 Maret 2021", jobseeker1);
        
    location1.setProvince("DKI Jakarta");
    recruite1.setName("AlexGroup");
    job1.setFee(10000000);
    jobseeker1.setName("Ailsa Syaffa Dynia");
    invoice1.setTotalFee(50000000);

    }
}
