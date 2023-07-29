/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_servidor_bd;


// INPUT Y OUTPUT PERMINTEN ESCRIBIR Y LEER DATOS EN FICHEROS BINARIOS, INDICANDO UN TIPO.
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;



public class Cliente implements Runnable{

    //Creamos los atributos de puerto y mensaje
    private int puerto;
    private String mensaje;

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
       //Es la interface de Java que dispone de un método run 
       //y nos permite ejecutar una Tarea en paralelo desde un programa main usando la clase Thread.     
            
    @Override
    public void run() {
     //Host de servidor
     final String HOST ="127.0.0.1";
     
     //Puerto del servidor
     DataOutputStream salida;
     
     try{
         Socket socket = new Socket (HOST, puerto);
         salida = new DataOutputStream(socket.getOutputStream());
         
         //Enviamos el mensaje
         salida.writeUTF(mensaje);
         
     }catch(IOException error){
         System.out.println(error);
     }
     
    }
    
    
    
}
