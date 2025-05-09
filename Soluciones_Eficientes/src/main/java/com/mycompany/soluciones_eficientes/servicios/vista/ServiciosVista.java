/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.servicios.vista;

import com.mycompany.soluciones_eficientes.servicios.modelo.Servicios;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class ServiciosVista {
    
    
    
    private Scanner scanner;

    
    public ServiciosVista(){
        this.scanner = new Scanner(System.in);
    }
      public Scanner getScanner() {
        return scanner;
    }
    
      
      
      
      
    
    public Servicios mostrarDatosIngreso(){
        
        System.out.println("Nombre:");
        String nombre = scanner.next();
        System.out.println("Descripcion:");
        String descripcion = scanner.next();
        System.out.println("Precio por Hora:");
        int precio = Integer.parseInt(scanner.next());
        System.out.println("Categoria:");
   
        System.out.println("""
                           1.TI
                           2.Limpieza
                           3.Seguridad
                           4.Administración
                           """);
        int  categoria = Integer.parseInt(scanner.next());
        
        if (categoria < 1 || categoria>4) {
            System.out.println("No ingresaste un valor entre 1 y 5 :(");
        }else{
            
            switch (categoria) {
                case 1 -> {
                    String ti = "TI";
                    return new Servicios(nombre,descripcion,precio,ti);
                }
                case 2 -> {
                    String limpieza = "Limpieza";
                    return new Servicios(nombre,descripcion,precio,limpieza);
                }
                case 3 -> {
                    String seguridad = "Seguridad";
                    return new Servicios(nombre,descripcion,precio,seguridad);
                }
                default -> {
                    System.out.println("Error no ingresaste un valor entre 1 y 5 :(");;
                }
            }
        }
        return null;
    }
      
      
      public int ingresarOpcionMenu() {

          System.out.println("Ingresa el numero de lista");
        int opcion = scanner.nextInt();
        return opcion;

    }
      
      
     public String ingresarCategoria(){
         System.out.println("Categoria a consultar? ");
         String categoria = scanner.next();
         return categoria;
     }

    public void mostrarServiciosPorCategoria(Servicios servicios) {   
        System.out.println(servicios);
    }
    
}
