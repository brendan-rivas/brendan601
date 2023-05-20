/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author DELL
 */
public class funcionMultiplo {
    public String retornaMultiplo(int num){
         if(num%3==0 && num%5==0){
            return "TRIFIV";
        }else if(num==0){
            return "TRI";
        }else if(num==0){
            return "FIV";
        }       
        return "Ninguno";
    }
}
