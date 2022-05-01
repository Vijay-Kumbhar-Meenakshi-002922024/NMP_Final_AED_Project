/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Drug_Supplier;

import Business.ChemicalInventory.ChemicalCompound;
import Business.Enterprise.Enterprise;
import Business.MedicalInventory.MedicalInventory;
import Business.MedicalInventory.MedicalInventoryList;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import UI.PHARMACYROLE.PharmacyWorkAreaJPanel;

/**
 *
 * @author korapava
 */
public class DisplayChemicaldetails extends javax.swing.JPanel {

    /**
     * Creates new form DisplayChemicaldetails
     */
    
    
    JPanel userProcessContainer;
    
    private UserAccount userAccount;
    private Enterprise enterprise;
    private MedicalInventoryList mil;
    private DrugOrganization drugOrg;
    private ChemicalCompound mi;
    private static Logger log = Logger.getLogger( DisplayChemicaldetails.class);
    private static final String CLASS_NAME = DisplayChemicaldetails.class.getName();
    public DisplayChemicaldetails(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise,ChemicalCompound mi) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.drugOrg= drugOrg;
        this.mi=mi;
       
        
         txtSerialNumber.setText(String.valueOf(mi.getSerialNumber()));
        txtAvailibity.setText(String.valueOf(mi.getAvailQuantity()));
        txtChemicalName.setText(mi.getChemicalName());
        btnSave.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDetailsofChemical = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblChemicalName = new javax.swing.JLabel();
        txtChemicalName = new javax.swing.JTextField();
        lblAvailibity = new javax.swing.JLabel();
        txtAvailibity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBcak = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        lblDetailsofChemical.setText("Details of Chemical");

        lblSerialNumber.setText("Serial Number");

        lblChemicalName.setText("Chemical Name");

        txtChemicalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChemicalNameActionPerformed(evt);
            }
        });

        lblAvailibity.setText("Availibity");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBcak.setText("Back");
        btnBcak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBcakActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(lblDetailsofChemical))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSerialNumber)
                                    .addComponent(lblChemicalName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(lblAvailibity)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(79, 79, 79)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSerialNumber)
                                .addComponent(txtChemicalName, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(txtAvailibity)))))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addComponent(btnBcak)
                    .addContainerGap(542, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblDetailsofChemical)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChemicalName)
                    .addComponent(txtChemicalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailibity)
                    .addComponent(txtAvailibity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(348, Short.MAX_VALUE)
                    .addComponent(btnBcak)
                    .addGap(222, 222, 222)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtChemicalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChemicalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChemicalNameActionPerformed

    private void btnBcakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBcakActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DisplayChemicalRequestPanel me = (DisplayChemicalRequestPanel) component;
        me.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBcakActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        if(txtChemicalName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "chemical name is empty");
            return;
        }
        mi.setChemicalName(txtChemicalName.getText());
        
        try{
        int availableQuantity= Integer.parseInt(txtAvailibity.getText());
        mi.setAvailQuantity(availableQuantity);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;
        }
        try{
        int serialNumber= Integer.parseInt(txtSerialNumber.getText());
        mi.setSerialNumber(serialNumber);
        }
         catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Serial number must be integer");
            return;
        }
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
         txtChemicalName.setEditable(false);
        txtSerialNumber.setEditable(false);
        txtAvailibity.setEditable(false);

        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        log.debug(userAccount+" "+"updated chemical details successfully");
  
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtChemicalName.setEditable(true);
        txtSerialNumber.setEditable(true);
        txtAvailibity.setEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBcak;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAvailibity;
    private javax.swing.JLabel lblChemicalName;
    private javax.swing.JLabel lblDetailsofChemical;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTextField txtAvailibity;
    private javax.swing.JTextField txtChemicalName;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
