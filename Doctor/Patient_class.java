/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Genetics.Genetic_class;
import Genetics.Genetics_History_Class;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dpsmv
 */
public class Patient_class {
   
    private int Patient_Id;
    private String Patient_Name;
    private int Age;
    private String gender;
    private String test;
    private Genetics_History_Class gene_History;
    private String sex;
    private String new_Drug;
    private String Clinical_Status;
    
    
    public Patient_class() {
    
        gene_History = new Genetics_History_Class();
    }

    public int getPatient_Id() {
        return Patient_Id;
    }

    public void setPatient_Id(int Patient_Id) {
        this.Patient_Id = Patient_Id;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Genetics_History_Class getGene_History() {
        return gene_History;
    }

    public void setGene_History(Genetics_History_Class gene_History) {
        this.gene_History = gene_History;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNew_Drug() {
        return new_Drug;
    }

    public void setNew_Drug(String new_Drug) {
        this.new_Drug = new_Drug;
    }

    public String getClinical_Status() {
        return Clinical_Status;
    }

    public void setClinical_Status(String Clinical_Status) {
        this.Clinical_Status = Clinical_Status;
    }

      @Override
     public String toString(){
       return this.Patient_Name;
        }  
    
}
