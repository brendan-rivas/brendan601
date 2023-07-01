/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones6;

/**
 *
 * @author DELL
 */
public class Excepciones6 {

    /**
     * @param args the command line arguments
     */
    static String mensajes[] = {"Primero", "Segundo", "Tercero" };
    public static void main(String[] args) {
       try {

      for (int i=0; i<=3; i++){
         System.out.println(mensajes[i]);
    }

    }

    catch ( ArrayIndexOutOfBoundsException e ) {
      System.out.println("El asunto se nos ha desbordado");
    }

    finally {
      System.out.println("Ha finalizado la ejecución");

    }
    }
    
}
