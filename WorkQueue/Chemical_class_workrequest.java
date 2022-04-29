/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

/**
 *
 * @author dpsmv
 */
public class Chemical_class_workrequest {
   private String chemical_status;
    private String chemical_Name;
    private int ChemiacalQuantity;
    private String Chemiacl_delivery_Time; 

    public String getChemical_status() {
        return chemical_status;
    }

    public void setChemical_status(String chemical_status) {
        this.chemical_status = chemical_status;
    }

    public String getChemical_Name() {
        return chemical_Name;
    }

    public void setChemical_Name(String chemical_Name) {
        this.chemical_Name = chemical_Name;
    }

    public int getChemiacalQuantity() {
        return ChemiacalQuantity;
    }

    public void setChemiacalQuantity(int ChemiacalQuantity) {
        this.ChemiacalQuantity = ChemiacalQuantity;
    }

    public String getChemiacl_delivery_Time() {
        return Chemiacl_delivery_Time;
    }

    public void setChemiacl_delivery_Time(String Chemiacl_delivery_Time) {
        this.Chemiacl_delivery_Time = Chemiacl_delivery_Time;
    }
    
     @Override
    public String toString() {
        return chemical_Name;
    }
    
    
    
    
}
