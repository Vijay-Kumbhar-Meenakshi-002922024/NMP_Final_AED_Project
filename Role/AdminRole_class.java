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
import UI.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author dpsmv
 */
public class AdminRole_class extends Role_class{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_account_class account, org_class organization, Enterprise_class enterprise_class, EcoCommunity EcoCommunity,Network_class network_class) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise_class);
    }
    
}
