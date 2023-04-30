package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DatabaseConnection {
    
    private Connection con;
  
  public Connection createDbConnection()
  {
      try
      {
          String mydbpath="jdbc:mysql://localhost/stock-management-system";
          con = DriverManager.getConnection(mydbpath,"root","");
      }
      
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e.getMessage());
      }
      
      return con;
    
  }

    PreparedStatement prepareStatement(String insert_into_vendorvnamevphonenovemailvadd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }
