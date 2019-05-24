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
 * @author Gabriel
 */
public class Elev extends javax.swing.JFrame {
 
    private InfDB idb;
   private ElevhemsPokalen pokalen;
    /**
    * Creates new form Larare
     */
    public Elev() {
        initComponents();
        try {
            idb = new InfDB("c:\\db\\hogdb.fdb");
        } catch (InfException ex) {
            Logger.getLogger(Elev.class.getName()).log(Level.SEVERE, null, ex);
       
        }
    
    
        
        
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        klick = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultat = new javax.swing.JTextArea();
        larareKurser = new javax.swing.JToggleButton();
        SokPrefekt = new javax.swing.JToggleButton();
        listaElever = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        klick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        klick.setText("Visa ställning för elevhems pokalen!");
        klick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klickMouseClicked(evt);
            }
        });

        resultat.setBackground(new java.awt.Color(204, 255, 204));
        resultat.setColumns(20);
        resultat.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        resultat.setRows(5);
        jScrollPane1.setViewportView(resultat);

        larareKurser.setText("Lärares kurser");

        SokPrefekt.setText("Sök Prefekt");
        SokPrefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SokPrefektActionPerformed(evt);
            }
        });

        listaElever.setText("Lista elver");
        listaElever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEleverActionPerformed(evt);
            }
        });

        jButton2.setText("Tillbaka");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SokPrefekt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaElever, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(larareKurser, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(klick)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(klick, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(SokPrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaElever, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(larareKurser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 264, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void klickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klickMouseClicked
        
        try {
            ArrayList <String> hem = idb.fetchColumn("SELECT ELEVHEMSNAMN from ELEVHEM");
           
            ArrayList <String> poäng = idb.fetchColumn("SELECT HUSPOANG from ELEVHEM");
            
             String svar ="";
            
            for ( int i = 0; i<hem.size();i++)
          { 
            svar +=   hem.get(i)+ " " + poäng.get(i) + "\n";
          
            resultat.setText(svar);
            klick.setVisible(false);
         
          }
            
        } catch (InfException ex) {
            Logger.getLogger(StallningElevhemsPokalen.class.getName()).log(Level.SEVERE, null, ex);
        }
        

            
    }//GEN-LAST:event_klickMouseClicked

    private void SokPrefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SokPrefektActionPerformed
        try {
            new SökPrefekt().setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(Elev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SokPrefektActionPerformed

    private void listaEleverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEleverActionPerformed
        try {
            new ListaEleverpåElevhem().setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(Elev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaEleverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton SokPrefekt;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel klick;
    private javax.swing.JToggleButton larareKurser;
    private javax.swing.JButton listaElever;
    private javax.swing.JTextArea resultat;
    // End of variables declaration//GEN-END:variables

}
