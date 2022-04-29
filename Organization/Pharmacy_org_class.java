/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;
import Medical_Repository.Medical_Repository_Class;
import Role.Pharmacy_role_class;
import Role.Role_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Pharmacy_org_class extends org_class{
    
    private ArrayList<Medical_Repository_Class> MedList;
    
   public Pharmacy_org_class() {
     
       super(org_class.Type.Pharmacy.getValue());
        MedList=new ArrayList<Medical_Repository_Class>();
    }
    
   
    @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }

    public ArrayList<Medical_Repository_Class> getMedList() {
        return MedList;
    }

    public void setMedList(ArrayList<Medical_Repository_Class> MedList) {
        this.MedList = MedList;
    }
   
   public void addMedicine(Medical_Repository_Class M)
    {
       
        MedList.add(M);
        
    }
    
}
