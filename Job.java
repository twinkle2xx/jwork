
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 2 - Case Study (18/03/2021)
 */
public class Job
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    private int fee; //deklarasi variabel int
    private String name;//deklarasi variabel String
    private String category;//deklarasi variabel String
    
    public Recruiter recruiter;
    
    /**
     * constructor dari job
     * @param id dari job
     * @param nama dari job
     * @param perekrut dari recruiter
     * @param fee dari job
     * @param kategori dari job
     */
    public Job(int id, int fee, String name, String category, Recruiter recruiter)
    {
        this.id = id;
        this.fee = fee;
        this.name = name;
        this.category = category;
        this.recruiter = recruiter;
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
    * getter fee jobseeker
    * @return fee jobseeker
    */
   public int getFee()
    {
        return fee;
    }
    
    /**
    * getter nama jobseeker
    * @return name jobseeker
    */
   public String getName()
    {
        return name;
    }

    /**
    * getter kategori jobseeker
    * @return category jobseeker
    */
   public String getCategory()
    {
        return category;
    }
    
    /**
    * setter rekruiter dari recruiter
    * @param recruiter dari recruiter
    */
   public Recruiter getRecruiter()
    {
        return recruiter;
    }
    
    /**
    * setter id invoice
    * @param id invoice
    */    
   public void setId(int id)
    {
        this.id = id;
    }
    
    /**
    * setter nama invoice
    * @param name invoice
    */
   public void setName(String name)
    {
        this.name = name;
    }
    
    /**
    * setter kategori invoice
    * @param category invoice
    */
   public void setCategory(String category)
    {
        this.category = category;
    }
    
    /**
    * setter fee invoice
    * @param fee invoice
    */
   public void setFee(int fee)
    {
        this.fee = fee;
    }
    
    /**
    * setter rekruiter invoice
    * @param recruiter invoice
    */
   public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }
    
    /**
     * Menampilkan nama pekerjaan
     */
    public void printData()
    {
        System.out.println("Pekerjaan" + getName());
    }
}
