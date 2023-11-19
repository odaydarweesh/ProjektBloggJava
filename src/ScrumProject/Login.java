package ScrumProject;

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
public class Login extends javax.swing.JFrame {
private User userId;
private Admin adminId;
private  int id;

//En konstruktor som connectar till Databasen. 
    public Login(InfDB bloggdb) {
        
        initComponents();
        userId = new User(id); 
        adminId = new Admin(id);
         try{ 
                bloggdb = new InfDB("C:\\db\\Bloggdb.FDB");
        }catch(InfException e){
                JOptionPane.showMessageDialog(null,"Inloggningen misslyckades."); 
                System.out.println("Databasuppkopplingen misslyckades. Felmeddelande: " + e.getMessage()); 
                }
        this.setLocationRelativeTo(null); 
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtUser = new javax.swing.JTextField();
        jTxtPass = new javax.swing.JPasswordField();
        cbValjAnvandTyp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jForgotPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inloggning");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-postadress:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lösenord:");

        jTxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUserActionPerformed(evt);
            }
        });

        jTxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPassActionPerformed(evt);
            }
        });

        cbValjAnvandTyp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbValjAnvandTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Användare", "User", "Admin" }));
        cbValjAnvandTyp.setKeySelectionManager(null);
        cbValjAnvandTyp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbValjAnvandTypMouseClicked(evt);
            }
        });
        cbValjAnvandTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjAnvandTypActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Logga in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Stäng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jForgotPass.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jForgotPass.setForeground(new java.awt.Color(255, 255, 255));
        jForgotPass.setText("Glömt lösenordet?");
        jForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jForgotPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValjAnvandTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jForgotPass)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbValjAnvandTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jForgotPass, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jTxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUserActionPerformed
            
    }//GEN-LAST:event_jTxtUserActionPerformed

    private void jTxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPassActionPerformed
            
    }//GEN-LAST:event_jTxtPassActionPerformed

//Visar Resetknapp. 
    private void jForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jForgotPassMouseClicked
        ResetPass respass = new ResetPass(); 
        respass.setVisible(true);
    }//GEN-LAST:event_jForgotPassMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTxtUser.setText(null);
        jTxtPass.setText(null);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         System.exit(0); 
    }//GEN-LAST:event_jButton3ActionPerformed

    //Koden hanterar inlogg, lösenord och typ av användare och kontrolleras mot Databasen. 
    //Om det inte stämmer skickas ett felmeddelande om info. 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (Validering.textFaltHarVarde(jTxtUser) && Validering.textFaltHarVarde(jTxtPass)){  
            String user = jTxtUser.getText();   
            String pass = new String(jTxtPass.getPassword()); 
            String userTyp = cbValjAnvandTyp.getSelectedItem().toString();
            
    switch (userTyp) { 
        case "User": 
            try{
                    int id = userId.UserId(user);
                    String namn = userId.UserMejl(id);
                    String losenord = userId.UserLosenord(id);
                    String typ = userId.UserTyp(id);
                if(typ.equals("N")&& user.equals(namn)&& pass.equals(losenord)){
                    JOptionPane.showMessageDialog(null,"Lösenordet är rätt. Välkommen User!");
                    User us = new User(id);
                    us.setVisible(true);
                    us.toFront();
                     dispose();
                }
                else 
                {
                     JOptionPane.showMessageDialog(null,"Epost/lösenord är fel eller så har du valt fel användartyp.");
                }
           }catch(Exception e){ 
                    JOptionPane.showMessageDialog(null,"Epost/lösenord är fel eller så har du valt fel användartyp.");
                    System.out.println(e.getMessage());
            }   break; 
        case "Admin": 
            try{
                    int id = adminId.AdminId(user);
                    String namn = adminId.AdminMejl(id);
                    String losenord = adminId.AdminLosenord(id);
                    String typ = adminId.AdminTyp(id);
                if(typ.equals("J")&& user.equals(namn)&& pass.equals(losenord)){
                    JOptionPane.showMessageDialog(null,"Lösenordet är rätt. Välkommen Admin!");
                    Admin ad = new Admin(id);
                    ad.setVisible(true);
                    ad.toFront();
                     dispose();
                }
                else 
                {
                     JOptionPane.showMessageDialog(null,"Epost/lösenord är fel eller så har du valt fel användartyp.");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Epost/lösenord är fel eller så har du valt fel användartyp.");
            }   break; 
       
    }
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbValjAnvandTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjAnvandTypActionPerformed
                
    }//GEN-LAST:event_cbValjAnvandTypActionPerformed

    private void cbValjAnvandTypMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbValjAnvandTypMouseClicked
        
    }//GEN-LAST:event_cbValjAnvandTypMouseClicked
     public void setId(int id){ 
     this.id =id;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValjAnvandTyp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jForgotPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTxtPass;
    private javax.swing.JTextField jTxtUser;
    // End of variables declaration//GEN-END:variables


}
