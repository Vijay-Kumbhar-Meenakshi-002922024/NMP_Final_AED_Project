/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LAB_ASSISTANT_ROLE;

/**
 *
 * @author dsnik
 */import Business.EcoCommunity;
import Enterprise.Enterprise_class;
import Network.Network_class;
import Organization.Lab_org_class;
import Organization.org_class;
import User_account.User_account_class;
import WorkQueue.lab_class_workrequest;
import WorkQueue.Workrequest_class;
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
    private EcoCommunity business;
    private User_account_class userAccount;
    private Lab_org_class labOrganization;
    private Network_class network;
    private Enterprise_class enterprise;
    private static Logger log = Logger.getLogger(LabAssistantWorkAreaJPanel.class);
    private static final String CLASS_NAME = LabAssistantWorkAreaJPanel.class.getName();

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, User_account_class userAccount, org_class organization, Enterprise_class enterprise, EcoCommunity business, Network_class network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.labOrganization = (labOrganization) organization;
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
                if (userAccount.getUser_Name().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {

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
            if (!userAccount.getUser_Name().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        int flag = 0;

        for (Workrequest_class request : labOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getWorkrequest_status()== null) {
                continue;
            }
            if (request.getWorkrequest_status().equals("Pending")) {

                if (request.getWorkrequest_receiver()!= null) {

                    if (userAccount.getUser_Name().equalsIgnoreCase(request.getWorkrequest_receiver().toString())) {
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
        for (Workrequest_class request : labOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getWorkrequest_status()== null) {
                continue;
            }
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
                if (request.getWorkrequest_status().equals("Processing") && userAccount.getUser_Name().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {
                    flag1 = 1;
                }
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        Workrequest_class request = (Workrequest_class) jTable_LAB_WORJ.getValueAt(selectedRow, 0);
        request.setWorkrequest_receiver(userAccount);
        request.setWorkrequest_status("Pending");
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
        lab_class_workrequest request = (lab_class_workrequest) jTable_LAB_WORJ.getValueAt(selectedRow, 0);
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) != null) {
            if (((jTable_LAB_WORJ.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
        //to check whether task is assigned forr process
        if (jTable_LAB_WORJ.getValueAt(selectedRow, 5) != null) {
            if (jTable_LAB_WORJ.getValueAt(selectedRow, 6) == null || !userAccount.getUser_Name().equalsIgnoreCase(jTable_LAB_WORJ.getValueAt(selectedRow, 5).toString())) {
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

        LabProcessRequestJPanel processWorkRequestJPanel = new LabProcessRequestJPanel(userProcessContainer, request, labOrganization, userAccount, network);
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

        for (Workrequest_class request : labOrganization.getWorkQueue().getWorkRequestList()) {

            Object[] row = new Object[8];
            row[0] = ((lab_class_workrequest) request);
            row[1] = ((lab_class_workrequest) request).getPatient().getAge();
            row[2] = ((lab_class_workrequest) request).getPatient().getSex();
            row[3] = request.getWorkrequest_message();

            row[4] = request.getWorkrequest_sender().getEmployee().getEmpName();
            row[5] = request.getWorkrequest_receiver()== null ? null : request.getWorkrequest_receiver().getEmployee().getName();
            row[6] = request.getWorkrequest_status();
            row[7] = ((lab_class_workrequest) request).getPatient().getNewDrug();
            model.addRow(row);
        }
    }
}
