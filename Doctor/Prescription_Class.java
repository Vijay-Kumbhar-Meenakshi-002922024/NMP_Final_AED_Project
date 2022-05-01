/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.util.Date;

/**
 *
 * @author dpsmv
 */
public class Prescription_Class {
    
    private int No_of_Times_In_a_day;
    private int Total_Days;
    private String Daignosis;
    private String Medicine_Name;
    private Date Prescription_Date;
    private String Network_Name;

    public int getNo_of_Times_In_a_day() {
        return No_of_Times_In_a_day;
    }

    public void setNo_of_Times_In_a_day(int No_of_Times_In_a_day) {
        this.No_of_Times_In_a_day = No_of_Times_In_a_day;
    }

    public int getTotal_Days() {
        return Total_Days;
    }

    public void setTotal_Days(int Total_Days) {
        this.Total_Days = Total_Days;
    }

    public String getDaignosis() {
        return Daignosis;
    }

    public void setDaignosis(String Daignosis) {
        this.Daignosis = Daignosis;
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public Date getPrescription_Date() {
        return Prescription_Date;
    }

    public void setPrescription_Date(Date Prescription_Date) {
        this.Prescription_Date = Prescription_Date;
    }

    public String getNetwork_Name() {
        return Network_Name;
    }

    public void setNetwork_Name(String Network_Name) {
        this.Network_Name = Network_Name;
    }
    
    
    
}
