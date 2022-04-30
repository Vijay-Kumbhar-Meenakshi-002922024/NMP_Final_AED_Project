/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Chemical_Repository.Chemical_Mixture_Class;
import Medical_Repository.Medical_Repository_Class;
import Role.Chemical_role_class;
import Role.Role_class;
import java.util.ArrayList;

/**
 *
 * @author dpsmv
 */
public class chemical_org_class extends org_class{
    
     public chemical_org_class() {
        super(org_class.Type.Chemical.getValue());
        
    }
    
    @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> Role_class = new ArrayList();
        Role_class.add(new ChemicalRole());
        return Role_class;
    }

    
    
}
