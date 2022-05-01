/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drug;

import java.util.ArrayList;

/**
 *
 * @author korapava
 */
public class Drug_List_Class {
    
     private ArrayList<Drug_class> Drug_List;
    
      public Drug_List_Class() {
        this.Drug_List = new ArrayList<Drug_class>();
    }

    public ArrayList<Drug_class> getDrug_List() {
        return Drug_List;
    }

    public void setDrug_List(ArrayList<Drug_class> Drug_List) {
        this.Drug_List = Drug_List;
    }
     
    
    public Drug_class add_Drug_List()
   {
       Drug_class Drug = new Drug_class();
       Drug_List.add(Drug);
       return Drug;
       
   }
    
}
