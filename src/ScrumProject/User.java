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
    public class User extends javax.swing.JFrame {
    private InfDB bloggdb;
    private static int id;
    private String mejl;

    //Connection med databasen. 
    public User(int id) {
        this.id =id;
        initComponents();
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        try{
             bloggdb = new InfDB("C:\\db\\Bloggdb.FDB"); 
        }catch(InfException e){
        JOptionPane.showMessageDialog(null,"Inloggningen misslyckades."); 
        System.out.println("Databasuppkopplingen misslyckades. Felmeddelande: " + e.getMessage());
           }
           this.setLocationRelativeTo(null); 
         }

    //Metoden hämtar AnställdID och returnerar anställd av typen intergear 
    public int UserId(String mejl){
           this.mejl= mejl;
     try {
           String sql = bloggdb.fetchSingle("SELECT ANSTALLD.ANSTALLDID FROM ANSTALLD WHERE MEJL = '"+mejl+"'"); 
           id = Integer.parseInt(sql);
    }catch(InfException e){
            System.out.print("Felmeddelande, kan inte hämta information om anställd.");
            System.out.println(e.getMessage());
                }
         return id;
        }

    //Metod hämtar anställdmejl och returnerar anställd mejl av typen String.
    public String UserMejl(int id){ 
           String mejl = "";
        try {
               String sql = bloggdb.fetchSingle("SELECT ANSTALLD.MEJL FROM ANSTALLD WHERE ANSTALLD.ANSTALLDID = '"+id+"'");
               mejl= sql;
        }catch(InfException ex){
             System.out.println(ex.getMessage());
                System.out.print("Felmeddelande, kan inte hämta information om anställd. ");
                 }
           return mejl;
          }
    //Hämtar anställdLösenord och returnerar den av typen String.
    public String UserLosenord(int id){ 
               String losenord = "";
        try {
               String sql = bloggdb.fetchSingle("SELECT ANSTALLD.LOSENORD FROM ANSTALLD WHERE ANSTALLD.ANSTALLDID = '"+id+"'");
               losenord= sql;
        }catch(InfException ex){
             System.out.println(ex.getMessage());
                System.out.print("Felmeddelande, kan inte hämta information om anställd.");
                 }
            return losenord;
            }
    //Hämtar Anställdstatus och returnerar den som en String. 
    public String UserTyp(int id){
               String typ = "";
        try {
               String sql = bloggdb.fetchSingle("SELECT ANSTALLD.ADMINISTRATOR FROM ANSTALLD WHERE ANSTALLD.ANSTALLDID = '"+id+"'"); 
               typ= sql;
        }catch(InfException e){
                System.out.print("Felmeddelande, kan inte hämta information om anställd.");
                 }
             return typ;
           }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tillbacka = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Välkommen User");

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
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Tillbacka)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Tillbacka))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jButton3.setText("Stäng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Huvudmeny");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(281, 281, 281))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton2)
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(158, 158, 158))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(178, 178, 178))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed
        Login log = new Login(bloggdb);
        log.setVisible(true);
        dispose();
    
    }//GEN-LAST:event_TillbackaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        HuvudmenyUser huvu = new HuvudmenyUser(id);
        huvu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
