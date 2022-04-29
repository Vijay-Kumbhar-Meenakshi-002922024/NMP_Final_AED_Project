/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chemical_Repository;
import java.util.Date;
/**
 *
 * @author dpsmv
 */
public class Chemical_Mixture_Class {
  
    private String Chemical_Name;
    private int Reorder_Level;
    private int Min_Stock;
    private int Max_Stock;
    private Date Expiration_Date;
    private String Pharmacy_Category;
    private int Available_Quantity;
    private double Purchase_amount;
    private double Selling_amount;
    private int Product_Id;
    private int Serial_Number;
    private int Required_Quantity;
    private String Reorder_Status="N";

    public String getChemical_Name() {
        return Chemical_Name;
    }

    public void setChemical_Name(String Chemical_Name) {
        this.Chemical_Name = Chemical_Name;
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

    public double getPurchase_amount() {
        return Purchase_amount;
    }

    public void setPurchase_amount(double Purchase_amount) {
        this.Purchase_amount = Purchase_amount;
    }

    public double getSelling_amount() {
        return Selling_amount;
    }

    public void setSelling_amount(double Selling_amount) {
        this.Selling_amount = Selling_amount;
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
       return this.Chemical_Name;
        }  
    
}
