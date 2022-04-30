/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import java.util.ArrayList;
import Role.Role_class;
/**
 *
 * @author dpsmv
 */
public class Pharmacy_Enterprise_class extends Enterprise_class{
  
    public Pharmacy_Enterprise_class(String name){
        super(name,EnterpriseType.Pharmacy);
    }
    @Override
    public ArrayList<Role_class> getSupportedRole() {
        return null;
    }
    
    
}
