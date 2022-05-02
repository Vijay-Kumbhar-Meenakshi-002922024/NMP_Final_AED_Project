/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
*/
package UI_Drug_Supplier;
import Business.Chemical.Chemical;
import Business.Drug.Drug;
import Business.Drug.DrugList;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Gene.Gene;
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
/**
 *
 * @author korapava
 */
public class AddChemicalsPanel extends javax.swing.JPanel {

    
    
     private Drug drug;
    private DrugList drugList;
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DrugOrganization drugOrganization ;
    private Enterprise enterprise;
    private Object e;
    private static Logger log = Logger.getLogger(AddChemicalsPanel.class);
    private static final String CLASS_NAME = AddChemicalsPanel.class.getName();
    
    private Network network;
    /**
     * Creates new form AddChemicalsPanel
     */
    public AddChemicalsPanel(
    JPanel userProcessContainer,EcoSystem business,UserAccount userAccount,DrugOrganization organization,Enterprise enterprise,Network network,Drug drug) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.network = network;
        this.drug = drug;
        this.drugOrganization = (DrugOrganization)organization;
        generateTable();
          }
    
        public void generateTable(){
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        Object[] row = new Object[2];
        int i = 0;
           for(Chemical c : drug.getChemicalList().getChemList()){
                    row[0] = c.getChemicalName();
                 
                    
                       Gene g=  drug.getGeneHistory().getGeneHistory().get(i);
                      
                        
                      row[1] = g.getGeneName();
                      model.addRow(row);
                     i++;
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

        lblChemicalandGeneNames = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_ChemicalName = new javax.swing.JLabel();
        lbl_GeneName = new javax.swing.JLabel();
        txt_ChemicalName = new javax.swing.JTextField();
        txt_GeneName = new javax.swing.JTextField();
        txtChemicalAdd = new javax.swing.JButton();
        btnChemicalBack = new javax.swing.JButton();

        lblChemicalandGeneNames.setText("Chemical and Gene Names");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Chemical Name", "Gene Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lbl_ChemicalName.setText("Chemical Name");

        lbl_GeneName.setText("Gene Name");

        txtChemicalAdd.setText("Add");
        txtChemicalAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChemicalAddActionPerformed(evt);
            }
        });

        btnChemicalBack.setText("Back");
        btnChemicalBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChemicalBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(lblChemicalandGeneNames))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_GeneName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_GeneName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_ChemicalName)
                                .addGap(77, 77, 77)
                                .addComponent(txt_ChemicalName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChemicalBack)
                            .addComponent(txtChemicalAdd))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblChemicalandGeneNames)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lbl_ChemicalName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(txt_ChemicalName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_GeneName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GeneName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtChemicalAdd)
                .addGap(18, 18, 18)
                .addComponent(btnChemicalBack)
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtChemicalAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChemicalAddActionPerformed
        // TODO add your handling code here:
        
         String chemicalName = txt_ChemicalName.getText().trim();
         String geneName = txt_GeneName.getText().trim();
         if(chemicalName.isEmpty())
         {
             JOptionPane.showMessageDialog(null,"Please enter the chemical name");
             return;
         }
         if(geneName.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "please enter the gene name ");
             return;
         }
         ArrayList<String> chemicalCheck = new ArrayList<>();
                for(Chemical c : drug.getChemicalList().getChemList())
         {
             chemicalCheck.add(c.getChemicalName().toLowerCase());
             
         }
         ArrayList<String>genecheck= new ArrayList<>();
        for(Gene g:drug.getGeneHistory().getGeneHistory())
         {
               genecheck.add(g.getGeneName().toLowerCase());
         }
         if(chemicalCheck.contains(chemicalName.toLowerCase()))
         {
             JOptionPane.showMessageDialog(null,"Chemical already exists in the drug ");
             return;
             
         }
         if(genecheck.contains(geneName.toLowerCase()))
         {
          JOptionPane.showMessageDialog(null,"Gene already exists in the drug ");
             return;   
         }
       drug.getChemicalList().addChemicalList().setChemicalName(chemicalName);
        drug.getGeneHistory().addGeneList().setGeneName(geneName);
       
        generateTable();
        log.debug(userAccount+" "+"added chemicals and genes to drug"+" "+drug);
        txt_ChemicalName.setText("");
        txt_GeneName.setText("");
        
        
    }//GEN-LAST:event_txtChemicalAddActionPerformed

    private void btnChemicalBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChemicalBackActionPerformed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AddDrugPanel dwjp = (AddDrugPanel) component;
        dwjp.generateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_btnChemicalBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChemicalBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblChemicalandGeneNames;
    private javax.swing.JLabel lbl_ChemicalName;
    private javax.swing.JLabel lbl_GeneName;
    private javax.swing.JButton txtChemicalAdd;
    private javax.swing.JTextField txt_ChemicalName;
    private javax.swing.JTextField txt_GeneName;
    // End of variables declaration//GEN-END:variables
}
