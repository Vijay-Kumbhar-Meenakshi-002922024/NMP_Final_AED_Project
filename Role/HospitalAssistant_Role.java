/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HospitalAssistantOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Patient.Patient;
import javax.swing.JPanel;
import UI.HospitalAssistantRole.AccountantProcessRequestJPanel;
import UI.HospitalAssistantRole.AccountantWorkAreaJPanel;
/**
 *
 * @author dsnik
 */
public class HospitalAssistant_Role extends Role{
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem, Network network) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (HospitalAssistantOrg)organization, enterprise, ecosystem,network);
    }
}
