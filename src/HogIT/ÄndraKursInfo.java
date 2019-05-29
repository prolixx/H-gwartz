package HogIT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Admin
 */
public class ÄndraKursInfo extends javax.swing.JFrame {

    private final InfDB idb;
    
    /**
     * Creates new form ÄndraKursInfo
     */
    public ÄndraKursInfo() throws InfException {
        initComponents();

        idb = new InfDB("c:\\db\\hogdb.fdb");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namn = new javax.swing.JTextField();
        amne = new javax.swing.JTextField();
        kursnamn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fornamn = new javax.swing.JTextField();
        LÄRARE = new javax.swing.JLabel();
        kursstart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        startDatum = new com.toedter.calendar.JDateChooser();
        slutDatum = new com.toedter.calendar.JDateChooser();
        efternamn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kursNamn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KURS ID");

        jLabel2.setText("NYTT KURS NAMN");

        kursnamn.setText("ÄNDRA");
        kursnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursnamnActionPerformed(evt);
            }
        });

        jLabel3.setText("KURS START");

        jLabel4.setText("KURS SLUT");

        jLabel5.setText("ÄMNE");

        LÄRARE.setText("LÄRARE");

        kursstart.setText("ÄNDRA");
        kursstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursstartActionPerformed(evt);
            }
        });

        jButton3.setText("ÄNDRA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ÄNDRA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ÄNDRA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jLabel7.setText("Förnamn");

        jLabel9.setText("Efternamn");

        jLabel10.setText("Kurs namn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(kursNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(LÄRARE)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amne, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(slutDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(kursnamn)
                    .addComponent(kursstart)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kursnamn)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kursstart)
                            .addComponent(startDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jButton3))
                    .addComponent(slutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(amne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LÄRARE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jButton5))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //GetMetod för att hämta id till de andra metoderna
    public String getID() throws InfException {
     

         // Validerar inmatningsfält
        // deklarerar variabler och validering använder toUppercase metod
        String knamn = Validering.storBokstav(kursNamn.getText());
        //hämtar id från databas från kursnamn
          String kid = idb.fetchSingle("SELECT KURS_ID from KURS WHERE KURSNAMN=" + "'" + knamn + "'");
        // retunerar kursID
        
         return kid;
        
    }
    private void kursnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursnamnActionPerformed
        //Validering kollar inmatningsrutorna   
        if (Validering.textNamnHarVarde(namn, kursNamn)) {
            try {
                //Deklarerar variabler
                String knamn = Validering.storBokstav(namn.getText());
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs");
                } else {
                    //Om id finns i listan uppdaterar kursnamnet
                    idb.update("UPDATE KURS SET KURSNAMN=" + "'" + knamn + "'" + "where KURS_ID=" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, " Kursnamn är nu ändrat");
                }
            } catch (InfException ex) {
                Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Meddelar att ändring har gjorts


        }
    }//GEN-LAST:event_kursnamnActionPerformed

    private void kursstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursstartActionPerformed
            if(Validering.textFaltHarVarde(kursNamn)){
        try {
            //Kollar att kurs finns
            if (getID() == null) {
                //stoppar programmet om kursen inte finns
                JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs!");
            } else {
                // deklarerar variabler och importerar simpeldateformat för att kunna använda Datepicker
                String till = idb.fetchSingle("Select KURSSLUT FROM KURS WHERE KURS_ID=" + getID());
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String fran = sdf1.format(startDatum.getDate());
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = format.parse(fran);
                Date date2 = format2.parse(till);

                //Kontrollerar att start datum inte är efter slutdatum
                if (date1.after(date2)) {
                    JOptionPane.showMessageDialog(null, "Kontrollera datumet: Start efter Slutdatum");
                } else {
                    //uppdaterar kursstart i databasen
                    idb.update("UPDATE KURS SET KURSSTART=" + "'" + fran + "'" + "where KURS_ID=" + "'" + getID() + "'");
                    //meddelar att ändring har gjorts
                    JOptionPane.showMessageDialog(null, " Kursstart är nu ändrat");
                }

            }
        } catch (ParseException | InfException ex) {
            Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
            }
    }//GEN-LAST:event_kursstartActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Validering.textFaltHarVarde(kursNamn)){
        try {
            //Kollar om kurs finns
            if (getID() == null) {
                //stoppar programmet och skickar felmeddelande
                JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs!");
            } else {
              //deklarerar variabler och hämtar SimpleDateFormat för datepickern
                String fran = idb.fetchSingle("Select KURSSTART FROM KURS WHERE KURS_ID=" + getID());
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String till = sdf1.format(slutDatum.getDate());
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = format.parse(fran);
                Date date2 = format2.parse(till);

                //Kontrollerar att start datum inte är efter slutdatum
                if (date1.after(date2)) {
                    JOptionPane.showMessageDialog(null, "Kontrollera datumet: KURSSLUT INNAN START");
                } else {
                    //uppdaterar kursens slutdatum
                    idb.update("UPDATE KURS SET KURSSLUT=" + "'" + till + "'" + "where KURS_ID=" + "'" + getID() + "'");
                    JOptionPane.showMessageDialog(null, " Kursslut är nu ändrat");
                }
            }

        } catch (ParseException | InfException ex) {
            Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Validering
        if (Validering.textNamnHarVarde(amne, kursNamn)){
        String amnet = Validering.storBokstav(amne.getText());

        boolean ok = true;

        try {
            String aid = idb.fetchSingle("SELECT AMNE_ID FROM AMNE WHERE AMNESNAMN=" + "'" + amnet + "'");

            ArrayList<String> amneLista = idb.fetchColumn("SELECT AMNE_ID from AMNE");

            if (!amneLista.contains(aid)) {
                ok = false;
                JOptionPane.showMessageDialog(null, "Ämne finns ej ");
            } else {
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta kurs!");
                } else {
                    idb.update("UPDATE KURS SET AMNESTILLHORIGHET =" + "'" + aid + "'" + "where KURS_ID=" + "'" + getID() + "'");

                    JOptionPane.showMessageDialog(null, " Ämne är nu ändrat");
                }
            }
        
        } catch (InfException ex) {
            Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Validering av Inmatningsrutor
        if (Validering.textNamnHarVarde(fornamn, efternamn) && Validering.textFaltHarVarde(kursNamn)) {
            try {
                //deklarerar variabler och använder toUppercase metod
                String fnamn = Validering.storBokstav(fornamn.getText());
                String enamn = Validering.storBokstav(efternamn.getText());
                //hämtar Lärar id op förnamn och efternamn
                String lid = idb.fetchSingle("SELECT LARAR_ID FROM LARARE WHERE FORNAMN=" + "'" + fnamn + "'"
                        + "and EFTERNAMN=" + "'" + enamn + "'");

                boolean ok = true;
                //kollar om kursfins i lärar id
                if (getID() == null) {
                    JOptionPane.showMessageDialog(null, "Kurs finns ej ");
                } else {
                   //Skapar en lista över alla lärare
                    ArrayList<String> lararLista = idb.fetchColumn("SELECT LARAR_ID from LARARE");
                    //kollar om Läraren finns i listan
                    if (!lararLista.contains(lid)) {
                        ok = false;
                        //om läraren inte finns i listan så skickas felmeddelande
                        JOptionPane.showMessageDialog(null, " Lärare finns ej ");
                    } else {
                        //uppdaterar kursens lärare
                        idb.update("UPDATE KURS SET KURSLARARE =" + "'" + lid + "'" + "where KURS_ID=" + "'" + getID() + "'");

                        JOptionPane.showMessageDialog(null, " Ansvarig Lärare är nu ändrat");
                    }
                }

            } catch (InfException ex) {
                Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraKursInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraKursInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraKursInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraKursInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ÄndraKursInfo().setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(ÄndraKursInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LÄRARE;
    private javax.swing.JTextField amne;
    private javax.swing.JTextField efternamn;
    private javax.swing.JTextField fornamn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kursNamn;
    private javax.swing.JButton kursnamn;
    private javax.swing.JButton kursstart;
    private javax.swing.JTextField namn;
    private com.toedter.calendar.JDateChooser slutDatum;
    private com.toedter.calendar.JDateChooser startDatum;
    // End of variables declaration//GEN-END:variables
}
