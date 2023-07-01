/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones7;

import java.util.Vector;

/**
 *
 * @author DELL
 */
public class Excepciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vector v =new Vector();
        int i=10;
        Object obj = v.add(i);
        try{
            String y = (String)obj;
            v.add(y);
        }catch(ClassCastException e){
            System.out.println("La clase a la que pertenece: " + obj.getClass().getName());
            e.printStackTrace();
        }
        
    }
    
}
