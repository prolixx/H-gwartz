/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogIT;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Dator
 */
public class AndraInfoElev extends javax.swing.JFrame {
    private InfDB idb;
    
    
    
    
    /**
     * Creates new form RegNyElev
     */
    public AndraInfoElev() throws InfException {
        initComponents();
        idb = new InfDB("c:\\db\\hogdb.fdb");
        
    }
    
        public String getID() throws InfException{
       
            String namn = elevFornamn.getText();
            String efternamn = elevEfternamn.getText();
            String id = idb.fetchSingle("SELECT ELEV_ID FROM ELEV WHERE FORNAMN="+ "'"+namn+ "'"+"AND EFTERNAMN =" + "'" + efternamn + "'");
            
         return id;
     
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        andraFornamn = new javax.swing.JTextField();
        andraEfternamn = new javax.swing.JTextField();
        andraSovsal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        andraKnapp1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        genereratID = new javax.swing.JLabel();
        generera = new javax.swing.JButton();
        andraKnapp2 = new javax.swing.JButton();
        andraKnapp3 = new javax.swing.JButton();
        andraKnapp4 = new javax.swing.JButton();
        elevFornamn = new javax.swing.JTextField();
        elevEfternamn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nytt namn:");

        jLabel2.setText("Nytt efternamn:");

        jLabel3.setText("Elev ID:");

        jLabel4.setText("Byt sovsal:");

        andraKnapp1.setText("Ändra");
        andraKnapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tillbaka");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        generera.setText("Generera:");
        generera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genereraActionPerformed(evt);
            }
        });

        andraKnapp2.setText("Ändra");
        andraKnapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp2ActionPerformed(evt);
            }
        });

        andraKnapp3.setText("Ändra");
        andraKnapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp3ActionPerformed(evt);
            }
        });

        andraKnapp4.setText("Ändra");
        andraKnapp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnapp4ActionPerformed(evt);
            }
        });

        elevEfternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevEfternamnActionPerformed(evt);
            }
        });

        jLabel6.setText("Namn:");

        jLabel7.setText("Efternamn:");

        jLabel8.setText("Vilken elev vill du ändra?");

        jLabel9.setText("Fyll informationen du vill ändra.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generera, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genereratID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(andraKnapp4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(andraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(andraSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(andraKnapp3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(elevFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elevEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(andraFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(andraKnapp1)
                            .addComponent(andraKnapp2))))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraKnapp1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraKnapp2)
                    .addComponent(andraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(andraKnapp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generera)
                        .addComponent(jLabel3))
                    .addComponent(andraKnapp4)
                    .addComponent(genereratID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andraKnapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp1ActionPerformed
        String namn = andraFornamn.getText();
        
        String sovSal = andraSovsal.getText();
        
        
        
        
        
        
        
    }//GEN-LAST:event_andraKnapp1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void genereraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genereraActionPerformed
    
        try {
            String nextID = idb.getAutoIncrement("Elev","Elev_ID");
            genereratID.setText(nextID);
        } catch (InfException ex) {
            Logger.getLogger(AndraInfoElev.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_genereraActionPerformed

    private void andraKnapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp2ActionPerformed

        String nyttEfternamn = andraEfternamn.getText();
        try {
            idb.update("UPDATE elev SET EFTERNAMN="+"'"+nyttEfternamn+"'"+ "WHERE ELEV_ID="+"'"+getID()+"'");
        } catch (InfException ex) {
            Logger.getLogger(AndraInfoElev.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_andraKnapp2ActionPerformed

    private void andraKnapp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andraKnapp3ActionPerformed

    private void andraKnapp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnapp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andraKnapp4ActionPerformed

    private void elevEfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevEfternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elevEfternamnActionPerformed

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
            java.util.logging.Logger.getLogger(AndraInfoElev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraInfoElev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraInfoElev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraInfoElev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AndraInfoElev().setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(AndraInfoElev.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField andraEfternamn;
    private javax.swing.JTextField andraFornamn;
    private javax.swing.JButton andraKnapp1;
    private javax.swing.JButton andraKnapp2;
    private javax.swing.JButton andraKnapp3;
    private javax.swing.JButton andraKnapp4;
    private javax.swing.JTextField andraSovsal;
    private javax.swing.JTextField elevEfternamn;
    private javax.swing.JTextField elevFornamn;
    private javax.swing.JButton generera;
    private javax.swing.JLabel genereratID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}