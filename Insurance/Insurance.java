/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author dpsmv
 */
public class Insurance {
    
    
    private String Policy_Name;
    private String Insurance_Company;
    private double Coverage;
    private String PolicyTC;
    private double Monthly_Premium;

    public Insurance(String policyName, String InsuranceCompany, double coverage) {
        this.Policy_Name = policyName;
        this.Insurance_Company = InsuranceCompany;
        this.Coverage = coverage;
    }

    public String getPolicy_Name() {
        return Policy_Name;
    }

    public void setPolicy_Name(String Policy_Name) {
        this.Policy_Name = Policy_Name;
    }

    public String getInsurance_Company() {
        return Insurance_Company;
    }

    public void setInsurance_Company(String Insurance_Company) {
        this.Insurance_Company = Insurance_Company;
    }

    public double getCoverage() {
        return Coverage;
    }

    public void setCoverage(double Coverage) {
        this.Coverage = Coverage;
    }

    public String getPolicyTC() {
        return PolicyTC;
    }

    public void setPolicyTC(String PolicyTC) {
        this.PolicyTC = PolicyTC;
    }

    public double getMonthly_Premium() {
        return Monthly_Premium;
    }

    public void setMonthly_Premium(double Monthly_Premium) {
        this.Monthly_Premium = Monthly_Premium;
    }
    
    
     @Override
    public String toString() {
        return Policy_Name;
    }
    
}
