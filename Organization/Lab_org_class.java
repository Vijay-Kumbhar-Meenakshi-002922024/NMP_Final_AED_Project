/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import java.util.ArrayList;
import Role.Lab_role_class;
import Role.Role_class;
/**
 *
 * @author dpsmv
 */
public class Lab_org_class extends org_class{
    
    public Lab_org_class() {
        super(org_class.Type.Lab.getValue());
    }

   @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> roles = new ArrayList();
        roles.add(new LabRole());
        return roles;
    }
      
}
