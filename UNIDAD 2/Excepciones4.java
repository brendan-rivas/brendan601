/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones4;

/**
 *
 * @author DELL
 */
public class Excepciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int division = miMetodo(10,0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética arrojada");
        }
    }
    
    public static int miMetodo(int a, int b) throws ArithmeticException{
        int c = a / b;
        return c;
    }
    
}
