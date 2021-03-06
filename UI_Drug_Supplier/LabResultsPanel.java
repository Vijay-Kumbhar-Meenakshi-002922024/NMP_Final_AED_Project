/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Drug_Supplier;
import Business.Doctor.Patient;
import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Gene.Gene;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import UI.LAB_ASSISTANT_ROLE.LabProcessRequestJPanel;
/**
 *
 * @author korapava
 */
public class LabResultsPanel extends javax.swing.JPanel {

    
  private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DrugOrganization drugOrganization;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(LabResultsPanel.class);
    private static final String CLASS_NAME = LabResultsPanel.class.getName();
    /**
     * Creates new form LabResultsPanel
     */
    public LabResultsPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, DrugOrganization drugOrganization, Network network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.drugOrganization = drugOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
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

        lblLabResults = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGenerateDrug = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblLabResults.setText("Lab Results");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Sender"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnGenerateDrug.setText("Generate Drug");
        btnGenerateDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateDrugActionPerformed(evt);
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
                        .addGap(345, 345, 345)
                        .addComponent(lblLabResults, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btnGenerateDrug))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(btnBack)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblLabResults, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnGenerateDrug)
                .addGap(36, 36, 36)
                .addComponent(btnBack)
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateDrugActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = jTable1.getSelectedRow();

         if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        int flag = 0;
        Patient patient = (Patient)  jTable1.getValueAt(selectedRow, 0);
        if(patient.getNewDrug()!=null)
        {
            JOptionPane.showMessageDialog(null, "Drug has been identified already");
        }
        
          List<String> patientGene = new ArrayList<>();
        for (int i = 0; i < patient.getGeneHistory().getGeneHistory().size(); i++) {
            Gene g = patient.getGeneHistory().getGeneHistory().get(i);
            patientGene.add(g.getGeneName());

        }
        Collections.sort(patientGene);
        List<String> totaldrugGene = new ArrayList<>();
      for (Drug d : business.getDrugList().getDrugList()) {
            List<String> drugGene = new ArrayList<>();
            for (int i = 0; i < d.getGeneHistory().getGeneHistory().size(); i++) {
                Gene g = d.getGeneHistory().getGeneHistory().get(i);
                drugGene.add(g.getGeneName());
                totaldrugGene.add(g.getGeneName());
            }
            Collections.sort(drugGene);

            if (drugGene.equals(patientGene)) {
                AvailableDrugResults existingDrugResultsJpanel = new AvailableDrugResults(userProcessContainer, userAccount, enterprise, drugOrganization, network, d);

                userProcessContainer.add("existingDrugResultsJpanel", existingDrugResultsJpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = 1;
            }

        }
        System.out.println(totaldrugGene.containsAll(patientGene));
         if (!totaldrugGene.containsAll(patientGene)) {
                NonAvailableGenePanel nonExistingGeneJpanel = new NonAvailableGenePanel(userProcessContainer, userAccount, enterprise, drugOrganization, network);

                userProcessContainer.add("nonExistingGeneJpanel", nonExistingGeneJpanel);
                log.debug(userAccount+" "+"entering nonexisting page as drug doesn't exist");
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = 2;
            }
        

        if (flag == 0) {
            PopulateNewDrug generateDrugNewDrugJPanel = new PopulateNewDrug(userProcessContainer, patient, drugOrganization, userAccount, network,business);

            userProcessContainer.add("generateDrugNewDrugJPanel", generateDrugNewDrugJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            log.debug(userAccount+" "+"entering new drug page as no drug exists");
            layout.next(userProcessContainer);
        }

        
        
    }//GEN-LAST:event_btnGenerateDrugActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Workspace_Drug_Supplier dwjp = (Workspace_Drug_Supplier) component;
        dwjp.generateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_btnBackActionPerformed


    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)  jTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest request : drugOrganization.getWorkQueue().getWorkRequestList()) {

            if (((DrugWorkRequest) request).getPatient() != null) {
                Object[] row = new Object[7];
                row[0] = ((DrugWorkRequest) request).getPatient();
                row[1] = ((DrugWorkRequest) request).getPatient().getAge();
                row[2] = ((DrugWorkRequest) request).getPatient().getSex();
                row[3] = ((DrugWorkRequest) request).getPatient().getTest();

                row[4] = request.getSender().getEmployee().getName();
                               model.addRow(row);
            }
        }

    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateDrug;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLabResults;
    // End of variables declaration//GEN-END:variables
}
