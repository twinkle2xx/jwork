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
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId()== id){
                return INVOICE_DATABASE.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<>();
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getJobseeker().getId() == jobseekerId){
                temp.add(INVOICE_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    /**
     * metode addInvoice dari DatabaseInvoice
     * @return false
     */
    public static boolean addInvoice(Invoice invoice)
    {
        for (Invoice listInvoice : INVOICE_DATABASE) {
            if(invoice.getJobseeker().equals(listInvoice.getJobseeker()) && invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * metode removeInvoice dari DatabaseInvoice
     * @return false
     */
    public static boolean removeInvoice(int id)
    {
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

}
