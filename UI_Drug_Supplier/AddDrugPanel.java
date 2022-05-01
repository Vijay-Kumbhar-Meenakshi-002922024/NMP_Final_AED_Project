/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Drug_Supplier;

/**
 *
 * @author korapava
 */


import Business.Drug.DrugList;
import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;


public class AddDrugPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDrugPanel
     */
    
  private DrugList drugList;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DrugOrganization drugOrganization;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(AddDrugPanel.class);
    private static final String CLASS_NAME = AddDrugPanel.class.getName();
    
    
    public AddDrugPanel(
        JPanel userProcessContainer,  EcoSystem business, UserAccount userAccount, DrugOrganization drugOrganization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.network = network;
        this.drugOrganization = drugOrganization;
        
        generateTable();
        
    }

     public void generateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

      model.setRowCount(0);

        for (Drug d : business.getDrugList().getDrugList()) {

            Object[] row = new Object[2];
            row[0] = d.getDrugId();
            row[1] = d;
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

        lblDrugData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblDrug = new javax.swing.JLabel();
        txtDrug = new javax.swing.JTextField();
        btnAddDrug = new javax.swing.JButton();
        btnAddChemical = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblDrugData.setText("Drug Data");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug ID", "Drug Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblDrug.setText("Drug");

        txtDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugActionPerformed(evt);
            }
        });

        btnAddDrug.setText("Add Drug");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
            }
        });

        btnAddChemical.setText("Add Chemical");
        btnAddChemical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChemicalActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnAddDrug)
                        .addGap(60, 60, 60)
                        .addComponent(btnAddChemical))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(txtDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(lblDrugData)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblDrugData)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDrug)
                    .addComponent(btnAddChemical))
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        // TODO add your handling code here:
        
         String drug_Name = txtDrug.getText().trim();
        if(drug_Name.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Drug name cannot be empty");
            return;
        }
        ArrayList<String> drugcheck= new ArrayList<>();
        for(Drug d:business.getDrugList().getDrugList())
        {
            drugcheck.add(d.getDrugName().toLowerCase());
        }
        if(drugcheck.contains(drug_Name.toLowerCase()))
        {
            JOptionPane.showMessageDialog(null,"Drug name already exists");
            return;
        }

        business.getDrugList().addDrugList().setDrugName(drug_Name);
        
        generateTable();
        log.debug(userAccount+" "+"added new drug"+" "+drug_Name);
        txtDrug.setText("");
        
        
    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnAddChemicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChemicalActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "please select a row ");
            return;
        }
         Drug c = (Drug) jTable1.getValueAt(selectedRow, 1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("AddChemicalsJPanel", new AddChemicalsPanel(userProcessContainer, business, userAccount, drugOrganization, enterprise, network, c));
        log.debug(userAccount+" "+"entering add chemicals page");
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnAddChemicalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddChemical;
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDrug;
    private javax.swing.JLabel lblDrugData;
    private javax.swing.JTextField txtDrug;
    // End of variables declaration//GEN-END:variables
}
