/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Chemical_Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChemicalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChemicalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author dpsmv
 */
public class Chemical_Workspace_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Chemical_Workspace_JPanel
     */
    
    
   private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ChemicalOrganization chemicalOrganization;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(Chemical_Workspace_JPanel.class);
    private static final String CLASS_NAME = Chemical_Workspace_JPanel.class.getName();

    
    
    public Chemical_Workspace_JPanel(
   JPanel userProcessContainer, UserAccount userAccount, ChemicalOrganization chemicalOrganization, Enterprise enterprise, EcoSystem business, Network network) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.chemicalOrganization = chemicalOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        generate_Table();
    }
    
    
     public void generate_Table() {
        DefaultTableModel model = (DefaultTableModel) Jtable_ChemicalSupplier.getModel();
        model.setRowCount(0);

        for (WorkRequest request : chemicalOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = ((ChemicalWorkRequest) request);
            row[1] = ((ChemicalWorkRequest) request).getQuantity();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver()== null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = ((ChemicalWorkRequest) request).getDeliveryTime();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlbl_Workspace_ChemicalSpplier = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_ChemicalSupplier = new javax.swing.JTable();
        btnAssignMe = new javax.swing.JButton();
        btn_Process = new javax.swing.JButton();

        Jlbl_Workspace_ChemicalSpplier.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Jlbl_Workspace_ChemicalSpplier.setText("Work space of Chemical Supplier");

        Jtable_ChemicalSupplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jtable_ChemicalSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name of Drug", "Drug Quantity", "Drug Sender", "Drug Reciever", "Status", "Delivery Time"
            }
        ));
        jScrollPane1.setViewportView(Jtable_ChemicalSupplier);

        btnAssignMe.setText("Assign Me");
        btnAssignMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignMeActionPerformed(evt);
            }
        });

        btn_Process.setText("Process");
        btn_Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Jlbl_Workspace_ChemicalSpplier, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(292, 292, 292)
                            .addComponent(btnAssignMe)
                            .addGap(126, 126, 126)
                            .addComponent(btn_Process)
                            .addGap(99, 99, 99)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Jlbl_Workspace_ChemicalSpplier, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignMe)
                    .addComponent(btn_Process))
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignMeActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = Jtable_ChemicalSupplier.getSelectedRow();
         if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
         if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4) != null) {

            if (((Jtable_ChemicalSupplier.getValueAt(selectedRow, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
      
         if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4) != null) {

            if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4).equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
         
        if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 3) != null) {

            if (!Jtable_ChemicalSupplier.getValueAt(selectedRow, 3).equals(userAccount.getUsername())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
   int flag = 0;
        for (WorkRequest request : chemicalOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus()== null) {
                continue;
            }
            if (request. getStatus().equals("Assigned") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                flag = 1;
            }
        }
       
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        
        int flag1 = 0;
        for (WorkRequest request : chemicalOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus()== null) {
                continue;
            }
            if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                flag1 = 1;
            }
        }
        
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        
        WorkRequest request = (WorkRequest) Jtable_ChemicalSupplier.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        generate_Table();
        log.debug(userAccount+" "+"assigned a task to himself");
        
        
    }//GEN-LAST:event_btnAssignMeActionPerformed

    private void btn_ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcessActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = Jtable_ChemicalSupplier.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
         ChemicalWorkRequest request = (ChemicalWorkRequest) Jtable_ChemicalSupplier.getValueAt(selectedRow, 0);
        if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4) != null) {

            if (((Jtable_ChemicalSupplier.getValueAt(selectedRow, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }

          if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4) == null) {
            JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
            return;
        }
        int flag = 0;
        if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4).equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {

            flag = 1;
        } 
        if (flag != 1) {
            if (Jtable_ChemicalSupplier.getValueAt(selectedRow, 4) != null) {

                if (!(((Jtable_ChemicalSupplier.getValueAt(selectedRow, 4).equals("Assigned"))) && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString()))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing"); 
         
        ChemicalRequestProcessPanel processWorkRequestJPanel = new ChemicalRequestProcessPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        log.debug(userAccount+" "+"processes the task");
        
    }//GEN-LAST:event_btn_ProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlbl_Workspace_ChemicalSpplier;
    private javax.swing.JTable Jtable_ChemicalSupplier;
    private javax.swing.JButton btnAssignMe;
    private javax.swing.JButton btn_Process;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
