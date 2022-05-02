/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAssistantRole;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;

//import Business.Doctor.Patient;
import Business.Patient.PatientDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalAssistantOrg;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;
import Business.Doctor.PrescriptionList;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import Business.WorkQueue.Account_Billing_request;
/**
 *
 * @author dsnik
 */
public class Generate_BillJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Generate_BillJPanel
     */
        private JPanel userProcessContainer;
    private UserAccount account;
    private DoctorOrganization org;
    private Enterprise enterprise;
private HospitalAssistantOrg organization;
private PatientDirectory dr;
private Patient pt;
private Account_Billing_request accountBillingRequest;
    private Network network;
    private EcoSystem system;
    private Enterprise.EnterpriseType enterpriseType;
    public Generate_BillJPanel(JPanel userProcessContainer, UserAccount account, HospitalAssistantOrg organization, Enterprise enterprise, EcoSystem system, Network network) {
       
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        this.dr= dr;
        this.pt=pt;
       // LBL_VALUE.setText(enterprise.getName());
        populateRequestTable();
    }
 public void populateRequestTable() {

     String frstName = TXT_FRST_NAME.getText();
     String lastName = TXT_LASTNAME.getText();
     String PhoneNum = String.valueOf(TXT_PHONE.getText());
     String email = String.valueOf(TXT_EMAIL.getText());
     String age = TXT_AGE.getText();
     String hosp_fee = String.valueOf(TXT_HOS_FEE.getText());
     pt.setPatientFirstName(TXT_FRST_NAME.getText());
     Account_Billing_request acc = new Account_Billing_request();
     acc.setBillingAmount(hosp_fee);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

     model.setRowCount(0);
      for(Patient pt : dr.getpatients()){
          
         
   Object[] row = new Object[6];
           // row[0] = ((PatientTreatmentWorkRequest) request).getPatient();
            //row[1] = String.valueOf(((PatientTreatmentWorkRequest) request).getPatient().getPatientId());
            row[0] = frstName;
            row[1] = lastName;
            row[2] = PhoneNum;
            row[3] = email;
            row[4] = age;
            row[5] = hosp_fee;
            model.addRow(row);
 
     }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
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
        TXT_HOS_FEE = new javax.swing.JTextField();
        btn_email_bill = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXT_EMAIL = new javax.swing.JTextField();
        TXT_PHONE = new javax.swing.JTextField();
        TXT_LASTNAME = new javax.swing.JTextField();
        TXT_FRST_NAME = new javax.swing.JTextField();
        BTN_BILL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        TXT_AGE = new javax.swing.JTextField();

        jLabel1.setText("HOSPITAL FEE");

        btn_email_bill.setText("Email Bill");
        btn_email_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_email_billActionPerformed(evt);
            }
        });

        jLabel2.setText("FIRST NAME");

        jLabel3.setText("LAST NAME");

        jLabel4.setText("PHONE NUMBER");

        jLabel5.setText("EMAIL");

        BTN_BILL.setText("ADD BILL");
        BTN_BILL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BILLActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRST NAME", "LASTNAME", "PHONE", "EMAIL", "AGE", "FEE AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("AGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXT_AGE, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(TXT_EMAIL)
                            .addComponent(TXT_PHONE)
                            .addComponent(TXT_LASTNAME)
                            .addComponent(TXT_FRST_NAME)
                            .addComponent(TXT_HOS_FEE, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(BTN_BILL)
                        .addGap(58, 58, 58)
                        .addComponent(btn_email_bill)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_FRST_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TXT_LASTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TXT_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXT_AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_HOS_FEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_email_bill)
                    .addComponent(BTN_BILL))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_email_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_email_billActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       userProcessContainer.add("EmailBillingInformationToPatient", new EmailBillingInformationToPatient(userProcessContainer, this.accountBillingRequest));
        layout.next(userProcessContainer);
            
    }//GEN-LAST:event_btn_email_billActionPerformed

    private void BTN_BILLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BILLActionPerformed
        // TODO add your handling code here:
         if (TXT_FRST_NAME.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide first name");
            return;
        }
        if (TXT_LASTNAME.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide last name");
            return;
        }
       
        if (TXT_PHONE.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide phone");
            return;
        }
        
        if (TXT_AGE.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide age");
            return;
        }
                
       /* if (buttonGroup1.isSelected(null)) {
            JOptionPane.showMessageDialog(null, "Please choose if Patient covered by Insurance");
            return;
        }*/
        
       
        if (TXT_EMAIL.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide an Email ID");
            return;
            
        }
        if (!usernamePatternCorrect(TXT_EMAIL.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Please provide a valid email ID in the format xxxx@xx.xx");
            
        }
        else {
            
           
            String firstName = TXT_FRST_NAME.getText().trim();
            String lastName = TXT_LASTNAME.getText().trim();
            
            
            String phoneNo = TXT_PHONE.getText().trim();
            
            if (!phonePatternCorrect()) {
                JOptionPane.showMessageDialog(null, "/* Following are valid phone number examples */             \n"
                        + "              \"1234567890\", \"123-456-7890\", \"(123)4567890\", \"(123)456-7890\",\n"
                        + "              /* Following are invalid phone numbers */ \n"
                        + "              \"(1234567890)\",\"123)4567890\", \"12345678901\", \"(1)234567890\",");
                TXT_PHONE.setBorder(BorderFactory.createLineBorder(Color.RED));
                
                return;
            }
            
            if (phonePatternCorrect()) {
                TXT_PHONE.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                
            }
            
           
            
            
            String age = TXT_AGE.getText().trim();
            
            try {
                Integer.parseInt(age);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide integer values in Age textfield");
                return;
            }
              
                        
               JOptionPane.showMessageDialog(null, "Bill created Successfully");
               populateRequestTable();
        } 
    }//GEN-LAST:event_BTN_BILLActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BILL;
    private javax.swing.JTextField TXT_AGE;
    private javax.swing.JTextField TXT_EMAIL;
    private javax.swing.JTextField TXT_FRST_NAME;
    private javax.swing.JTextField TXT_HOS_FEE;
    private javax.swing.JTextField TXT_LASTNAME;
    private javax.swing.JTextField TXT_PHONE;
    private javax.swing.JButton btn_email_bill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
private boolean phonePatternCorrect() {
        
        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(TXT_PHONE.getText());
        
        boolean b = false;
        
        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }
        
        return b;
    }
 private boolean usernamePatternCorrect(String username) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
        Matcher m = p.matcher(username);
        boolean b = m.matches();
        return b;
        
    }
    
   
}
