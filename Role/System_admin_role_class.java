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
import UI.SystemADMINROLE.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author dpsmv
 */
public class System_admin_role_class extends Role_class{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_account_class user_account_class, org_class organization, Enterprise_class enterprise_class,EcoCommunity ecoCommunity ,Network_class network_class) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecoCommunity);
    }
}
