/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.util.ArrayList;

/**
 *
 * @author dpsmv
 */
public class Prescription_List {
    
     private ArrayList<Prescription_Class> Prescription_List;
     
     public Prescription_List(){
        Prescription_List=new ArrayList<Prescription_Class>();
    }

    public ArrayList<Prescription_Class> getPrescription_List() {
        return Prescription_List;
    }

    public void setPrescription_List(ArrayList<Prescription_Class> Prescription_List) {
        this.Prescription_List = Prescription_List;
    }

         
    public Prescription_Class addPrescription(){
        Prescription_Class p=new Prescription_Class();
         Prescription_List.add(p);
         return p;
    }
    
}
