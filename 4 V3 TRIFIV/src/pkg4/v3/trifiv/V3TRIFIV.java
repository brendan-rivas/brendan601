/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.v3.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class V3TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
    //Declaración de variables
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        
    //Entrada de datos
        System.out.println("Dame el número");
        numero=Integer.parseInt(bufEntrada.readLine());
        
    //Salida de datos    
        System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo(int num) throws IOException{
     //Declaración de variables
        int mult3;
        int mult5;
            
    //Procesar datos
        mult3=num%3;
        mult5=num%5;
        
    //Salida de datos
        if(mult3==0 && mult5==0){
            return "TRIFIV";
        }else if(mult3==0){
            return "TRI";
        }else if(mult5==0){
            return "FIV";
        }       
        return "Ningun Valor";
    }
}
