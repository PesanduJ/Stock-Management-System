package Control;

import Model.MProductDetails;
import java.sql.ResultSet;


public class CProductDetails {
    
    public ResultSet searchAllProducts(){
        ResultSet rs;
        MProductDetails mpd = new MProductDetails();
        rs =  mpd.searchAllProducts();
        return rs;
    }
    
    public ResultSet searchByName(String barcode){
        ResultSet rs;
        MProductDetails mpd = new MProductDetails();
        rs =  mpd.searchByName(barcode);
        return rs;
    }
}
