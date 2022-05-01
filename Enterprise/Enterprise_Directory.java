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

     
     }
}
