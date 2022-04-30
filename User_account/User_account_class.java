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
    
     private String User_Name;
    private String Password;
    private Employee Employee;
    private Role_class Role;
    private WorkQueue_class WorkQueue;
    
     public User_account_class() {
        WorkQueue = new WorkQueue_class();
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
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

    public Role_class getRole() {
        return Role;
    }

    public void setRole(Role_class Role) {
        this.Role = Role;
    }

    public WorkQueue_class getWorkQueue() {
        return WorkQueue;
    }

    public void setWorkQueue(WorkQueue_class WorkQueue) {
        this.WorkQueue = WorkQueue;
    }
    
    @Override
    public String toString() {
        return User_Name;
    }
    
    
    
}
