/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.v2.trifiv;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class V2TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer=new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un número");
        num=leer.nextInt();
        
       
        
        if(num%3==0 && num%5==0){
            System.out.println("TRIFIV");
        }else{
             if(num%3==0){
            System.out.println("TRI");
            
        }else if(num%5==0){
            System.out.println("FIV");
            
        }else{
                 System.out.println("NO ES MULTIPLO DE 3 NI DE 5");  
                }
        }
    }
    
}
