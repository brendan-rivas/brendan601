/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones9;

/**
 *
 * @author DELL
 */
public class Excepciones9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numerador = 2;
        Integer denominador = null;
        double resultado;
        
        
        try{
            resultado = numerador/denominador; 
            System.out.println(" El resultado es: "+resultado);
        }catch(NullPointerException e){
            System.out.println("No se ha indicado el valor de la variable");
            e.printStackTrace();
        }finally{
            System.out.println("Programa terminado");
        }
        
    }
    
}
