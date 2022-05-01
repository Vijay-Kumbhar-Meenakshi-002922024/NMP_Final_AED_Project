/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drug;

import Chemical.Chemical_List_Class;
import Genetics.Genetics_History_Class;

/**
 *
 * @author dpsmv
 */
public class Drug_class {
   
    private int Drug_Id;
    private String Drug_Name;
    private Chemical_List_Class Chemical_List;
    private Genetics_History_Class Genetics_History;
    private static int Drug_counter=0;
    
    
    public Drug_class(){
        Chemical_List = new Chemical_List_Class();
        Genetics_History = new Genetics_History_Class();
        Drug_Id = Drug_counter;
        ++Drug_counter;
         
    }

    public int getDrug_Id() {
        return Drug_Id;
    }

    public String getDrug_Name() {
        return Drug_Name;
    }

    public void setDrug_Name(String Drug_Name) {
        this.Drug_Name = Drug_Name;
    }

    public Chemical_List_Class getChemical_List() {
        return Chemical_List;
    }

    public void setChemical_List(Chemical_List_Class Chemical_List) {
        this.Chemical_List = Chemical_List;
    }

    public Genetics_History_Class getGenetics_History() {
        return Genetics_History;
    }

    public void setGenetics_History(Genetics_History_Class Genetics_History) {
        this.Genetics_History = Genetics_History;
    }
    
    @Override
     public String toString(){
       return this.Drug_Name;
        }  
    
    
    
    
}
