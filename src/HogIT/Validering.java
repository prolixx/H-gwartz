/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogIT;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class Validering {

    public static boolean textFaltHarVarde(JTextField rutanAttKolla) {

        boolean resultat = true;

        if (rutanAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
         
        }
        return resultat;
    }


public static boolean isHeltal(JTextField rutanAttKolla)
{
 boolean resultat = true;
 
 try{
     String inStrang = rutanAttKolla.getText();
    Integer.parseInt(inStrang);
 }

catch(NumberFormatException e)
{
  JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");  

}
        
        
 return resultat;
}
}