
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    
    public String getProvince()
    {
        return this.province;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void printData(){}
}
