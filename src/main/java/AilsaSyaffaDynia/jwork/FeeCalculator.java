/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 7 - Post Test (08/05/2021)
 */

package AilsaSyaffaDynia.jwork;
import java.util.ArrayList;

public class FeeCalculator implements Runnable{

    public void run(){
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list){
            System.out.println("calculating invoice id: "+ i.getId());
            i.setTotalFee();
            System.out.println("finished calculating invoice id: "+ i.getId());

        }

    }
}
