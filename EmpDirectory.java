/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeData;

import java.util.ArrayList;

/**
 *
 * @author dpsmv
 */
public class EmpDirectory {
 
    private ArrayList<Employee> EmpList;
    public EmpDirectory()
    {
       EmpList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return EmpList;
    }
    
    public Employee CreateEmployeeData(String name)
    {
        Employee employee = new Employee();
        employee.setEmpName(name);
        EmpList.add(employee);
        return employee;
    }
    
}
