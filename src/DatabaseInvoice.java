/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 3 - Case Study (25/03/2021)
 */
import java.util.ArrayList;

public class DatabaseInvoice {
    /**
     * deklarasi variabel
     */
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id)
    {
        Invoice tempVar = null;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                tempVar = invoice;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

    /**
     * metode addInvoice dari DatabaseInvoice
     * @return false
     */
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * metode removeInvoice dari DatabaseInvoice
     * @return false
     */
    public static boolean removeInvoice(int id)
    {
        boolean tempBool = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }

}
