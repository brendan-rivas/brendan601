/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x, y;
       try{
          x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1;", "Solicito datos", 3));
          y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 2;", "Solicito datos", 3));
          JOptionPane.showMessageDialog(null, "La división de "+ x + "/"+ y + " es "+ (x/y), " Mostrando resultado", 1);
       }catch(NumberFormatException n){
           System.out.println(n.getMessage() + " No es número ENTERO");
       }catch(ArithmeticException a){
           System.out.println(a.getMessage() + " No se puede dividir entre 0");
       }
    }
    
}
