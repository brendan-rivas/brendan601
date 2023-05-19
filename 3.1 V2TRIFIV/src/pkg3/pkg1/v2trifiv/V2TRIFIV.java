
package pkg3.pkg1.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class V2TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    //Declaración de variables
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int mult3;
        int mult5;
        
    //Entrada de datos
        System.out.println("Dame el número");
        numero=Integer.parseInt(bufEntrada.readLine());
    
    //Procesar datos
        mult3=numero%3;
        mult5=numero%5;
        
    //Salida de datos
        if(mult3==0 && mult5==0){
            System.out.println("TRIFIV");
        }else if(mult3==0){
            System.out.println("TRI");
        }else if(mult5==0){
            System.out.println("FIV");
        }
        
    }
    
}
