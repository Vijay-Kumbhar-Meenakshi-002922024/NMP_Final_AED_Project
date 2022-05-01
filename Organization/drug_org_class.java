/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;
import Chemical.Chemical_List_Class;
import Chemical_Repository.Chemical_Mixture_Class;
import Drug.Drug_List_Class;
import Genetics.Genetics_History_Class;
import Role.Drug_role_class;
import Role.Role_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class drug_org_class extends org_class{
    
     private ArrayList<Chemical_Mixture_Class> Chem_List;
    
      public drug_org_class() {
        
        super(org_class.Type.Drug.getValue());
        Chem_List =  new ArrayList<Chemical_Mixture_Class>();
    }
     
       @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> Role_class = new ArrayList();
        Role_class.add(new DrugRole());
        return Role_class;
    }

    public ArrayList<Chemical_Mixture_Class> getChem_List() {
        return Chem_List;
    }

    public void setChem_List(ArrayList<Chemical_Mixture_Class> Chem_List) {
        this.Chem_List = Chem_List;
    }

     public void addChemical(Chemical_Mixture_Class cm)
    {
       
        Chem_List.add(cm);
        
    }  
      
}
