
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */

package AilsaSyaffaDynia.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Jobseeker
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    private String name; //deklarasi variabel String
    private String email; //deklarasi variabel String
    private String password; //deklarasi variabel String
    public Calendar joinDate; //deklarasi variabel String

    /**
     * constructor dari jobseeker
     * @param id dari jobseeker
     * @param name dari jobseeker
     * @param email dari jobseeker
     * @param password dari jobseeker
     * @param joinDate dari jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = joinDate;
    }

    /**
     * constructor dari jobseeker
     * @param id dari jobseeker
     * @param name dari jobseeker
     * @param email dari jobseeker
     * @param password dari jobseeker
     * @param year
     * @param month
     * @param dayOfMonth
     */
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year, month, dayOfMonth);
    }

    /**
     * Konstruktor Jobseeker tanpa adanya date
     * @param id
     * @param name
     * @param email
     * @param password
     */
    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = new GregorianCalendar();
    }
           
    /**
    * getter id dari jobseeker
    * @return id dari jobseeker
    */
    public int getId()
    {
        return id;
    }
  
    /**
    * getter nama dari jobseeker
    * @return name dari jobseeker
    */
    public String getName()
    {
        return name;
    }

    /**
    * getter email dari jobseeker
    * @return email dari jobseeker
    */
    public String getEmail()
    {
        return email;
    }

    /**
    * getter password dari jobseeker
    * @return password dari jobseeker
    */
    public String getPassword()
    {
        return password;
    }

    /**
    * getter tanggal masuk dari jobseeker
    * @return joindate dari jobseeker
    */
   public Calendar getJoinDate()
    {
        return joinDate;
    }

    /**
    * setter id dari jobseeker
    * @param id dari jobseeker
    */
   public void setId(int id)
    {
        this.id = id;
    }
    
    /**
    * setter email dari jobseeker
    * @param email dari jobseeker
    */
   public void setEmail(String email)
    {
        Pattern pat = Pattern.compile("^(?!.*([.])\\1)[^.-][a-zA-Z0-9.&*_~]+@[^-. ][a-zA-Z0-9-.&*_~]+(?:\\.[a-zA-Z0-9-]+)*");
        Matcher mat = pat.matcher(email);
        this.email = mat.matches() ? email : "";
    }
    
    /**
    * setter nama dari jobseeker
    * @param name dari jobseeker
    */
   public void setName(String name)
    {
        this.name = name;
    }
    
    /**
    * setter password dari jobseeker
    * @param password dari jobseeker
    */
   public void setPassword(String password)
    {
        Pattern pat = Pattern.compile("^(?=.{6,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$");
        Matcher mat = pat.matcher(password);
        this.password = mat.matches() ? password : "";
    }
    
    /**
    * setter tanggal masuk dari jobseeker
    * @param joindate dari jobseeker
    */
   public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    
    /**
    * setter tanggal masuk dari jobseeker
    * @param joinDate dari jobseeker
    */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    /**
     * menampilkan hasil 
     */
     public String toString()
    {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = dataFormat.format(joinDate);
        return"\n====Jobseeker====" +
            "\nID: " + id +
            "\nName: " + name +
            "\nEmail: " + email +
            "\nPassword: " + password +
            "\nJoin Date: " + strDate;
    }
}
