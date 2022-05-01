/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsnik
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patients;

    public PatientDirectory() {
        patients = new ArrayList();
    }

    public ArrayList<Patient> getpatients() {
        return patients;
    }
   
    
}
