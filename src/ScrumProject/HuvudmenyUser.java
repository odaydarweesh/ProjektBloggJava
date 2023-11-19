
package ScrumProject;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
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
public class HuvudmenyUser extends javax.swing.JFrame {
private InfDB bloggdb;
    private Login login;
    private User userId;
    private Admin adminId;
    private VisaInlagg visI; 
    private int id;
    private String postID ;
    /**
     * Creates new form HuvudmenyUser1
     */
    
    //Konstruktorn som innehåller olika koder för att kunna utföra olika funktioner. Gör connection med Databasen.
    public HuvudmenyUser(int id) {
        this.id =id;
        initComponents();
        adminId = new Admin(id);
        userId = new User(id);
            
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    
           
         try{
            bloggdb = new InfDB("C:\\db\\Bloggdb.FDB");  
       } catch(InfException e){ 
            JOptionPane.showMessageDialog(null,"Inloggningen misslyckades."); 
            System.out.println("Databasuppkopplingen misslyckad. Felmeddelande: " + e.getMessage());
                    }
            this.setLocationRelativeTo(null); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titel", "Beskrivning", "Anställd ID", "Post ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Visa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Inlägg Utvecklingsarbete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj inlägg", "Formell", "Informell" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Välj kategori");

        jButton6.setText("Skapa nytt inlägg");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Töm innehållet");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Kalender");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Svara på inbjudan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Se Utvecklingsarbete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jButton3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addGap(52, 52, 52))
        );

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Huvudmeny för användare");

        Tillbacka.setText("Tillbaka");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Tillbacka))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Skickar infot som finns i tabellen från Huvudmenyklassen till VisaInlägg interface 
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String titel = model.getValueAt(index, 0).toString();
        //      String bild = jTextField3.getText();
        String beskrivning = model.getValueAt(index, 1).toString();
        String anstalldID = model.getValueAt(index, 2).toString();
        postID = model.getValueAt(index, 3).toString();

        VisaInlagg jtRowInfo = new VisaInlagg(id,postID);
        jtRowInfo.setVisible(true);
        jtRowInfo.pack();
        jtRowInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jtRowInfo.jTextField1.setText(titel);
        jtRowInfo.jTextField2.setText(beskrivning);
        jtRowInfo.jTextField6.setText(anstalldID);
        jtRowInfo.jTextField5.setText(postID); 
         dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    //En metod som visar alla inlägg Koden hämtar aalla inlägg i Databasen och lägger dom i Tabellen. 
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<HashMap<String, String>> listaAllaInlagg;
       
        try{
            DefaultTableModel tblModel2 = (DefaultTableModel) jTable1.getModel(); //Rensar rader och kolumner
            tblModel2.setRowCount(0); //Rensar rader och kolumner
            String sql= "SELECT * FROM INLAGG";
            listaAllaInlagg = bloggdb.fetchRows(sql);
            for(HashMap<String, String> inlagg : listaAllaInlagg){

                String titel = inlagg.get("TITEL");
                String beskrivning = inlagg.get("BESKRIVNING");
                String anstalldID = String.valueOf(inlagg.get("ANSTALLDID"));
                String postID = String.valueOf(inlagg.get("POSTID"));
                String lista[] ={titel, beskrivning, anstalldID,postID};
               
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(lista);
            }
        }catch(InfException ex){
            System.out.println(ex.getMessage());
        }catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //Visar interfacet SkapaInlaggUtvecklingsArbete.
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new SkapaInlaggUtvecklingsArbete1(id).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    //Visar inlägg enligt Kategori formell eller informell. 
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       ArrayList<HashMap<String, String>> listKategori; 
    try{
            String valdKategori = jComboBox1.getSelectedItem().toString();
            String fraga = "SELECT * from INLAGG WHERE INLAGG.KATEGORIID IN (SELECT KATEGORIID FROM KATEGORI where NAMN =  '" + valdKategori + "')";
            listKategori = bloggdb.fetchRows(fraga);
            
      for(HashMap<String, String> inlagg : listKategori){
          String titel = inlagg.get("TITEL");
          String beskrivning = inlagg.get("BESKRIVNING");
          String anstalldId = String.valueOf(inlagg.get("ANSTALLDID"));
          String postid = String.valueOf(inlagg.get("POSTID"));

        String tbData[] ={titel,beskrivning, postid, anstalldId, postid};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(tbData); //Resultatet listas i tabellen
            
            }
      JOptionPane.showMessageDialog(null,"De här inläggen tillhör kategori '"+valdKategori+"' ");
   }catch(InfException ex){
            JOptionPane.showMessageDialog(null,ex); 
            System.out.println(ex.getMessage());
   }catch(NullPointerException e) { 
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Metod för User att skapa inlägg.
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new SkapaInlagg21(id).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

   //Metod som tömmer innehållet. 
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    //Visar Kalendern på interface
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Kalender kal = new Kalender(id);
        kal.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    //Den går tillbaka till Userklassen. 
    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed

        User us = new User(id);
        us.setVisible(true);
         dispose();

    }//GEN-LAST:event_TillbackaActionPerformed

   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SvaraInbjudanMote1 svIB = new SvaraInbjudanMote1(id);
        svIB.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        UtbildningForskning utFor = new UtbildningForskning(id);
        utFor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(HuvudmenyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuvudmenyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuvudmenyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuvudmenyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new HuvudmenyUser(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
