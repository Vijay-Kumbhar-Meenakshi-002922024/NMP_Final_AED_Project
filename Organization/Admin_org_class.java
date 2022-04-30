/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;
import Role.AdminRole_class;
import Role.Role_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Admin_org_class extends org_class{
 
    private String organisationName;
    
    public Admin_org_class() {
        super(Type.Admin.getValue());
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }
    
    
    
    @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> role_class = new ArrayList();
        role_class.add(new AdminRole_class());
        return role_class;
    }
     
}
