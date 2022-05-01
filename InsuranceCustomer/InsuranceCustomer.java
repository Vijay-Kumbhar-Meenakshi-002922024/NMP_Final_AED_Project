/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsuranceCustomer;
import Insurance.Insurance;
/**
 *
 * @author dpsmv
 */
public class InsuranceCustomer {
 
     private String customer_LastName;
    private String customer_FirstName;
    private String ssn;
    private String DOB;
    private int Age;
    private String phone_Number;
    private String Address;
    private String gender;
    private String policy_Start_Date;
    private String policy_End_Date;

    private Insurance insurance;
    private String insurance_Policy_Number;
    
    
    
    public InsuranceCustomer(Insurance insurance, String policyNumber)
    {
        this.insurance = insurance;
        this.insurance_Policy_Number = policyNumber;
    }

    public String getCustomer_LastName() {
        return customer_LastName;
    }

    public void setCustomer_LastName(String customer_LastName) {
        this.customer_LastName = customer_LastName;
    }

    public String getCustomer_FirstName() {
        return customer_FirstName;
    }

    public void setCustomer_FirstName(String customer_FirstName) {
        this.customer_FirstName = customer_FirstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPolicy_Start_Date() {
        return policy_Start_Date;
    }

    public void setPolicy_Start_Date(String policy_Start_Date) {
        this.policy_Start_Date = policy_Start_Date;
    }

    public String getPolicy_End_Date() {
        return policy_End_Date;
    }

    public void setPolicy_End_Date(String policy_End_Date) {
        this.policy_End_Date = policy_End_Date;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getInsurance_Policy_Number() {
        return insurance_Policy_Number;
    }

    public void setInsurance_Policy_Number(String insurance_Policy_Number) {
        this.insurance_Policy_Number = insurance_Policy_Number;
    }
    
     @Override
    public String toString() {
        return insurance_Policy_Number;
    }
}
