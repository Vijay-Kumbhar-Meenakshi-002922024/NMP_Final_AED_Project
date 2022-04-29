/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genetics;

import java.util.ArrayList;

/**
 *
 * @author dpsmv
 */
public class Genetics_History_Class {
    
    private ArrayList<Genetic_class> Genetics_History;
    
     public Genetics_History_Class() {
        
        Genetics_History = new ArrayList<Genetic_class>();
        
    }

    public ArrayList<Genetic_class> getGenetics_History() {
        return Genetics_History;
    }

    public void setGenetics_History(ArrayList<Genetic_class> Genetics_History) {
        this.Genetics_History = Genetics_History;
    }
     
    public Genetic_class addGeneticsList()
   {
       Genetic_class gene = new Genetic_class();
       Genetics_History.add(gene);
       return  gene;
       
   } 
    
}
