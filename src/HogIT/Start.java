/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogIT;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Gabriel
 */
public class Start {

    private static InfDB idb;
 

    
public static void main(String[] args) throws InfException
{
   try {
       idb = new InfDB("c:\\db\\hogdb(1).fdb");
   }
   catch(InfException ettUndantag) {
   JOptionPane.showMessageDialog(null,"något gick fel!");
   System.out.println("internt felmeddelande" + ettUndantag.getMessage());
   
   }
    
    
    
    new Startsida(idb).setVisible(true);
}
  
}