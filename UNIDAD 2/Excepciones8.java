/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones8;

/**
 *
 * @author DELL
 */
public class Excepciones8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String className = "com.example.MyClass"; // Nombre de la clase que intentaremos cargar

        try {
            Class<?> clazz = Class.forName(className); // Intentamos cargar la clase
            System.out.println("Clase cargada exitosamente: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar la clase: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
