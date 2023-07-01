/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int x, y;
       try{
          x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1;", "Solicito datos", 3));
       }catch(NumberFormatException n){
           System.out.println(n.getMessage() + " No es número ENTERO");
       }
      
    }
    
}
