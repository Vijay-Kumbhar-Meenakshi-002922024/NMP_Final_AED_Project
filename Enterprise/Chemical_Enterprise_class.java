/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;
import java.util.ArrayList;
import Role.Role_class;

import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Chemical_Enterprise_class extends Enterprise_class{
    
     public Chemical_Enterprise_class(String Name){
        super(Name,EnterpriseType.Chemical);
    }
    @Override
    public ArrayList<Role_class> getSupportedRole() {
        return null;
    }
    
    
}
