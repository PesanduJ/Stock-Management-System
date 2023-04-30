package Control;

import Model.MVendorDetails;
import java.sql.ResultSet;


public class CVendorDetails {
    
    public ResultSet searchAllVendors(){
        ResultSet rs;
        MVendorDetails mvd = new MVendorDetails();
        rs =  mvd.searchAllVendors();
        return rs;
    }
    
    public ResultSet selectVendor(){
        
        ResultSet rs;
        MVendorDetails mvd = new MVendorDetails();
        rs = mvd.selectVendor();
        return rs;
    }
}
