
package ScrumProject;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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

public class UtbildningForskning extends javax.swing.JFrame {
         private InfDB bloggdb;
         private static int id;
         private User userId;
         private Admin adminId;
    /**
     * Creates new form UtbildningForskning
     */
         //Konstruktorn connectar med Databasen.
    public UtbildningForskning(int id) {
        initComponents();
            
        this.id = id;
            adminId = new Admin(id);
            userId = new User(id);
        
        

     try {
             bloggdb = new InfDB("C:\\db\\Bloggdb.FDB");
           }
           catch(InfException e){
           JOptionPane.showMessageDialog(null, "Databasuppkopplingen har inte lyckats!\n");
           System.out.print("Databasuppkopplingen misslyckades. Felmeddelande: " + e.getMessage());
           }
                       Forskning();
                       Utbildning();
                       
          this.setLocationRelativeTo(null); 

    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Tillbacka2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Text"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setHeaderValue("Text");
        }

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Forskning");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Utbildning");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Utbildning Forskning");

        Tillbacka2.setText("Tillbaka");
        Tillbacka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tillbacka2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addComponent(Tillbacka2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod som hämtar ut en lista av relevanta värden och listar ut dem i en tabell. 
    private void Forskning() {
        try {

            String query = ("SELECT TEXT from FORSKNING");
            ArrayList<HashMap<String, String>> list = null;//hämtar ut en lista av relevanta värden. 

            list = bloggdb.fetchRows(query);//hämtar ut releventa värden 

            if (list != null) {

                DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();

                int row = dt.getRowCount();
                int i = row - 1;
                while (i >= 0) {

                    dt.removeRow(i);

                    i--;
                }

                for (HashMap<String, String> value : list) {
//                    String MEDDELANDE = String.valueOf(value.get("DATUM"));
                    String text = value.get("TEXT");
                    String allt[] = {text};
                    dt.addRow(allt);

                }

            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "fel");

        }

    }

    //Metod som hämtar relevanta värden och listar den i tabellen.
    private void Utbildning() {
        try {

            String query = ("SELECT TEXT from UTBILDNING");
            ArrayList<HashMap<String, String>> list = null;//hämtar ut en lista av relevanta värden. 

            list = bloggdb.fetchRows(query);//hämtar ut releventa värden 

            if (list != null) {

                DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();

                int row = dt.getRowCount();
                int i = row - 1;
                while (i >= 0) {

                    dt.removeRow(i);

                    i--;
                }

                for (HashMap<String, String> value : list) {
//                    String MEDDELANDE = String.valueOf(value.get("DATUM"));
                    String text = value.get("TEXT");
                    String allt[] = {text};
                    dt.addRow(allt);

                }

            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "fel");

        }

    }
    
    private void Tillbacka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tillbacka2ActionPerformed
        String typ = userId.UserTyp(id);
        if (typ.equals("N")) {
            HuvudmenyUser huvM = new HuvudmenyUser(id);
            huvM.setVisible(true);
            dispose();
        } else {

            Huvudmeny huv = new Huvudmeny(id);
            huv.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Tillbacka2ActionPerformed

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
            java.util.logging.Logger.getLogger(UtbildningForskning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtbildningForskning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtbildningForskning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtbildningForskning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtbildningForskning(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
