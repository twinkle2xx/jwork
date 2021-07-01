/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Post Test (08/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class InvoiceNotFoundException extends Exception{

    /**
     deklarasi variabel
     */
    private int invoice_error;

    /**
     * Konstruktor class InvoiceNotFoundException
     * @param invoice_input
     */
    public InvoiceNotFoundException (int invoice_input) {
        super ("Recruiter ID: ");
        invoice_error = invoice_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error + "not found";
    }

}
