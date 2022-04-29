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
 * @author dpsmv
 */
public class user_account_directory {
    
     private ArrayList<User_account_class> User_Account_List;
    
      public user_account_directory() {
        User_Account_List = new ArrayList();
    }

    public ArrayList<User_account_class> getUserAccountList() {
        return User_Account_List;
    }
    
     public User_account_class authenticateUser(String User_name, String Password){
        for (User_account_class userAcc : User_Account_List)
            if (userAcc.getUser_Name().equals(User_name) && userAcc.getPassword().equals(Password)){
                return userAcc;
            }
        return null;
    }
    
    public User_account_class createUserAccount(String User_Name, String Password, Employee Employee, Role_class Role){
        User_account_class userAcc = new User_account_class();
        userAcc.setUser_Name(User_Name);
        userAcc.setPassword(Password);
        userAcc.setEmployee(Employee);
        userAcc.setRole(Role);
        User_Account_List.add(userAcc);
        return userAcc;
    } 
    
    public boolean check_If_User_Is_Unique(String User_Name){
        for (User_account_class ua : User_Account_List){
            if (ua.getUser_Name().equals(User_Name))
                return false;
        }
        return true;
    }
    
    
}
