package Model;

import View.LoginForm;
import View.RegistrationForm;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MRegistration {
    
    public void saveEmployeeData( String fname, String lname, String email , String gender, String dob, String pass)
    {     
        DatabaseConnection con = new DatabaseConnection();
        
        try{
            Statement st = con.createDbConnection().createStatement();
            int count = st.executeUpdate("insert into employee(first_name,last_name,email,gender,dob,password) values('"+fname+"','"+lname+"','"+email+"','"+gender+"','"+dob+"','"+pass+"')");
            
            
            if(count>0){
            JOptionPane.showMessageDialog(null, "Employee Added!");
            
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            RegistrationForm rf = new RegistrationForm();
            rf.hide();
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
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
}
