package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class MVendor {
    
    //To insert vendor data into table vendor
    public void saveVendorData(String vid,String vname,String vphoneno,String vemail,String vaddress)
    {     
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("insert into vendor(vendor_id,vendor_name,phoneno,email,address) values('"+vid+"','"+vname+"','"+vphoneno+"','"+vemail+"','"+vaddress+"')");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Vendor Added!");
            }
            
            else{
            JOptionPane.showMessageDialog(null, "Error occured!");
            }
        }
        
        catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
    }
    
    
    
    //To edit vendor data in table vendor
    public void editVendorData(String vid,String vname,String vphoneno,String vemail,String vaddress)
    {
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("update vendor set vendor_name='"+vname+"', phoneno='"+vphoneno+"', email='"+vemail+"', address='"+vaddress+"' where vendor_id='"+vid+"' ");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Vendor Updated!");
            }
            
            else{
            JOptionPane.showMessageDialog(null, "Error occured!");
            }
        }
        
        catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //To delete vendor data in table vendor
    public void deleteVendorData(String vid)
    {
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("delete from vendor where vendor_id='"+vid+"' ");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Vendor Deleted!");
            }
            
            else{
            JOptionPane.showMessageDialog(null, "Error occured!");
            }
        }
        
        catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }   
}

