package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MProductDetails {
     
    public ResultSet searchAllProducts(){
        ResultSet rs = null;
        try{
            DatabaseConnection con = new DatabaseConnection();
            Statement st = con.createDbConnection().createStatement();
            
            rs = st.executeQuery("select * from product");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    
    public ResultSet searchByName(String pid){
        
        ResultSet rs = null;
        try{
            DatabaseConnection con = new DatabaseConnection();
            Statement st = con.createDbConnection().createStatement();
            
            rs = st.executeQuery("select * from product where product_id='"+pid+"' ");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        return rs; 
    }
    
}
