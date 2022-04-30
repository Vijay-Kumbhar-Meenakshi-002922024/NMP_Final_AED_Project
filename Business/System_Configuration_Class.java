/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import EmployeeData.Employee;
import Role.System_admin_role_class;
import User_account.User_account_class;
/**
 *
 * @author dpsmv
 */
public class System_Configuration_Class {
    
     public static EcoCommunity configure(){
        
        EcoCommunity sys = EcoCommunity.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = sys.getEmployeeDirectory().CreateEmployeeData("RRH");
        
        User_account_class ua = sys.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new System_admin_role_class());
        
        return sys;
    }
    
}
