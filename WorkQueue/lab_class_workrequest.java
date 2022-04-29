/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;
import java.util.List;
import java.util.Map;
import Disease.Disease_class;
import Doctor.Patient_class;
import Genetics.Genetic_class;
/**
 *
 * @author dpsmv
 */
public class lab_class_workrequest {
    
    private String Test_Result;
    private Map<Disease_class,List<Genetic_class>>diseaseListGenes;
    private String patient_Name;
    private Patient_class patient;

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public Patient_class getPatient() {
        return patient;
    }

    public void setPatient(Patient_class patient) {
        this.patient = patient;
    }

    public String getTest_Result() {
        return Test_Result;
    }

    public void setTest_Result(String Test_Result) {
        this.Test_Result = Test_Result;
    }

    public Map<Disease_class, List<Genetic_class>> getDiseaseListGenes() {
        return diseaseListGenes;
    }

    public void setDiseaseListGenes(Map<Disease_class, List<Genetic_class>> diseaseListGenes) {
        this.diseaseListGenes = diseaseListGenes;
    }
    
    @Override
     public String toString(){
       return this.patient_Name;
        }
    
    
    
}
