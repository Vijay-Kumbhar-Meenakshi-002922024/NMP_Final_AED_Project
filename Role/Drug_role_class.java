/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoCommunity;
import Enterprise.Enterprise_class;
import Network.Network_class;

import Organization.org_class;
import User_account.User_account_class;
import javax.swing.JPanel;
import UI.DrugSupplier.DrugSupplierWorkArea;
/**
 *
 * @author dpsmv
 */
public class Drug_role_class extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
       return new DrugSupplierWorkArea(userProcessContainer,business,account,organization,enterprise,network);
    }
}
