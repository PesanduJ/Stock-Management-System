package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class MProduct {
    
    
    //To insert product data into table product
    public void saveProductData(String pid,String pname,String pdesc,String pcode,int costprice,int retailprice,int qty,int reordlvl)
    {     
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("insert into product(product_id,product_name,description,barcode,cost_price,retail_price,quantity,reorder_level) "
                    + "values('"+pid+"','"+pname+"','"+pdesc+"','"+pcode+"','"+costprice+"','"+retailprice+"','"+qty+"','"+reordlvl+"')");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Product Added!");
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
    
    
    //To edit product data in table product
    public void editProductData(String pid,String pname,String pdesc,String pcode,int costprice,int retailprice,int qty,int reordlvl)
    {
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("update product set product_name='"+pname+"', description='"+pdesc+"', barcode='"+pcode+"', cost_price='"+costprice+"', retail_price='"+retailprice+"', quantity='"+qty+"', reorder_level='"+reordlvl+"' where product_id='"+pid+"' ");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Product Updated!");
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
    
    
    //To delete product data in table product
    public void deleteProductData(String pid)
    {
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("delete from product where product_id='"+pid+"' ");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Product Deleted!");
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
