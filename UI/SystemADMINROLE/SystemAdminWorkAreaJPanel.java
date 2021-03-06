/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemADMINROLE;

/**
 *
 * @author dsnik
 */

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.apache.log4j.Logger;


public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
     JPanel userProcessContainer;
    EcoSystem ecosystem;
    private static Logger log = Logger.getLogger(SystemAdminWorkAreaJPanel.class);
    private static final String CLASS_NAME = SystemAdminWorkAreaJPanel.class.getName();
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        viewReportsBtn = new javax.swing.JButton();
        lbl_selected = new javax.swing.JLabel();
        lblSelectedNode_view = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jTree);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageNetwork.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(102, 0, 153));
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 99, 390, -1));

        btnManageEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(102, 0, 153));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 146, 390, -1));

        btnManageAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageAdmin.setForeground(new java.awt.Color(102, 0, 153));
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 193, 390, -1));

        viewReportsBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewReportsBtn.setForeground(new java.awt.Color(102, 0, 153));
        viewReportsBtn.setText("View Reports");
        viewReportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewReportsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 390, 40));

        lbl_selected.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_selected.setForeground(new java.awt.Color(102, 0, 153));
        lbl_selected.setText("Selected Node:");
        jPanel2.add(lbl_selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 25, -1, -1));

        lblSelectedNode_view.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSelectedNode_view.setForeground(new java.awt.Color(102, 0, 153));
        lblSelectedNode_view.setText("<View_selected_node>");
        jPanel2.add(lblSelectedNode_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        log.debug("user creating network" +CLASS_NAME);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        if(ecosystem.getNetworkList().size()<=0)
        {
            JOptionPane.showMessageDialog(null,"No network available to create a enterprise");
            return;
        }
        else
        {
            ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
            log.debug("user creating enterpirse" +CLASS_NAME);
            userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        int i =0;
        for(Network n:ecosystem.getNetworkList())
        {
            for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList())
            {
                i++;

            }
        }
        if(i<=0)
        {
            JOptionPane.showMessageDialog(null,"No enterprise is available to create a admin for a enterprise");
            return;
        }
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        log.debug("user adding enterpirse admins" +CLASS_NAME);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void viewReportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportsBtnActionPerformed
        UI.SystemADMINROLE.ViewReportsJPanel ViewReports = new UI.SystemADMINROLE.ViewReportsJPanel (userProcessContainer, ecosystem);
        userProcessContainer.add("ViewReports",ViewReports);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewReportsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode_view;
    private javax.swing.JLabel lbl_selected;
    private javax.swing.JButton viewReportsBtn;
    // End of variables declaration//GEN-END:variables

   public void populateTree() {
   DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
}
