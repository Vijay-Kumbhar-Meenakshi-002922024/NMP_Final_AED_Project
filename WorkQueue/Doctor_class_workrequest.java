/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;
import User_account.User_account_class;
import java.util.Date;
/**
 *
 * @author dpsmv
 */
public class Doctor_class_workrequest {
   
     private User_account_class Reciver;
    private User_account_class Sender;
    private String medication_name;
    private Date Request_Date;
    private String Status;
    private String Hospital_Name;
    private String Paitent_Name;
    private String Test;
    private int Quantity;
    private String Sex;

    public User_account_class getReciver() {
        return Reciver;
    }

    public void setReciver(User_account_class Reciver) {
        this.Reciver = Reciver;
    }

    public User_account_class getSender() {
        return Sender;
    }

    public void setSender(User_account_class Sender) {
        this.Sender = Sender;
    }

    public String getMedication_name() {
        return medication_name;
    }

    public void setMedication_name(String medication_name) {
        this.medication_name = medication_name;
    }

    public Date getRequest_Date() {
        return Request_Date;
    }

    public void setRequest_Date(Date Request_Date) {
        this.Request_Date = Request_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String Hospital_Name) {
        this.Hospital_Name = Hospital_Name;
    }

    public String getPaitent_Name() {
        return Paitent_Name;
    }

    public void setPaitent_Name(String Paitent_Name) {
        this.Paitent_Name = Paitent_Name;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    
    
    
}
