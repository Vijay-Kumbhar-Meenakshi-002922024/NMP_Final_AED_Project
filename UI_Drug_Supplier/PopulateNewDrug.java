/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Drug_Supplier;

import Business.Chemical.Chemical;
import Business.Doctor.Patient;
import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Gene.Gene;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;



/**
 *
 * @author korapava
 */
public class PopulateNewDrug extends javax.swing.JPanel {

    
  private JPanel userProcessContainer;
    private Patient patient;
    private DrugOrganization drugOrganization;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem business;
    private static Logger log = Logger.getLogger(PopulateNewDrug.class);
    private static final String CLASS_NAME = PopulateNewDrug.class.getName();
    
    /**
     * Creates new form PopulateNewDrug
     */
    public PopulateNewDrug(JPanel userProcessContainer, Patient patient, DrugOrganization drugOrganization, UserAccount userAccount, Network network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.drugOrganization = drugOrganization;
        this.userAccount = userAccount;
        this.network = network;
        this.business = business;
        txtPatientName.setText(patient.getPatientName());
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

        lblNewDrug = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtlAddNewDrug = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        BTNAddNewDrug = new javax.swing.JButton();

        lblNewDrug.setText("New Drug");

        lblPatientName.setText("Patient Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Gene Name", "Compound Mixture"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        BTNAddNewDrug.setText("Add New Drug");
        BTNAddNewDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAddNewDrugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(lblNewDrug))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblPatientName)
                        .addGap(100, 100, 100)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(BTNAddNewDrug)
                        .addGap(55, 55, 55)
                        .addComponent(txtlAddNewDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(btnBack)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblNewDrug)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlAddNewDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAddNewDrug))
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabResultsPanel dwjp = (LabResultsPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void BTNAddNewDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAddNewDrugActionPerformed
        // TODO add your handling code here:
        
        String drugName = txtlAddNewDrug.getText().trim();
        if(drugName.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the drug name");
            return;
        }
        ArrayList<String>drugCheck = new ArrayList<>();
          for(Drug d:business.getDrugList().getDrugList())
        {
            drugCheck.add(d.getDrugName().toLowerCase());
        }
        if(drugCheck.contains(drugName))
        {
             JOptionPane.showMessageDialog(null, " Drug name already exists ");
            return;
        }
           Drug d = business.getDrugList().addDrugList();
        d.setDrugName(drugName);
        patient.setNewDrug(drugName);
        int count = jTable1.getRowCount();
        for (int i = 0; i < count; i++) {
            String s = jTable1.getValueAt(i, 0).toString();
             d.getGeneHistory().addGeneList().setGeneName(s);
            String t = jTable1.getValueAt(i, 1).toString();
            d.getChemicalList().addChemicalList().setChemicalName(t);

        }
        JOptionPane.showMessageDialog(null,"New Drug is added succesfully");
        log.debug(userAccount+" "+"added new drug"+" "+drugName);

        
    }//GEN-LAST:event_BTNAddNewDrugActionPerformed

    
     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        List<String> newDiseaseGenes = new ArrayList<String>();
           for (Gene gene : patient.getGeneHistory().getGeneHistory()) {
            newDiseaseGenes.add(gene.getGeneName());
        }

        int i = 0;
       Map<String, String> GeneChem = new TreeMap<String, String>((String.CASE_INSENSITIVE_ORDER));
        for (Drug d : business.getDrugList().getDrugList()) {

            for (i = 0; i < d.getChemicalList().getChemList().size(); i++) {

                Chemical c = d.getChemicalList().getChemList().get(i);
                Gene g = d.getGeneHistory().getGeneHistory().get(i);
                GeneChem.put(g.getGeneName(), c.getChemicalName());
            }

        }

        Map<String, String> newDrugFinal = new TreeMap<String, String>((String.CASE_INSENSITIVE_ORDER));
        for (String s : newDiseaseGenes) {

            if (GeneChem.containsKey(s)) {

                newDrugFinal.put(s, GeneChem.get(s));
            }
        }

        for (Map.Entry<String, String> entry : newDrugFinal.entrySet()) {
            String key = entry.getKey();
            String values = entry.getValue();
            Object[] row = new Object[2];
            row[0] = key;
            row[1] = values;
            model.addRow(row);
        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAddNewDrug;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNewDrug;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtlAddNewDrug;
    // End of variables declaration//GEN-END:variables
}
