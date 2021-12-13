/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JCERNA10
 */
public class Conexion {

    private static String url = "jdbc:mysql://localhost/restaurante2";
    private static String usuario = "root";
    private static String contraseña = "";

    public static Connection conexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion establecida a la base de datos");
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
        return conexion;
    }
}
    
    
    
    
    
    
    
    
    
  