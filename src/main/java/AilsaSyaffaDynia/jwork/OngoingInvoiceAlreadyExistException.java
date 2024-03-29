/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Post Test (08/05/2021)
 */

package AilsaSyaffaDynia.jwork;
public class OngoingInvoiceAlreadyExistException extends Exception{

    /**
     deklarasi variabel
     */
    private Invoice invoice_error;

    /**
     * Konstruktor dari class OngoingInvoiceAlreadyExistException
     * @param invoice_input
     */
    public OngoingInvoiceAlreadyExistException(Invoice invoice_input){
        super("Ongoing Invoice");
        invoice_error = invoice_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage(){
        return super.getMessage() + invoice_error.getId() + "already exists.";
    }
}
