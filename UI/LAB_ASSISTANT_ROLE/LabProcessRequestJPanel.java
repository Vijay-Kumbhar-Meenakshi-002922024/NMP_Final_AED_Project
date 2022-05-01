/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LAB_ASSISTANT_ROLE;

/**
 *
 * @author dsnik
 */

import Doctor.Patient_class;
import Enterprise.Enterprise_class;
import Genetics.Genetic_class;
import Network.Network_class;
import Organization.Lab_org_class;
import Organization.org_class;
import User_account.User_account_class;
import WorkQueue.Drug_class_workrequest;
import WorkQueue.lab_class_workrequest;
import WorkQueue.Workrequest_class;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import UI.DOCTORROLE.WRITE_PRESCRIPTION_JPanel;

public class LabProcessRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabProcessRequestJPanel
     */
    private JPanel userProcessContainer;
    private lab_class_workrequest request;
    private Lab_org_class labOrganization;
    private User_account_class userAccount;
    private Network_class network;
    String filePath = "./genes data.txt";
    private static Logger log = Logger.getLogger(LabProcessRequestJPanel.class);
    private static final String CLASS_NAME = LabProcessRequestJPanel.class.getName();

    
     public LabProcessRequestJPanel(JPanel userProcessContainer, lab_class_workrequest request, org_class organization, User_account_class userAccount, Network_class network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.labOrganization = (Lab_org_class) organization;
        TXT_NAME.setText(request.getPatient_Name());
        populateTable();
        System.out.println(request.getStatus());

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
        LBL_PATIENT_NAME = new javax.swing.JLabel();
        TXT_NAME = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        JTable_lab_test = new javax.swing.JTable();
        lbl_gene = new javax.swing.JLabel();
        txt_gene = new javax.swing.JTextField();
        BTN_BACK = new javax.swing.JButton();
        BTN_SUBMIT = new javax.swing.JButton();
        BTN_ADD_GENE = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAB TEST PROCESSING");

        LBL_PATIENT_NAME.setText("PATIENT NAME");

        JTable_lab_test.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        JTable_lab_test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Gene"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_lab_test.setRowHeight(30);
        jScrollPane.setViewportView(JTable_lab_test);

        lbl_gene.setText("GENE");

        BTN_BACK.setText("BACK");
        BTN_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BACKActionPerformed(evt);
            }
        });

        BTN_SUBMIT.setText("SUBMIT RESULTS");
        BTN_SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SUBMITActionPerformed(evt);
            }
        });

        BTN_ADD_GENE.setText("ADD GENE");
        BTN_ADD_GENE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ADD_GENEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(LBL_PATIENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(TXT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lbl_gene, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTN_BACK))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_SUBMIT)
                                .addGap(53, 53, 53)
                                .addComponent(BTN_ADD_GENE))
                            .addComponent(txt_gene, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_PATIENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_gene, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_SUBMIT)
                    .addComponent(BTN_BACK)
                    .addComponent(BTN_ADD_GENE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BACKActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BTN_BACKActionPerformed

    private void BTN_SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SUBMITActionPerformed
        // TODO add your handling code here:
         BTN_SUBMIT.setEnabled(true);
        ArrayList<String> genecheck = new ArrayList<>();
        for (Genetic_class g : ((lab_class_workrequest) request).getPatient().getGene_History().getGenetics_History()) {
            genecheck.add(g.getGene_Name());

        }
        if (genecheck.size() <= 0) {
            JOptionPane.showMessageDialog(null, "no genes has been added to submit ");
            return;
        }
        request.setStatus("Completed");
        Drug_class_workrequest requestDrug = new Drug_class_workrequest();

        requestDrug.setPatient(((lab_class_workrequest) request).getPatient());

        requestDrug.setSender(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(requestDrug);
        for (Enterprise_class enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("***** Organization Name:" + enterprise.getOrgName());
            for (org_class organization : enterprise.getOrg_Diectory().getOrgList()) {
                System.out.println("***** Organization Name:" + organization.getOrgName());
                if (organization.getOrgName().equals("Drug Organization")) {
                    System.out.println("True");

                    System.out.println("***** organization Name" + organization.getOrgName());

                    organization.getWorkQueue().getWorkRequestList().add(requestDrug);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Result has been succesfully submited");
        BTN_SUBMIT.setEnabled(false);

    }//GEN-LAST:event_BTN_SUBMITActionPerformed

    private void BTN_ADD_GENEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ADD_GENEActionPerformed
        // TODO add your handling code here:
        
         Patient_class patient = ((lab_class_workrequest) request).getPatient();
        String geneName = txt_gene.getText().trim();
        if (geneName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add a gene");
            return;
        }

        ArrayList<String> genecheck = new ArrayList<>();
        for (Genetic_class g1 : patient.getGene_History().getGenetics_History()) {
            genecheck.add(g1.getGene_Name().toLowerCase());

        }
        if (genecheck.contains(geneName.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Gene already exists in the list ");
            return;
        }
        Genetic_class g = patient.getGene_History().getGenetics_History();
        g.getGene_Name(geneName);
        request.setPatient(patient);
        populateTable();
        saveRecord(g.getGene_Name());
        txt_gene.setText("");
    }//GEN-LAST:event_BTN_ADD_GENEActionPerformed
public void saveRecord(String gene) {
        try {
            FileWriter file = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(file);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(gene);
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(WRITE_PRESCRIPTION_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ADD_GENE;
    private javax.swing.JButton BTN_BACK;
    private javax.swing.JButton BTN_SUBMIT;
    private javax.swing.JTable JTable_lab_test;
    private javax.swing.JLabel LBL_PATIENT_NAME;
    private javax.swing.JTextField TXT_NAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbl_gene;
    private javax.swing.JTextField txt_gene;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
    DefaultTableModel model = (DefaultTableModel) JTable_lab_test.getModel();

        model.setRowCount(0);
        System.out.println(((lab_class_workrequest) request).getPatient().getGene_History().getGenetics_History());
        System.out.println(((lab_class_workrequest) request).getPatient().getGene_History().getGenetics_History().size());

        for (Genetic_class g : ((lab_class_workrequest) request).getPatient().getGene_History().getGenetics_History()) {

            Object[] row = new Object[2];
            row[0] = g.getGene_id();
            row[1] = g.getGene_Name();
            System.out.println(((lab_class_workrequest) request).getPatient());

            model.addRow(row);
        }

    }
}