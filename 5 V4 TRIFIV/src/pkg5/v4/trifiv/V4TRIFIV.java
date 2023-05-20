/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.v4.trifiv;

import funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class V4TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
    //Declaración de variables
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        
    //Creo Objeto    
        funcionMultiplo mult= new funcionMultiplo();
        
    //Entrada de datos
        System.out.println("Dame el número");
        numero=Integer.parseInt(bufEntrada.readLine());
    
    //Salida de datos    
        System.out.println(mult.retornaMultiplo(numero));
    }
    
}
