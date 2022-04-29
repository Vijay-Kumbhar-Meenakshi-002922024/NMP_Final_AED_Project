/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author dpsmv
 */

import Business.EcoCommunity;
import Enterprise.Enterprise_class;
import Network.Network_class;
import Organization.org_class;
import User_account.User_account_class;
import javax.swing.JPanel;

public abstract class Role_class {
    
    
     public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant");
      
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        
     }
      public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User_account_class account, 
            org_class organization, 
            Enterprise_class enterprise, 
            EcoCommunity business,Network_class network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
     
}

