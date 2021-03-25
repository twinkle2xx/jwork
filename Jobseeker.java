
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 2 - Case Study (18/03/2021)
 */
public class Jobseeker
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    private String name; //deklarasi variabel String
    private String email; //deklarasi variabel String
    private String password; //deklarasi variabel String
    private String joinDate; //deklarasi variabel String

    /**
     * constructor dari jobseeker
     * @param id dari jobseeker
     * @param nama dari jobseeker
     * @param email dari jobseeker
     * @param password dari jobseeker
     * @param joindate dari jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
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
    public String getJoinDate()
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
        this.email = email;
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
        this.password = password;
    }
    
    /**
    * setter tanggal masuk dari jobseeker
    * @param joindate dari jobseeker
    */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    
    /**
     * menampilkan nama jobseeker 
     */
     public void printData()
    {
        System.out.println("\n====Jobseeker====" +
            "\nID: " + id +
            "\nPencari Kerja: " + name +
            "\nEmail: " + email +
            "\nPassword: " + password +
            "\nTanggal Bergabung: " + joinDate);
    }
}
