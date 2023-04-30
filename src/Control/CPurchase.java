
package Control;

import Model.MPurchase;


public class CPurchase {
    
    public void savePurchaseData(String code, String vendor, String date,String subtotal,String payment,String balance)
    {
        MPurchase mp = new MPurchase();
        mp.savePurchaseData(code, vendor, date, subtotal, payment, balance);
    }
}
