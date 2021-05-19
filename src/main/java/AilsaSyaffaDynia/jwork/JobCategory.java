    
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */

package AilsaSyaffaDynia.jwork;
public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("User Interface"),
    UX("User Experience"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst"),;
    
    private String name;
    
    private JobCategory(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
}
