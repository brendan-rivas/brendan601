/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones3;

/**
 *
 * @author DELL
 */
public class Excepciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            float equis = 5/0;
            System.out.println("Equis = "+ equis);
        }catch(ArithmeticException e){
            System.out.println("Error: división entre 0");
        }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally.");
        }
    }
    
}
