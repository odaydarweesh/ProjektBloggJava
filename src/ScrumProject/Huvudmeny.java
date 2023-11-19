package ScrumProject;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
 * * @author Sämira
 * * @author Michael
 * * @author Ranyssi
 * * @author Omday
 */
public class Huvudmeny extends javax.swing.JFrame {

    private InfDB bloggdb;
    private Login login;
    private User userId;
    private Admin adminId;
    private SkapaInlagg21 skai;
    private VisaInlagg visI;
    private int id;
    private String postID;

    /**
     * Creates new form Huvudmeny
    **/
    //Vi gör en koppling till databasen varje gång klassen körs. 
    public Huvudmeny(int id) {
        this.id = id;
        initComponents();
        adminId = new Admin(id);
        userId = new User(id);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        try {
            bloggdb = new InfDB("C:\\db\\Bloggdb.FDB");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Inloggningen misslyckades.");
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
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

        jButton5.setText("Skapa Utvecklingsarbete");
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

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setMaximumSize(new java.awt.Dimension(208, 212));
        jLabel4.setMinimumSize(new java.awt.Dimension(208, 2012));

        jButton1.setText("Boka in möte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Kalla till möte");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setText("Se meddelande");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7)
                                .addComponent(jButton3)))))
                .addGap(20, 26, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Huvudmeny för Admin");

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
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addComponent(Tillbacka))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed

        Admin adm = new Admin(id);
        adm.setVisible(true);
        dispose();

    }//GEN-LAST:event_TillbackaActionPerformed
//en knapp som visar interfacet skapa ett inlägg
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new SkapaInlagg21(id).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
/*
    * Vi listar ut alla kategori inläggen och lägger in dem i Comboboxen. Resultatet läggs i tabellen. 
    Vi har en exception catch för att fånga error och ger ett felmeddelande 
    */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        ArrayList<HashMap<String, String>> listKategori;
        try {
            String valdKategori = jComboBox1.getSelectedItem().toString();
            String fraga = "SELECT * from INLAGG WHERE INLAGG.KATEGORIID IN (SELECT KATEGORIID FROM KATEGORI where NAMN =  '" + valdKategori + "')";
            listKategori = bloggdb.fetchRows(fraga);
            String titel = "";
            for (HashMap<String, String> inlagg : listKategori) {
                titel = inlagg.get("TITEL");
                String beskrivning = inlagg.get("BESKRIVNING");
                String anstalldId = String.valueOf(inlagg.get("ANSTALLDID"));
                String postid = String.valueOf(inlagg.get("POSTID"));

                String tbData[] = {titel, beskrivning, postid, anstalldId, postid};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                tblModel.addRow(tbData); //Resultatet listas i tabellen
            }
            JOptionPane.showMessageDialog(null, "Dessa inlägg tillhör kategori '" + valdKategori + "' ");

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
/*
    Hela infot skickas från tabellen Huvudmeny till VisaInlägg 
    jtextfield 1,6,2,5 skickar värde till en annan klass/inteface som är VisaInlägg. 
    */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();

        String titel = model.getValueAt(index, 0).toString();
//      String bild = jTextField3.getText();
        String beskrivning = model.getValueAt(index, 1).toString();
        String anstalldID = model.getValueAt(index, 2).toString();
        postID = model.getValueAt(index, 3).toString();
        String rs;
        try {
            rs = bloggdb.fetchSingle("select pic from inlagg where postid = '" + postID + "'");
            ImageIcon im = new ImageIcon(rs);
            jLabel4.setIcon(im);

        } catch (InfException ex) {
            Logger.getLogger(Huvudmeny.class.getName()).log(Level.SEVERE, null, ex);
        }

        VisaInlagg jtRowInfo = new VisaInlagg(id, postID);
        jtRowInfo.setVisible(true);
        jtRowInfo.pack();
        jtRowInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jtRowInfo.jTextField1.setText(titel);
        jtRowInfo.jTextField6.setText(anstalldID);
        jtRowInfo.jTextField2.setText(beskrivning);
        jtRowInfo.jTextField5.setText(postID);
        jtRowInfo.jLabel4.setIcon(new ImageIcon());

        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new SkapaInlaggUtvecklingsArbete1(id).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

//Denna Metod Visar Alla Inlägg
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        ArrayList<HashMap<String, String>> listaAllaInlagg;
        try {
            DefaultTableModel tblModel2 = (DefaultTableModel) jTable1.getModel(); //Rensar rader och kolumner
            tblModel2.setRowCount(0); //Rensar rader och kolumner               
            String sql = "SELECT * FROM INLAGG";
            listaAllaInlagg = bloggdb.fetchRows(sql);
            for (HashMap<String, String> inlagg : listaAllaInlagg) {

                String titel = inlagg.get("TITEL");
                String beskrivning = inlagg.get("BESKRIVNING");
                String anstalldID = String.valueOf(inlagg.get("ANSTALLDID"));
                String postID = String.valueOf(inlagg.get("POSTID"));
                String lista[] = {titel, beskrivning, anstalldID, postID};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                tblModel.addRow(lista);
            }
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //Visar Admins möten i annan interface. 
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        AdminSeMoteSvar1 adSeM = new AdminSeMoteSvar1(id);
        adSeM.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    //Visa kalender i annan interface
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Kalender kal = new Kalender(id);
        kal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    //Visar en annan interface som är att Boka Möte
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BokaInMote1 bokM = new BokaInMote1(id);
        bokM.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Kallar till Möte 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        KallaTillMote1 kalM = new KallaTillMote1(id);
        kalM.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

//Visar kategorierna Utbildning/Forskning
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        UtbildningForskning utFor = new UtbildningForskning(id);
        utFor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed
    public void setId(int id) {
        this.id = id;

    }

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
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Huvudmeny(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
