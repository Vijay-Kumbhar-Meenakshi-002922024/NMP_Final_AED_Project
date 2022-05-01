/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PHARMACYROLE;

/**
 *
 * @author dsnik
 */
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class ViewPharmacyRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPharmacyRequestsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
     private static Logger log = Logger.getLogger(ViewPharmacyDetailsJPanel.class);
    private static final String CLASS_NAME = ViewPharmacyDetailsJPanel.class.getName();
   
    public ViewPharmacyRequestsJPanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise,Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.organization= organization;
        populateTable();
        log.debug(userAccount+" "+"viewed the drug requests");
    
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
        jScrollPane = new javax.swing.JScrollPane();
        Jtable_drugRequests = new javax.swing.JTable();
        BTN_BACK = new javax.swing.JButton();
        BTN_REFRESH = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Requested Medicine Details");

        Jtable_drugRequests.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        Jtable_drugRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "REQUIRED QUANTITY", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtable_drugRequests.setRowHeight(25);
        jScrollPane.setViewportView(Jtable_drugRequests);

        BTN_BACK.setText("BACK");
        BTN_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BACKActionPerformed(evt);
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
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(BTN_BACK)
                        .addGap(98, 98, 98)
                        .addComponent(BTN_REFRESH)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_BACK)
                    .addComponent(BTN_REFRESH))
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BACKActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyWorkAreaJPanel dw = (PharmacyWorkAreaJPanel) component;
        dw.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BTN_BACKActionPerformed

    private void BTN_REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REFRESHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_REFRESHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BACK;
    private javax.swing.JButton BTN_REFRESH;
    private javax.swing.JTable Jtable_drugRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    DefaultTableModel model = (DefaultTableModel)Jtable_drugRequests.getModel();
        
        model.setRowCount(0);
        
        
      // for(WorkRequest request : opOrganization.getWorkQueue().getWorkRequestList())
      
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = ((DrugWorkRequest) request).getDrugName();
            row[1] = ((DrugWorkRequest) request).getQuantity();
            row[2] = request.getReceiver();
            String result = ((DrugWorkRequest) request).getStatus();
            row[3] = result == null ? "Waiting" : result;
            if(((DrugWorkRequest) request).getDeliveryTime()==null){
                row[4]="Details yet to be updated by supplier";
            }
            else{
            row[4]  = "Expected delivery time " +((DrugWorkRequest) request).getDeliveryTime();
                    }
            
            model.addRow(row);
        }
    }
}