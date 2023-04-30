package Control;

import Model.MRegistration;


public class CRegistration {
    
    public void saveEmployeeData(String fname, String lname, String email ,String gender, String dob, String pass)
    {
        MRegistration mp = new MRegistration();
        mp.saveEmployeeData( fname, lname, email, gender, dob, pass);
    }
    
}
