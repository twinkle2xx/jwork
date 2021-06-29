/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */

package AilsaSyaffaDynia.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {
    public static void main(String[] args) {
        Location l1= new Location("DKI Jakarta", "Jakarta Utara", "Jakut");
        Location l2= new Location("Jawa Barat", "Depok", "Hehe");
        Location l3= new Location("Sumatra Utara", "Medan", "Horas");

        DatabaseRecruiter.addRecruiter(new Recruiter(1,"Ailsa","ail@gmail.com","081234567890",l1));
        DatabaseRecruiter.addRecruiter(new Recruiter(2,"Alex","lex@gmail.com","081234567890",l2));
        DatabaseRecruiter.addRecruiter(new Recruiter(3,"Elery","ele@gmail.com","081234567890",l3));

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, 900000, "Engineer", JobCategory.Devops, DatabaseRecruiter.getRecruiterById(1)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, 900000, "Apakek", JobCategory.Devops, DatabaseRecruiter.getRecruiterById(2)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,900000, "Dokter", JobCategory.UI, DatabaseRecruiter.getRecruiterById(3)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

            try{
                DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, 900000, "Dosen", JobCategory.UX, DatabaseRecruiter.getRecruiterById(3)));
            }catch(RecruiterNotFoundException e){
                System.out.println(e.getMessage());
            }

        SpringApplication.run(JWork.class, args);
    }

}
