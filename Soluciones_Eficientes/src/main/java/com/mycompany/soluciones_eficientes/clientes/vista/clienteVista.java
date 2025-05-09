/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.clientes.vista;

import com.mycompany.soluciones_eficientes.clientes.controller.clientesController;
import com.mycompany.soluciones_eficientes.clientes.modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class clienteVista {
    
    
    private Scanner scanner;

    
    public clienteVista(){
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }
 
 
    
    public Cliente mostrarDatosIngreso(){
        
        System.out.println("Nombre:");
        String nombre = scanner.next();
        System.out.println("Representante:");
        String representante = scanner.next();
        System.out.println("Correo:");
        String correo = scanner.next();
        System.out.println("Telefono:");
        String telefono = scanner.next();
        System.out.println("Direccion:");
        String direccion = scanner.next();
        System.out.println("Sector: ");
        System.out.println("""
                           1.Tecnología
                           2.Salud
                           3.Educación
                           4.Comercio
                           5.Manufactura
                           """);
        int  sector = Integer.parseInt(scanner.next());
        
        if (sector < 1 || sector >5) {
            System.out.println("No ingresaste un valor entre 1 y 5 :(");
        }else{
            
            switch (sector) {
                case 1 -> {
                    String tecnologia = "Tecnología";
                    return new Cliente(nombre,representante,correo,telefono,direccion,tecnologia);
                }
                case 2 -> {
                    String salud = "Salud";
                    return new Cliente(nombre,representante,correo,telefono,direccion,salud);
                }
                case 3 -> {
                    String educa = "Educación";
                    return new Cliente(nombre,representante,correo,telefono,direccion,educa);
                }
                case 4 -> {
                    String comercio = "Comercio";
                    return new Cliente(nombre,representante,correo,telefono,direccion,comercio);
                }
               
                case 5 -> {
                    String manu = "Manufactura";
                    return new Cliente(nombre,representante,correo,telefono,direccion,manu);
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
    
    
    
}
