/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;



public class Conexion {

    private static final String URL = "jdbc:mysql://localhost/chat";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Conexion instancia;
    
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    //proporciona varios métodos para obtener los datos de columna correspondientes a un fila
    
    public void cerrarResultado(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    //Las prepared statements, también llamadas consultas, comandos o sentencias preparadas, 
    //son plantillas para consultas a sistemas de bases de datos en lenguaje SQL cuyos parámetros 
    //están desprovistos de valores.
    
    
    public void cerrarStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
}
