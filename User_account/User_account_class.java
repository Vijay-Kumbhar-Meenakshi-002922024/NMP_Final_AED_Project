/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User_account;


import EmployeeData.Employee;
import Role.Role_class;
import WorkQueue.WorkQueue_class;
/**
 *
 * @author dpsmv
 */
public class User_account_class {
    
     private String UserName;
    private String Password;
    private Employee Employee;
    private Role_class Role_class;
    private WorkQueue_class WorkQueue_class;
    
     public User_account_class() {
        WorkQueue_class = new WorkQueue_class();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(Employee Employee) {
        this.Employee = Employee;
    }

    public Role_class getRole_class() {
        return Role_class;
    }

    public void setRole_class(Role_class Role_class) {
        this.Role_class = Role_class;
    }

    public WorkQueue_class getWorkQueue_class() {
        return WorkQueue_class;
    }

    public void setWorkQueue(WorkQueue_class WorkQueue_class) {
        this.WorkQueue_class = WorkQueue_class;
    }
    
    @Override
    public String toString() {
        return UserName;
    }
    
    
    
}
