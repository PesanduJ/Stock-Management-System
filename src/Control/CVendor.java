package Control;

import Model.MVendor;

public class CVendor {
    
    public void saveVendorData(String vid,String vname,String vphoneno,String vemail,String vaddress)
    {
        MVendor mv = new MVendor();
        mv.saveVendorData(vid,vname,vphoneno,vemail,vaddress);
    }
    
    public void editVendorData(String vid,String vname,String vphoneno,String vemail,String vaddress)
    {
        MVendor mv = new MVendor();
        mv.editVendorData(vid,vname,vphoneno,vemail,vaddress);    
    }

     public void deleteVendorData(String vid)
    {
        MVendor mv = new MVendor();
        mv.deleteVendorData(vid);    
    }

    
}
