/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ScaningInventory;

import java.util.Date;

/**
 *
 * @author dsnik
 */
public class scaning {
    private String ScanName;
   
    private Date deliverydate;
    private String scan_reason;
    private double cost;
    private int productId;
    private int serialNumber;
    
    private String status="N";

    public String getScanName() {
        return ScanName;
    }

    public void setScanName(String ScanName) {
        this.ScanName = ScanName;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getScan_reason() {
        return scan_reason;
    }

    public void setScan_reason(String scan_reason) {
        this.scan_reason = scan_reason;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
        @Override
     public String toString(){
       return this.ScanName;
        }  
    
}
