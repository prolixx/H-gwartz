/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogIT;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Huvudfönster extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form Logginfönster
     */
    public Huvudfönster(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        jLabel1.setText("Logg in:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 120, -1));

        jLabel2.setText("Lärar id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 50, -1));

        jLabel3.setText("Lösenord:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 60, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 40)); // NOI18N
        jLabel4.setText("Logga in");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 220, 40));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        
       
        if(Validering.textFaltHarVarde(user) && (Validering.textFaltHarVarde(password))){
        try {
            String larare = user.getText();
            String pass = password.getText();
        
            String fraga = idb.fetchSingle("SELECT LARAR_ID from LARARE where LOSENORD=" + "'" + pass + "'");
            String fraga2 = idb.fetchSingle("SELECT LOSENORD from LARARE where LOSENORD=" + "'" + pass + "'");
            String fraga3 = idb.fetchSingle(
                  "Select LARAR_ID from larare where LOSENORD =" +  "'" + pass + "'" + "and administrator = 'T'");
             
           if (user.getText().equals(fraga3) && password.getText().equals(fraga2))
              
             {
                  new Admin().setVisible(true);}
               
            else if  (user.getText().equals(fraga) && password.getText().equals(fraga2)){
                          
              new Larare().setVisible(true);   
                
            }
            else {
                  JOptionPane.showMessageDialog(null, "Fyll i ID och lösenord korrekt!");
                    
                    }   
            


        } catch (InfException ex) {
            Logger.getLogger(Huvudfönster.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
