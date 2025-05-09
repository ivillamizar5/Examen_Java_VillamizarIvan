/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author camper
 */
public class DatabaseConnector {
    
    
    private static final String url = "jdbc:mysql://localhost:3306/solucioneseficientes";
    private static final String usuario = "campus2023";
    private static final String password = "campus2023";

    
    private static Connection con;
    
    
    public DatabaseConnector(){
        this.con = null;
}
    
    public static Connection getConnection() {
        try {
            if (con == null){
            con = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion exitosa");
            }else{
            
            }
        } catch (Exception e) {
            System.out.println("Error al conectarse " + e.getMessage());
        }
        return con;
    }
    
    
    public static void closeConnection(){
        if(con !=null){
            try {
                con.close();
                con = null;
            } catch (Exception e) {
                System.out.println("Error al desconectarse " + e.getMessage());
            }
        }
    }
    
    
}
