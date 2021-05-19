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

    public InvoiceNotFoundException (int invoice_input) {
        super ("Recruiter ID: ");
        invoice_error = invoice_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error + "not found";
    }

}
