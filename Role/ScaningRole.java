/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.ScaningOrg;
import Business.UserAccount.UserAccount;
import UI.SCANING_CENTRE.ScaningCentreWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author dsnik
 */
public class ScaningRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new ScaningCentreWorkAreaJPanel(userProcessContainer,account,(ScaningOrg)organization,enterprise,network);
    }
}
