/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsuranceCustomer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dpsmv
 */
public class Insurance_Customer_Directory {
 
    
     private List<InsuranceCustomer> insuranceCustomers = new ArrayList<>();

    public List<InsuranceCustomer> getInsuranceCustomers() {
        return insuranceCustomers;
    }

    public void setInsuranceCustomers(List<InsuranceCustomer> insuranceCustomers) {
        this.insuranceCustomers = insuranceCustomers;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insuranceCustomers + '}';
    }
    
}
