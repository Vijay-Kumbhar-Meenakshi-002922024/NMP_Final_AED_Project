/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User_account;

import EmployeeData.Employee;
import Role.Role_class;
import java.util.ArrayList;
/**
 *
Pavan
 * @author korapava

public class user_account_directory {
    
     private ArrayList<User_account_class> User_Account_List;
    
      public user_account_directory() {
        User_Account_List = new ArrayList();
    }

Pavan
    public ArrayList<User_account_class> getUserAccountList() {
        return User_Account_List;
    }
    
     public User_account_class authenticateUser(String User_name, String Password){
        for (User_account_class us : User_Account_List)
            if (us.getUser_Name().equals(User_name) && us.getPassword().equals(Password)){
                return us;

    public ArrayList<User_account_class> getUser_Account_List() {
        return User_Account_List;
    }
    
     public User_account_class authenticateUser(String User_Name, String Password){
        for (User_account_class ua : User_Account_List)
            if (ua.getUserName().equals(User_Name) && ua.getPassword().equals(Password)){
                return ua;
 main
            }
        return null;
    }
    
    public User_account_class createUserAccount(String User_Name, String Password, Employee employee, Role_class role_class){
        User_account_class user_account_class = new User_account_class();
 Pavan
        user_account_class.setUser_Name(User_Name);
        user_account_class.setPassword(Password);
        user_account_class.setEmployee(employee);
        user_account_class.setRole(role_class);

        user_account_class.setUserName(User_Name);
        user_account_class.setPassword(Password);
        user_account_class.setEmployee(employee);
        user_account_class.setRole_class(role_class);
 main
        User_Account_List.add(user_account_class);
        return user_account_class;
    } 
    
    public boolean check_If_User_Is_Unique(String User_Name){
        for (User_account_class ua : User_Account_List){
 Pavan
            if (ua.getUser_Name().equals(User_Name))

 main
                return false;
        }
        return true;
    }
 Pavan


    
 main
    
    
}
