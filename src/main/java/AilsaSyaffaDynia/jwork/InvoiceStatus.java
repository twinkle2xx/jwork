
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */

package AilsaSyaffaDynia.jwork;
public enum InvoiceStatus
{
    OnGoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String name;
    
    private InvoiceStatus(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
}
