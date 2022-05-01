/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;


import EmployeeData.EmpDirectory;
import Role.Role_class;
import User_account.user_account_directory;
import WorkQueue.WorkQueue_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public abstract class org_class {
    
     private String OrgName;
    private WorkQueue_class workQueue;
    private  EmpDirectory employeeDirectory;
    private user_account_directory userAccountDirectory;
    private int orgID;
    private static int orgcounter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Pharmacy("Pharmacy Organization"), Drug("Drug Organization"), Chemical("Chemical Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public org_class(String OrgName) {
        this.OrgName = OrgName;
        workQueue = new WorkQueue_class();
        employeeDirectory = new EmpDirectory();
        userAccountDirectory = new user_account_directory();
        orgID = orgcounter;
        ++orgcounter;
    }
    
     public abstract ArrayList<Role_class> getSupportedRole();

    public user_account_directory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmpDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public int getOrgID() {
        return orgID;
    }

    public String getOrgName() {
        return OrgName;
    }

    public WorkQueue_class getWorkQueue() {
        return workQueue;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = this.OrgName;
    }

    public void setWorkQueue(WorkQueue_class workQueue) {
        this.workQueue = workQueue;
    }
     
       @Override
    public String toString() {
        return OrgName;
    }

    
    
     
}
