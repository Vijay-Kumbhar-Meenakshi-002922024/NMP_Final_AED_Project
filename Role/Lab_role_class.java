/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;
import Business.EcoCommunity;
import Enterprise.Enterprise_class;
import Network.Network_class;
import Organization.Lab_org_class;
import Organization.org_class;
import User_account.User_account_class;
import UI.LAB_ASSISTANT_ROLE.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author dpsmv
 */
public class Lab_role_class extends Role_class {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_account_class user_account_class, org_class organization, Enterprise_class enterprise, EcoCommunity business,Network_class network) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer,user_account_class,(Lab_org_class)organization,enterprise,business,network);
    }
}
