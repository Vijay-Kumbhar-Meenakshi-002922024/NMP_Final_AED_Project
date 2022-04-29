/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import java.util.Date;
import Chemical.ChemicalClass;
import Doctor.Patient_class;
import Drug.Drug_List_Class;
import Drug.Drug_class;
import Genetics.Genetic_class;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dpsmv
 */
public class Drug_class_workrequest extends Workrequest_class{
   
    private String Drug_Name;
    private int Drug_Quantity;
    private String Delivery_Time;
    private Patient_class Patient;
    private Map<Genetic_class,ChemicalClass>geneChemical;
    private Map<Drug_class,List<ChemicalClass>>drugChemical;

    public String getDrug_Name() {
        return Drug_Name;
    }

    public void setDrug_Name(String Drug_Name) {
        this.Drug_Name = Drug_Name;
    }

    public int getDrug_Quantity() {
        return Drug_Quantity;
    }

    public void setDrug_Quantity(int Drug_Quantity) {
        this.Drug_Quantity = Drug_Quantity;
    }

    public String getDelivery_Time() {
        return Delivery_Time;
    }

    public void setDelivery_Time(String Delivery_Time) {
        this.Delivery_Time = Delivery_Time;
    }

    public Patient_class getPatient() {
        return Patient;
    }

    public void setPatient(Patient_class Patient) {
        this.Patient = Patient;
    }

    public Map<Genetic_class, ChemicalClass> getGeneChemical() {
        return geneChemical;
    }

    public void setGeneChemical(Map<Genetic_class, ChemicalClass> geneChemical) {
        this.geneChemical = geneChemical;
    }

    public Map<Drug_class, List<ChemicalClass>> getDrugChemical() {
        return drugChemical;
    }

    public void setDrugChemical(Map<Drug_class, List<ChemicalClass>> drugChemical) {
        this.drugChemical = drugChemical;
    }
    
    @Override
     public String toString(){
       return this.Drug_Name;
        }  
    
}
