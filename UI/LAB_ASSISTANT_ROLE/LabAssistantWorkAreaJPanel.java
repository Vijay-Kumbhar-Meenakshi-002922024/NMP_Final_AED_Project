/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LAB_ASSISTANT_ROLE;

/**
 *
 * @author dsnik
 */import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
  private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization LabOrganization;
    private Network network;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(LabAssistantWorkAreaJPanel.class);
    private static final String CLASS_NAME = LabAssistantWorkAreaJPanel.class.getName();

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.LabOrganization = (LabOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        log.debug(userAccount+" "+"logged in");
        populateTable();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_LAB_WORJ = new javax.swing.JTable();
        BTN_ASSIGN = new javax.swing.JButton();
        BTN_PROCESS = new javax.swing.JButton();
        BTN_REFRESH = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAB ASSISTANT WORK AREA");

        jTable_LAB_WORJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT NAME", "AGE", "GENDER", "MESSAGE", "SENDER", "RECEIVER", "STATUS", "NEW DRUG"
            }
        ));
        jScrollPane1.setViewportView(jTable_LAB_WORJ);

        BTN_ASSIGN.setText("ASSIGN TO ME");
        BTN_ASSIGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ASSIGNActionPerformed(evt);
            }
        });

        BTN_PROCESS.setText("PROCESS");
        BTN_PROCESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PROCESSActionPerformed(evt);
            }
        });

        BTN_REFRESH.setText("REFRESH");
        BTN_REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REFRESHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(BTN_ASSIGN)
                        .addGap(56, 56, 56)
                        .addComponent(BTN_PROCESS)
                        .addGap(64, 64, 64)
                        .addComponent(BTN_REFRESH))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ASSIGN)
                    .addComponent(BTN_PROCESS)
                    .addComponent(BTN_REFRESH))
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_ASSIGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ASSIGNActionPerformed
        // TODO add your handling code here:
          int selectedRow = jTable_LAB_WORJ.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        //to check task is  already completed
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) != null) {
            if (((jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }

        //to check task is already assigned        
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) != null) {
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
                if (userAccount.getUsername().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {

                    if (jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Pending")) {
                        JOptionPane.showMessageDialog(null, "Task is already assigned");
                        return;
                    }
                }
            }
        }
        //to check the task is assigned to some one else 
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) != null) {
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
                if (jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Processing")) {
                    JOptionPane.showMessageDialog(null, "Task is already assigned");
                    return;
                }
            }
        }

        //to check whether task is already assigined 
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
            if (!userAccount.getUsername().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        int flag = 0;

        for (WorkRequest request : LabOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus()== null) {
                continue;
            }
            if (request.getStatus().equals("Pending")) {

                if (request.getReceiver()!= null) {

                    if (userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int flag1 = 0;
        for (WorkRequest request : LabOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus()== null) {
                continue;
            }
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
                if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {
                    flag1 = 1;
                }
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) jTable_LAB_WORJ.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        log.debug(userAccount+" "+"has assigned the request");
        log.debug("status has been set to pending");
        populateTable();

    }//GEN-LAST:event_BTN_ASSIGNActionPerformed

    private void BTN_REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REFRESHActionPerformed
        // TODO add your handling code here:
         populateTable();
        log.debug("refreshed the table");
    }//GEN-LAST:event_BTN_REFRESHActionPerformed

    private void BTN_PROCESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PROCESSActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_LAB_WORJ.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        //to check whether the task is completed 
        LabTestWorkRequest request = (LabTestWorkRequest) jTable_LAB_WORJ.getValueAt(selectedRow, 0);
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) != null) {
            if (((jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
        //to check whether task is assigned forr process
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) == null || !userAccount.getUsername().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                return;
            }
        }
        int flag = 0;
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Processing")) {

                flag = 1;
            }
        }
        if (flag != 1) {
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) != null) {

                if ((!(jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Pending")))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing");

        LabProcessRequestJPanel processWorkRequestJPanel = new LabProcessRequestJPanel(userProcessContainer, request, LabOrganization, userAccount, network);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        log.debug("entering process request page");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_BTN_PROCESSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ASSIGN;
    private javax.swing.JButton BTN_PROCESS;
    private javax.swing.JButton BTN_REFRESH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_LAB_WORJ;
    // End of variables declaration//GEN-END:variables

   public void populateTable() {
     DefaultTableModel model = (DefaultTableModel) jTable_LAB_WORJ.getModel();

        model.setRowCount(0);

        for (WorkRequest request : LabOrganization.getWorkQueue().getWorkRequestList()) {

            Object[] row = new Object[8];
            row[0] = ((LabTestWorkRequest) request);
            row[1] = ((LabTestWorkRequest) request).getPatient().getAge();
            row[2] = ((LabTestWorkRequest) request).getPatient().getSex();
            row[3] = request.getMessage();

            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver()== null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[7] = ((LabTestWorkRequest) request).getPatient().getNewDrug();
            model.addRow(row);
        }
    }
}