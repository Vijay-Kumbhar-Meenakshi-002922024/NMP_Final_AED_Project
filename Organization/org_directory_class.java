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
        org_class org = null;
     
        if (type.getValue().equals(Type.Doctor.getValue())){
            org = new Doctor_org_class();
            OrgList.add(org);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            org=new Lab_org_class();
            OrgList.add(org);
        }
        
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            org=new Pharmacy_org_class();
            OrgList.add(org);
        }
        
        else if (type.getValue().equals(Type.Drug.getValue())){
            org=new drug_org_class();
            OrgList.add(org);
        }
        
        else if (type.getValue().equals(Type.Chemical.getValue())){
            org=new chemical_org_class();
            OrgList.add(org);
        }
        return org;
    }
        
        
        
}
