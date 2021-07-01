
/**
 * @author: Ailsa Syaffa Dynia
 * @version: Modul 5 - Case Study (08/04/2021)
 */

package AilsaSyaffaDynia.jwork;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EwalletPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Konstruktor dari class EwalletPayment, tanpa menggunakan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    /**
     * Konstruktor dari class EwalletPayment, dengan tambahan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     * @param bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus)
    {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    /**
     * Untuk mendaptkan tipe pembayaran
     * @return PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * Untuk mendapatkan bonus
     * @return bonus
     */
    public Bonus getBonus()
    {
        return bonus;
    }

    /**
     * Set bonus
     * @param bonus
     */
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }

    /**
     * Untuk set total fee yang ada
     */
    @Override
    public void setTotalFee()
    {
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }

    /**
     * to String
     */
    @Override
    public String toString() {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(date);
        }
        String str = "====== Ewallet Payment ======" +
                "\nID : " + getId() +
                "\nJobs : " + getJobs() +
                "\nDate : " + strDate +
                "\nSeeker : " + getJobseeker().getName();

        if (bonus.getReferralCode() != null &&
                bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            str += "\nReferral Code: " + bonus.getReferralCode();
        }
        str += "\nFee : " + totalFee +
                "\nStatus: " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}
