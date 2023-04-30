package Control;

import Model.MProduct;

public class CProduct {
    
    public void saveProductData(String pid,String pname,String pdesc,String pcode,int costprice,int retailprice,int qty,int reordlvl)
    {
        MProduct mp = new MProduct();
        mp.saveProductData(pid, pname, pdesc, pcode, costprice, retailprice, qty, reordlvl);
    }
    
    public void editProductData(String pid,String pname,String pdesc,String pcode,int costprice,int retailprice,int qty,int reordlvl)
    {
        MProduct mp = new MProduct();
        mp.editProductData(pid, pname, pdesc, pcode, costprice, retailprice, qty, reordlvl);    
    }

     public void deleteProductData(String pid)
    {
        MProduct mp = new MProduct();
        mp.deleteProductData(pid);    
    }

   


     

}
