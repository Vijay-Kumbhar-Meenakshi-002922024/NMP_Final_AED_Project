/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;


import Doctor.Prescription_Class;
import Role.Doctor_role_class;
import Role.Role_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Doctor_org_class extends org_class{
     private ArrayList<Prescription_Class> Prescription_list;
     
      public Doctor_org_class() {
        super(org_class.Type.Doctor.getValue());
     
        Prescription_list=new ArrayList<Prescription_Class>();
    }

    public ArrayList<Prescription_Class> getPrescription_list() {
        return Prescription_list;
    }

    public void setPrescription_list(ArrayList<Prescription_Class> Prescription_list) {
        this.Prescription_list = Prescription_list;
    }

    @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> roles = new ArrayList();
        roles.add(new Doctor_role_class());
        return roles;
    }
    public void addPrescription(Prescription_Class Pescription){
        
         Prescription_list.add(Pescription);
         
        
    } 
     
}
