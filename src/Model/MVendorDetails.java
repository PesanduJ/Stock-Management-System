package Model;


import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class MVendorDetails {
    
    public ResultSet searchAllVendors(){
        ResultSet rs = null;
        try{
            DatabaseConnection con = new DatabaseConnection();
            Statement st = con.createDbConnection().createStatement();
            rs = st.executeQuery("select * from vendor");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public ResultSet selectVendor(){
        ResultSet rs = null;
        try{
            DatabaseConnection con = new DatabaseConnection();
            Statement st = con.createDbConnection().createStatement();
            rs = st.executeQuery("select distinct vendor_name from vendor");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }

    
    
    
    
    
    
    
}
