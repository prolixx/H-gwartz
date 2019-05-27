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

    public ArrayList<String> visaStallning(ArrayList<String> Hus, ArrayList<String> Poäng) {
        

            ArrayList<String> stallningLista = new ArrayList<String>();
            String stallning = "";
            
            for (int i = 0; i < Hus.size(); i++) {
                stallning += Hus.get(i) + " " + Poäng.get(i) + "\n";
                stallningLista.add(stallning);
            }
             return stallningLista;
               
        
        }
        
         
    }





