package ScrumProject;


import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
public class VisaInlagg extends javax.swing.JFrame {
private InfDB bloggdb;
 private int id;
 private Huvudmeny huvudm; 
 private User userId;
 private Admin adminId;
 private String postID  ;
 
    /**
     * Creates new form VisaInlagg
     */
 //Konstruktorn som connectar med Databasen.
    public VisaInlagg(int id,String postID) {
        
        initComponents();
        
        this.id = id;
        this.postID = postID;
        adminId = new Admin(id);
        userId = new User(id);
        
        

     try {
             bloggdb = new InfDB("C:\\db\\Bloggdb.FDB");
           }
           catch(InfException e){
           JOptionPane.showMessageDialog(null, "Databasuppkopplingen har inte lyckats!\n");
           System.out.print("Databasuppkopplingen misslyckades. Felmeddelande: " + e.getMessage());
           }
          this.setLocationRelativeTo(null); 
            raknalikes();
            hamtaAntalLike();
             
            
    }  
    
        

 //Hämtar antalet "likes" och kontrollerar att om variabeln har ett nullvärde så visas Gilla knappen då tas unlike knappen bort
// annars motsatsen.
    public void hamtaAntalLike() {

        String kollaLike = null;

        try {

            kollaLike = bloggdb.fetchSingle("SELECT GILLA FROM GILLA WHERE ANSTALLDID = '" + id + "'AND POSTID ='" + postID + "';");

            if (kollaLike == null) {
                Like.setVisible(true);
                Unlike.setVisible(false);
            } else {
                Like.setVisible(false);
                Unlike.setVisible(true);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");

        }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        Like = new javax.swing.JToggleButton();
        Kommentar = new javax.swing.JToggleButton();
        Unlike = new javax.swing.JToggleButton();
        AntalLike = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Tillbacka1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setForeground(new java.awt.Color(0, 0, 204));

        jButton6.setText("Stäng");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setMaximumSize(new java.awt.Dimension(208, 212));
        jLabel4.setMinimumSize(new java.awt.Dimension(208, 2012));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Radera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Redigera inlägg");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(153, 153, 255));
        jTextField5.setForeground(new java.awt.Color(153, 153, 255));
        jTextField5.setFocusable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        Like.setText("Gilla");
        Like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikeActionPerformed(evt);
            }
        });

        Kommentar.setText("Kommentar");
        Kommentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KommentarActionPerformed(evt);
            }
        });

        Unlike.setText("Ogilla");
        Unlike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnlikeActionPerformed(evt);
            }
        });

        AntalLike.setBackground(new java.awt.Color(51, 51, 0));
        AntalLike.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        AntalLike.setForeground(new java.awt.Color(51, 0, 51));

        jButton3.setText("Ange ny bild");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(153, 153, 255));
        jTextField6.setForeground(new java.awt.Color(153, 153, 255));
        jTextField6.setFocusable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton4.setText("Visa bild/fil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(Like, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(Kommentar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(Unlike, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(AntalLike, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addComponent(jButton6)
                .addGap(31, 31, 31))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(AntalLike, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(Like)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Unlike)
                                .addGap(18, 18, 18)
                                .addComponent(Kommentar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(26, 26, 26))))
        );

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Visa inlägg");

        Tillbacka1.setText("Tillbaka");
        Tillbacka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tillbacka1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tillbacka1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setText("File");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu2.add(Exit);

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu2.add(Open);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Tillbacka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tillbacka1ActionPerformed
       String typ = userId.UserTyp(id);
         if(typ.equals("N") ) {
                    HuvudmenyUser huvM = new HuvudmenyUser(id);
                    huvM.setVisible(true);
                     dispose();
           } else{
    
        Huvudmeny huv = new Huvudmeny(id);
        huv.setVisible(true);
         dispose();
        } 
    }//GEN-LAST:event_Tillbacka1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //Metod som tar bort ett inlägg genom att kontrollera mot vilket postID användaren vill ta bort. User ("N") kan bara ta bort sina inlägg
    //och Admin ("J") kan ta bort allas inlägg. 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opt =JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort det här inlägget?", "Ta bort",JOptionPane.YES_NO_OPTION);
        if(opt==0){     
            try{
      String titel = jTextField1.getText();
      String anstalldId = jTextField6.getText();
      String beskrivning = jTextField2.getText();
      String postID = jTextField5.getText();

      String fraga = "SELECT ANSTALLDID FROM INLAGG WHERE POSTID = '"+postID+"'";
      String sql = bloggdb.fetchSingle(fraga);
      int anstalldID = Integer.parseInt(sql);

      String typ = adminId.AdminTyp(id);
              
     if(typ.equals("J") ) {
              try{  
                  bloggdb.delete("DELETE FROM KOMMENTAR WHERE KOMMENTAR.POSTID = '"+postID+"'");
                  bloggdb.delete("DELETE FROM GILLA WHERE GILLA.POSTID = '"+postID+"'");
                  bloggdb.delete("DELETE FROM INLAGG WHERE INLAGG.TITEL = '"+titel+"'");

              JOptionPane.showMessageDialog(null,"Inlägget '"+titel+"' har tagits bort.");
            
               }catch(InfException ex){
                System.out.println(ex.getMessage());
     }
     if( typ.equals("N")  ){
            if( id== anstalldID){
                 bloggdb.delete("DELETE FROM KOMMENTAR WHERE KOMMENTAR.POSTID = '"+postID+"'");
                 bloggdb.delete("DELETE FROM GILLA WHERE GILLA.POSTID = '"+postID+"'");
                 bloggdb.delete("DELETE FROM INLAGG WHERE INLAGG.TITEL = '"+titel+"'");
            JOptionPane.showMessageDialog(null," Inlägget '"+titel+"' har tagits bort");
            }else{
             JOptionPane.showMessageDialog(null,"Du har inte tillstånd att ta bort inlägget. '"+titel+"'");
             
                  }
            } 
         } 
           }catch(InfException ex){
                System.out.println("Error");
     }catch(NullPointerException e) { 
                System.out.println("Error"); //Metoden kontrollerar om admin eller user har loggat in och sedan bla bla blllaaaa
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // //Metod som ändrar ett inlägg genom att kontrollera mot vilket postID användaren vill ta bort. User ("N") kan redigera sina inlägg
    //och Admin ("J") kan redigera allas inlägg. 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String typ = userId.UserTyp(id);
                 
        if(typ.equals("J") ) {
            
                 try{
                  String titel = jTextField6.getText();
                  String nyTitel = jTextField1.getText();
                  String nyBeskrivning = jTextField2.getText();
                  String postID = jTextField5.getText();

                        bloggdb.update("UPDATE INLAGG SET TITEL = '"+nyTitel+"', BESKRIVNING = '"+nyBeskrivning+"' WHERE INLAGG.POSTID = '"+postID+"'");
                        JOptionPane.showMessageDialog(null,"Inlägget '"+nyTitel+"' har ändrats.");

                 }catch(InfException ex){
                            System.out.println(ex.getMessage());
                 } catch(NullPointerException e) { 
                            System.out.println("NullPointerException thrown!");
                        }  
        if(typ.equals("N") ){
                try{
                  String titel = jTextField6.getText();
                  String nyTitel = jTextField1.getText();
                  String nyBeskrivning = jTextField2.getText();
                  String postID = jTextField5.getText();

                  String fraga = "SELECT ANSTALLDID FROM INLAGG WHERE POSTID = '"+postID+"'";
                  String sql = bloggdb.fetchSingle(fraga);
                  int anstalldID = Integer.parseInt(sql);
                  
                   if( id== anstalldID){
                         bloggdb.update("UPDATE INLAGG SET TITEL = '"+nyTitel+"', BESKRIVNING = '"+nyBeskrivning+"' WHERE INLAGG.POSTID = '"+postID+"'");
                        JOptionPane.showMessageDialog(null," Välkommen Admin! Inlägget '"+nyTitel+"' har ändrats!");
                  }else{
                         JOptionPane.showMessageDialog(null," Du har inte tillstånd att redigera Inlägget '"+nyTitel+"'");
                              }
                  
                                   }catch(InfException ex){
                            System.out.println(ex.getMessage());
                 }catch(NullPointerException e) { 
                            System.out.println("NullPointerException thrown!");
            }
        
        } 

}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    //Metoden skickar ett like för varje gång man klickar gilla knappen. 
    private void LikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikeActionPerformed
         String kollaLike = null;
        try {
            String nyID = "1";
            int like = 1;

            kollaLike = bloggdb.fetchSingle("SELECT GILLAID FROM GILLA");
            if (kollaLike != null) {

                String nyaid = bloggdb.fetchSingle("SELECT MAX (GILLAID)FROM GILLA");

                int gillaid = Integer.parseInt(nyaid);

                gillaid++;

                bloggdb.insert("INSERT INTO gilla(gillaid,gilla,ANSTALLDID,POSTID) VALUES (" + gillaid + ",'" + like + "'," + "'" + id + "'," + "'" + postID + "')");

            } else {
                bloggdb.insert("INSERT INTO gilla(gillaid,gilla,ANSTALLDID,POSTID) VALUES (" + nyID + ",'" + like + "'," + "'" + id + "'," + "'" + postID + "')");
            }

            Unlike.setVisible(true);
            Like.setVisible(false);
            raknalikes();

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }

  
   
    }//GEN-LAST:event_LikeActionPerformed

    //Metoden tar bort ett like från databasen.
    private void UnlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnlikeActionPerformed
       try {
            Like.setVisible(true);
            bloggdb.delete("DELETE FROM GILLA WHERE ANSTALLDID ='" + id + "'AND POSTID ='" + postID + "';");
            Unlike.setVisible(false);
            raknalikes();
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
    }//GEN-LAST:event_UnlikeActionPerformed

    //Metoden öppnar klassen kommentar för en ny kommentar kan ges. 
    private void KommentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KommentarActionPerformed
       Comment kommentar = new Comment (id,postID);
       kommentar.setVisible(true);
       dispose();
    }//GEN-LAST:event_KommentarActionPerformed

    //Metoden lagrar en ny bild i databasen. 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fileBild = new JFileChooser();
        fileBild.showOpenDialog(null);
        File bild = fileBild.getSelectedFile();
        this.jLabel4.setIcon(new ImageIcon(bild.toString()));
        FilNamn =bild.getAbsolutePath();
        String photo = bild.getName();
        jTextField5.setText(photo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    //Metoden gör att man kan välja en txtfil vars innehåll skall visas upp på skärmen. 
    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed

       int returnVal = jFileChooser1.showOpenDialog(this);
       if (returnVal == jFileChooser1.APPROVE_OPTION) {
          File file = jFileChooser1.getSelectedFile();
        try {
                jTextField2.read(new FileReader(file.getAbsolutePath()), null);

            } catch (IOException ex) {
                System.out.println("Ingen åtkomst till filen." + file.getAbsolutePath());
            }
        } else {
            System.out.println("Filåtkomsten avbröts av användaren.");
        }


    }//GEN-LAST:event_OpenActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    //Metoden visar bilden som redan lagrats i databasen. Annars kommer ett felmeddelande. 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try {
            String s = jTextField5.getText();
            System.out.println(s);
          //  System.out.println("select pic from inlagg where postid = '"+s+"'");
