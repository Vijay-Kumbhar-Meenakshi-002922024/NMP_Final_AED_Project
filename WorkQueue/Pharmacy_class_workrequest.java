/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import java.util.Date;

/**
 *
 * @author dpsmv
 */
public class Pharmacy_class_workrequest extends Workrequest_class{
    
    private String Pharmacy_medication_Name;
    private int Pharmacy_Quantity;
    private Date Pharmacy_request_Date;
    private String Pharmacy_status;
    private String Pharmacy_supplier_Name;
    private  String Pharmacy_patient_Name;
    private String Pharmacy_network;

    public String getPharmacy_medication_Name() {
        return Pharmacy_medication_Name;
    }

    public void setPharmacy_medication_Name(String Pharmacy_medication_Name) {
        this.Pharmacy_medication_Name = Pharmacy_medication_Name;
    }

    public int getPharmacy_Quantity() {
        return Pharmacy_Quantity;
    }

    public void setPharmacy_Quantity(int Pharmacy_Quantity) {
        this.Pharmacy_Quantity = Pharmacy_Quantity;
    }

    public Date getPharmacy_request_Date() {
        return Pharmacy_request_Date;
    }

    public void setPharmacy_request_Date(Date Pharmacy_request_Date) {
        this.Pharmacy_request_Date = Pharmacy_request_Date;
    }

    public String getPharmacy_status() {
        return Pharmacy_status;
    }

    public void setPharmacy_status(String Pharmacy_status) {
        this.Pharmacy_status = Pharmacy_status;
    }

    public String getPharmacy_supplier_Name() {
        return Pharmacy_supplier_Name;
    }

    public void setPharmacy_supplier_Name(String Pharmacy_supplier_Name) {
        this.Pharmacy_supplier_Name = Pharmacy_supplier_Name;
    }

    public String getPharmacy_patient_Name() {
        return Pharmacy_patient_Name;
    }

    public void setPharmacy_patient_Name(String Pharmacy_patient_Name) {
        this.Pharmacy_patient_Name = Pharmacy_patient_Name;
    }

    public String getPharmacy_network() {
        return Pharmacy_network;
    }

    public void setPharmacy_network(String Pharmacy_network) {
        this.Pharmacy_network = Pharmacy_network;
    }
    
     @Override
    public String toString() {
        return this.Pharmacy_medication_Name;
    }
    
    
    
    
}
