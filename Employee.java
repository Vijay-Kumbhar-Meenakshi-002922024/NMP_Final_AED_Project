/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeData;

/**
 *
 * @author dpsmv
 */
public class Employee {
    
    private String EmpName;
    private int Empid;
    private static int Empcount = 1;

 public Employee() {
        Empid = Empcount;
        Empcount++;
    }

    public int getEmpid() {
        return Empid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

 
    @Override
    public String toString() {
        return EmpName;
    }
    
}
    
    
