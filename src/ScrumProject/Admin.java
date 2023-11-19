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
public class Admin extends javax.swing.JFrame {

    private InfDB bloggdb;
    public Login login;
    public ResetPass reset;
    public static int id;

    public Admin(int id) {
        this.id = id;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//Metoder som kontrollerar att databasuppkopplingen sker. Kontrollerar mot Mejl, AnställningsID och Lösenord
//Admin kan loggas in. Om ja; loggas Admin in
//Om nej kommer ett felmeddelande: 
        try {
            bloggdb = new InfDB("C:\\db\\Bloggdb.FDB");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Inloggningen misslyckades.");
            System.out.println("Databasuppkopplingen misslyckades. Felmeddelande: " + e.getMessage());
        }
        this.setLocationRelativeTo(null);
    }

    public int AdminId(String mejl) {
        try {
            String sql = bloggdb.fetchSingle("SELECT ANSTALLD.ANSTALLDID FROM ANSTALLD WHERE MEJL = '" + mejl + "'");
            id = Integer.parseInt(sql);
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

    public String AdminMejl(int id) {
        String fornamn = "";
        try {
            String sql = "SELECT ANSTALLD.MEJL FROM ANSTALLD WHERE ANSTALLD.ANSTALLDID = '" + id + "'";

            fornamn = bloggdb.fetchSingle(sql);
        } catch (InfException e) {
            System.out.print("Felmeddelande: Kan inte hämta information om Admin.");
        }
        return fornamn;
    }

    public String AdminLosenord(int id) {
        String losenord = "";
        try {
            String sql = "SELECT ANSTALLD.LOSENORD FROM ANSTALLD WHERE ANSTALLD.ANSTALLDID = '" + id + "'";
            losenord = bloggdb.fetchSingle(sql);
        } catch (InfException e) {
        }
        return losenord;
    }

    public String AdminTyp(int id) {
        String typ = "";
        try {
            String sql = bloggdb.fetchSingle("SELECT ANSTALLD.ADMINISTRATOR FROM ANSTALLD WHERE ANSTALLD.ANSTALLDID = '" + id + "'");
            typ = sql;
        } catch (InfException e) {
            System.out.print("Felmeddelande: Kan inte hämta information om Admin.");
        }
        return typ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tillbacka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jButton3.setText("Stäng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Huvudmeny");
        jButton5.setAutoscrolls(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(92, 92, 92)
                .addComponent(jButton3)
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Välkommen Admin");

        Tillbacka.setText("Logga ut");
        Tillbacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbackaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tillbacka, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed
        Login log = new Login(bloggdb);
        log.setVisible(true);
        dispose();

    }//GEN-LAST:event_TillbackaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Huvudmeny hu = new Huvudmeny(id);
        hu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin(id).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
