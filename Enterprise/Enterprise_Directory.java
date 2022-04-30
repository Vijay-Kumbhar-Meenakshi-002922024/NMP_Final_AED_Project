/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;
import Organization.org_directory_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Enterprise_Directory {
    
    private ArrayList<Enterprise_class> enterpriseList;

    public ArrayList<Enterprise_class> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise_class> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
     public Enterprise_Directory(){
        enterpriseList=new ArrayList<Enterprise_class>();
    }
   
     
     public Enterprise_class createAndAddEnterprise(String name,Enterprise_class.EnterpriseType type){
        Enterprise_class enterprise_class=null;
      
      if(type==Enterprise_class.EnterpriseType.Hospital){
            enterprise_class=new Hospital_Enterprise_class(name);
            enterpriseList.add(enterprise_class);
     
      }
         else if (type==Enterprise_class.EnterpriseType.Pharmacy){
            enterprise_class= new Pharmacy_Enterprise_class(name);
            enterpriseList.add(enterprise_class);
        }
        
        else if (type==Enterprise_class.EnterpriseType.Drug){
            enterprise_class=new Drug_Enterprise_class(name);
            enterpriseList.add(enterprise_class);
        }
        else if (type==Enterprise_class.EnterpriseType.Chemical){
                
            enterprise_class=new Chemical_Enterprise_class(name);
            enterpriseList.add(enterprise_class);
           
        }
        return enterprise_class;
     
     }
}
