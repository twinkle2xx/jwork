
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");
    
    private String name;
    
    private PaymentType(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
}
