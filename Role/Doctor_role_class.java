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
import Organization.Doctor_org_class;
import Organization.org_class;
import User_account.User_account_class;
import UI.DOCTORROLE.DOCTOR_WORK_AREA_JPanel;
import javax.swing.JPanel;


public class Doctor_role_class extends Role_class{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_account_class user_account_class, org_class organization, Enterprise_class enterprise, EcoCommunity business,Network_class network) {
        return new DOCTOR_WORK_AREA_JPanel(userProcessContainer,user_account_class,(Doctor_org_class)organization,enterprise,business,network);
    }
    
}
