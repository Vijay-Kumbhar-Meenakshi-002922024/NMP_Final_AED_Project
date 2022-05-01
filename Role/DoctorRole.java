/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.DOCTORROLE.DOCTOR_WORK_AREA_JPanel;
import javax.swing.JPanel;

/**
 *
 * @author venu0
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new DOCTOR_WORK_AREA_JPanel(userProcessContainer,account,(DoctorOrganization)organization,enterprise,business,network);
    }
    
    
}
