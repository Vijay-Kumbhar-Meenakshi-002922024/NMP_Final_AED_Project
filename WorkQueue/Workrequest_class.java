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
public class Workrequest_class {
    
    private String Workrequest_message;
    private User_account_class Workrequest_sender;
    private User_account_class Workrequest_receiver;
    private String Workrequest_status;
    private Date Workrequest_Date;
    private Date Workrequest_resolveDate;
    
     public Workrequest_class(){
        Workrequest_Date = new Date();
    }

    public String getWorkrequest_message() {
        return Workrequest_message;
    }

    public void setWorkrequest_message(String Workrequest_message) {
        this.Workrequest_message = Workrequest_message;
    }

    public User_account_class getWorkrequest_sender() {
        return Workrequest_sender;
    }

    public void setWorkrequest_sender(User_account_class Workrequest_sender) {
        this.Workrequest_sender = Workrequest_sender;
    }

    public User_account_class getWorkrequest_receiver() {
        return Workrequest_receiver;
    }

    public void setWorkrequest_receiver(User_account_class Workrequest_receiver) {
        this.Workrequest_receiver = Workrequest_receiver;
    }

    public String getWorkrequest_status() {
        return Workrequest_status;
    }

    public void setWorkrequest_status(String Workrequest_status) {
        this.Workrequest_status = Workrequest_status;
    }

    public Date getWorkrequest_Date() {
        return Workrequest_Date;
    }

    public void setWorkrequest_Date(Date Workrequest_Date) {
        this.Workrequest_Date = Workrequest_Date;
    }

    public Date getWorkrequest_resolveDate() {
        return Workrequest_resolveDate;
    }

    public void setWorkrequest_resolveDate(Date Workrequest_resolveDate) {
        this.Workrequest_resolveDate = Workrequest_resolveDate;
    }
    
     
     
     
}
