/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogIT;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Användare {
  private InfDB idb;
    
public  Användare() throws InfException{
idb = new InfDB("c:\\db\\hogdb.fdb");
}

    public String getID(JTextField lararFnamn, JTextField lararEnamn) throws InfException {
        if (Validering.textNamnHarVarde(lararFnamn, lararEnamn));
        String fnamn = lararFnamn.getText();
        String enamn = lararEnamn.getText();

        String id = idb.fetchSingle("SELECT LARAR_ID FROM LARARE WHERE FORNAMN=" + "'" + fnamn + "'"
                + "AND EFTERNAMN =" + "'" + enamn + "'");
        if (id == null) {
            JOptionPane.showMessageDialog(null, "Kunde inte finna lärare");
        }
        
      return id;
    }
}
