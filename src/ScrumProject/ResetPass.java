package ScrumProject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 * * @author Saron
 * * @author Manne
 * * @author Jiyan
 * * @author Victoria 
 * * @author Fatemeh
 * * @author Cornelia
 * * @author Samer
 * * @author Michael
 * * @author Rany
 * * @author Oday
 */
public class ResetPass extends javax.swing.JFrame {
private InfDB bloggdb;
private Admin adminId;
private User usersId;
private  int id;

//Connection med Databas.
    public ResetPass() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        usersId = new User(id); 
        adminId = new Admin(id);
    
        try{
        bloggdb = new InfDB("C:\\db\\Bloggdb.FDB"); 
        }
        catch(InfException e){ 
        JOptionPane.showMessageDialog(null,"Inloggningen misslyckades.");
        System.out.println("Databasuppkopplingen misslyckades. Felmeddelande: " + e.getMessage());
        }
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jAnstalldId = new javax.swing.JPasswordField();
        jNewPass = new javax.swing.JPasswordField();
        jConfPass = new javax.swing.JPasswordField();
        jMejl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboAnvandareTyp = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-postadress");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Anställd ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nytt Lösenord");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bekräfta Lösenord");

        jAnstalldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnstalldIdActionPerformed(evt);
            }
        });

        jNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewPassActionPerformed(evt);
            }
        });

        jConfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfPassActionPerformed(evt);
            }
        });

        jMejl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMejlActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Bekräfta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Stäng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboAnvandareTyp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboAnvandareTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Användare", "User", "Admin" }));
        jComboAnvandareTyp.setKeySelectionManager(null);
        jComboAnvandareTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAnvandareTypActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboAnvandareTyp, 0, 136, Short.MAX_VALUE)
                        .addComponent(jNewPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jConfPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jAnstalldId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jMejl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMejl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAnstalldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addComponent(jComboAnvandareTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
        );

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ändra Lösenord");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMejlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMejlActionPerformed
            //Metod för att anropa UserId
    }//GEN-LAST:event_jMejlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose(); //Stänger fönstret
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jMejl.setText(null);  
       jAnstalldId.setText(null);
       jNewPass.setText(null);
       jConfPass.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewPassActionPerformed
            
    }//GEN-LAST:event_jNewPassActionPerformed

    //HuvudMetod som hanterar att ge nytt lösenord till user och admin.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(Validering.textFaltHarVarde(jMejl)   && Validering.textFaltHarVarde(jNewPass) && Validering.textFaltHarVarde(jConfPass)){
                                
       String mejl= jMejl.getText();
       String employedID= jAnstalldId.getText();   
       String newpass= jNewPass.getText(); 
       String confpass= jConfPass.getText();
       String userTyp = jComboAnvandareTyp.getSelectedItem().toString();
switch (userTyp) { 
     case "User": 
            try{
                int id = usersId.UserId(mejl);
                 String anvid = String.valueOf(id);
                String emejlF = usersId.UserMejl(id);
              if(mejl.equals(emejlF) && newpass.equals(confpass) && employedID.equals(anvid)){ 
                                                                          
                bloggdb.update( "UPDATE ANSTALLD SET LOSENORD = '"+newpass+"' WHERE ANSTALLD.ANSTALLDID = '"+id+"'");
                 JOptionPane.showMessageDialog(null,"Lösenordet har ändrats, logga in med ditt nya lösenord!");
                               
                  } else{
              
               JOptionPane.showMessageDialog(null,"Du får bara ändra ditt lösenord.");
              }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Felmeddelande:");

               }
      case "Admin":
            try{
                int id = adminId.AdminId(mejl);
                String anvid = String.valueOf(id);
                String emejlF = adminId.AdminMejl(id);
              if(mejl.equals(emejlF) && newpass.equals(confpass) && employedID.equals(anvid)){
                bloggdb.update( "UPDATE ANSTALLD SET LOSENORD = '"+newpass+"' WHERE ANSTALLD.ANSTALLDID = '"+id+"'");
                 JOptionPane.showMessageDialog(null,"Lösenordet har ändrats, logga in med ditt nya lösenord!");
                  } else{
              
               JOptionPane.showMessageDialog(null,"Du får bara ändra ditt lösenord.");
              }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Felmeddelande:");

               }
     
          }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jAnstalldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnstalldIdActionPerformed
       
    }//GEN-LAST:event_jAnstalldIdActionPerformed

    private void jConfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfPassActionPerformed
        
    }//GEN-LAST:event_jConfPassActionPerformed

    private void jComboAnvandareTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAnvandareTypActionPerformed
        
    }//GEN-LAST:event_jComboAnvandareTypActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPass().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jAnstalldId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboAnvandareTyp;
    private javax.swing.JPasswordField jConfPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jMejl;
    private javax.swing.JPasswordField jNewPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
