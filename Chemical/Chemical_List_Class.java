/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chemical;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Chemical_List_Class {
     private ArrayList<ChemicalClass> chemicalList;
     
     public Chemical_List_Class() {
        this.chemicalList = new ArrayList<ChemicalClass>();
    }

    public ArrayList<ChemicalClass> getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ArrayList<ChemicalClass> chemicalList) {
        this.chemicalList = chemicalList;
    }

     public ChemicalClass Add_Chemical_List_Data()
   {
       ChemicalClass d = new ChemicalClass();
       chemicalList.add(d);
       return d;
       
   }
    
}