//            System.out.println("select pic from inlagg where postid ="+s);
            String rs = bloggdb.fetchSingle("select pic from inlagg where postid ="+s);
            ImageIcon im = new ImageIcon(rs);
            jLabel4.setIcon(im);
            Image myImg= im.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);
            jLabel4.setIcon(newImage);


             } catch (SQLException ex) {
//                 Logger.getLogger(VisaInlagg.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Tyvärr gick det inte att ladda upp bilden");
             }
        try {
        String filId = jTextField5.getText();
        
        String filUpload = bloggdb.fetchSingle("SELECT Fil FROM INLAGG WHERE POSTID = '" + filId+"';" );
        String ssss = new String (filUpload);
        jTextArea1.setText(ssss);
        
    } catch (InfException ex) {
        Logger.getLogger(VisaInlagg.class.getName()).log(Level.SEVERE, null, ex);
    }
      
    }//GEN-LAST:event_jButton4ActionPerformed

    //Metoden hämtar allalikes som tillhör en post och visar på skärmen. 
     public void raknalikes() {
        String antal = null;
        int antalint = 0;
        int Totalafardiga = 0;
        String totalaString = "";

        ArrayList<String> totalantalLike = null;

        try {

            totalantalLike = bloggdb.fetchColumn("SELECT GILLA FROM GILLA WHERE POSTID ='" + postID + "';");

            if (totalantalLike != null) {

                int i = 0;

                while (i < totalantalLike.size()) {

                    antal = totalantalLike.get(i);
                    System.out.println(antal);
                    antalint = Integer.parseInt(antal);

                    Totalafardiga += antalint;
                    System.out.println(Totalafardiga);

                   i++;

                }

            }

        } catch (InfException ex) {
            JOptionPane.showConfirmDialog(null, "Något gick fel!");
        }

        try {

            totalaString = String.valueOf(Totalafardiga);

            if (totalaString != null) {

                AntalLike.setText("Like:" + " " + totalaString);

            } else {

                AntalLike.setText("like:" + " " + "0");

            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Något gick fel!");

        }

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
            java.util.logging.Logger.getLogger(VisaInlagg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisaInlagg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisaInlagg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisaInlagg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new VisaInlagg(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AntalLike;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JToggleButton Kommentar;
    private javax.swing.JToggleButton Like;
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton Tillbacka1;
    private javax.swing.JToggleButton Unlike;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
byte[] NyBild=null;
String FilNamn = null;}

