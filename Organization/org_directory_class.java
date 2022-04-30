/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Organization.org_class.Type;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class org_directory_class {
     private ArrayList<org_class> OrgList;
     
      public org_directory_class() {
        OrgList = new ArrayList();
    }

    public ArrayList<org_class> getOrgList() {
        return OrgList;
    }
     
 public  org_class CreateOrg(Type type){
        org_class org_class = null;
     
        if (type.getValue().equals(Type.Doctor.getValue())){
            org_class = new Doctor_org_class();
            OrgList.add(org_class);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            org_class=new Lab_org_class();
            OrgList.add(org_class);
        }
        
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            org_class=new Pharmacy_org_class();
            OrgList.add(org_class);
        }
        
        else if (type.getValue().equals(Type.Drug.getValue())){
            org_class=new drug_org_class();
            OrgList.add(org_class);
        }
        
        else if (type.getValue().equals(Type.Chemical.getValue())){
            org_class=new chemical_org_class();
            OrgList.add(org_class);
        }
        return org_class;
    }
        
        
        
}
