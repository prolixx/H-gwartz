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
public class ElevhemsPokalen {
    private InfDB idb;
     
public ElevhemsPokalen() throws InfException
{
idb = new InfDB("c:\\db\\hogdb.fdb");}

public void visaStallning()
{
        try {
            ArrayList <String> hem = idb.fetchColumn("SELECT ELEVHEMSNAMN from ELEVHEM");
           
            ArrayList <String> poäng = idb.fetchColumn("SELECT HUSPOANG from ELEVHEM");
            
             String svar ="";
            
            for ( int i = 0; i<hem.size();i++)
          { 
            svar +=   hem.get(i)+ " " + poäng.get(i) + "\n";
           
          }
            
        } catch (InfException ex) {
            Logger.getLogger(StallningElevhemsPokalen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     

}





