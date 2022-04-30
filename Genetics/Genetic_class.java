/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genetics;

/**
 *
 * @author dpsmv
 */
public class Genetic_class {
    private String Gene_Name;
    private int Gene_id;
    private static int Gene_count = 1; 
    
    
    
     public Genetic_class() {
         Gene_id = Gene_count;
         Gene_count++;
    }

    public int getGene_id() {
        return Gene_id;
    }

           
    public String getGene_Name() {
        return Gene_Name;
    }

    public void setGene_Name(String Gene_Name) {
        this.Gene_Name = Gene_Name;
    }
  
    @Override
    public String toString() {
        return "Gene { " + "Gene Name=" + Gene_Name + ", Gene id=" + Gene_id + '}';
    }
 
     
}
