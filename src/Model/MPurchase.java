
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MPurchase {
    
    public void savePurchaseData(String code, String vendor, String date, String subtotal, String payment, String balance)
    {     
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("insert into purchase(product_code,vendor_name,purchase_date,sub_total,payment,balance) "
                    + "values('"+code+"','"+vendor+"','"+date+"','"+subtotal+"','"+payment+"','"+balance+"')");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Purchase Details Stored!");
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
