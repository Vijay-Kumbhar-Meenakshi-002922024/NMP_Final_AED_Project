/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chemical_Repository;

import Medical_Repository.Medical_Repository_Class;
import java.util.ArrayList;

/**
 *
 * @author dpsmv
 */
public class Chemical_Mixture_List {
 
     private ArrayList<Chemical_Mixture_Class> Chemical_List;
     
     public Chemical_Mixture_List() {
        Chemical_List =  new ArrayList<Chemical_Mixture_Class>();
    }

    public ArrayList<Chemical_Mixture_Class> getChemical_List() {
        return Chemical_List;
    }

    public void setChemical_List(ArrayList<Chemical_Mixture_Class> Chemical_List) {
        this.Chemical_List = Chemical_List;
    }

      public Chemical_Mixture_Class AddChemial()
    {
        Chemical_Mixture_Class CM = new Chemical_Mixture_Class();
        Chemical_List.add(CM);
        return CM;
    }
    
}
