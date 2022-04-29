/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

/**
 *
 * @author dpsmv
 */
public class Physician_class {
 
     private String doctor_Name;
      private Prescription_List Prescription_List;
    
        public Physician_class(){
        Prescription_List= new Prescription_List();
    }  

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public Prescription_List getPrescription_List() {
        return Prescription_List;
    }

    public void setPrescription_List(Prescription_List Prescription_List) {
        this.Prescription_List = Prescription_List;
    }
      
        
        
}
