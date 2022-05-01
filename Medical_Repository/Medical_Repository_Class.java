/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Repository;

import java.util.Date;

/**
 *
 * @author korapava
 */
public class Medical_Repository_Class {
    
     private String Medicine_Name;
    private int Reorder_Level;
    private int Min_Stock;
    private int Max_Stock;
    private Date Expiration_Date;
    private String Pharmacy_Category;
    private int Available_Quantity;
    private double Purchase_Amount;
    private double Selling_Amount;
    private int Product_Id;
    private int Serial_Number;
    private int Required_Quantity;
    private String Reorder_Status="N";

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public int getReorder_Level() {
        return Reorder_Level;
    }

    public void setReorder_Level(int Reorder_Level) {
        this.Reorder_Level = Reorder_Level;
    }

    public int getMin_Stock() {
        return Min_Stock;
    }

    public void setMin_Stock(int Min_Stock) {
        this.Min_Stock = Min_Stock;
    }

    public int getMax_Stock() {
        return Max_Stock;
    }

    public void setMax_Stock(int Max_Stock) {
        this.Max_Stock = Max_Stock;
    }

    public Date getExpiration_Date() {
        return Expiration_Date;
    }

    public void setExpiration_Date(Date Expiration_Date) {
        this.Expiration_Date = Expiration_Date;
    }

    public String getPharmacy_Category() {
        return Pharmacy_Category;
    }

    public void setPharmacy_Category(String Pharmacy_Category) {
        this.Pharmacy_Category = Pharmacy_Category;
    }

    public int getAvailable_Quantity() {
        return Available_Quantity;
    }

    public void setAvailable_Quantity(int Available_Quantity) {
        this.Available_Quantity = Available_Quantity;
    }

    public double getPurchase_Amount() {
        return Purchase_Amount;
    }

    public void setPurchase_Amount(double Purchase_Amount) {
        this.Purchase_Amount = Purchase_Amount;
    }

    public double getSelling_Amount() {
        return Selling_Amount;
    }

    public void setSelling_Amount(double Selling_Amount) {
        this.Selling_Amount = Selling_Amount;
    }

    public int getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(int Product_Id) {
        this.Product_Id = Product_Id;
    }

    public int getSerial_Number() {
        return Serial_Number;
    }

    public void setSerial_Number(int Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    public int getRequired_Quantity() {
        return Required_Quantity;
    }

    public void setRequired_Quantity(int Required_Quantity) {
        this.Required_Quantity = Required_Quantity;
    }

    public String getReorder_Status() {
        return Reorder_Status;
    }

    public void setReorder_Status(String Reorder_Status) {
        this.Reorder_Status = Reorder_Status;
    }
    
      @Override
 public String toString(){
   return this.Medicine_Name;
    }   
    
}
