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
import Organization.chemical_org_class;
import Organization.org_class;
import User_account.User_account_class;
import javax.swing.JPanel;
import UI.ChemicalRole.ChemicalWorkArea;


public class Chemical_role_class extends Role_class{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_account_class account, org_class organization, Enterprise_class enterprise, EcoCommunity business,Network_class network) {
       return new ChemicalWorkArea(userProcessContainer,account,(ChemicalOrganization)organization,enterprise,business,network);
       
    }
}
