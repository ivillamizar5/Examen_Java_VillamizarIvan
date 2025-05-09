/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.mycompany.soluciones_eficientes.clientes.controller.clientesController;
import com.mycompany.soluciones_eficientes.clientes.modelo.clientesDAO;
import com.mycompany.soluciones_eficientes.clientes.vista.clienteVista;
import com.mycompany.soluciones_eficientes.servicios.controller.ServiciosController;
import com.mycompany.soluciones_eficientes.servicios.modelo.ServiciosDAO;
import com.mycompany.soluciones_eficientes.servicios.vista.ServiciosVista;
import com.mycompany.soluciones_eficientes.utils.DatabaseConnector;
import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        clientesDAO daoCliente = new clientesDAO();
        clienteVista vistaCliente = new clienteVista();
        clientesController clienteController = new clientesController(daoCliente,vistaCliente);
        
        ServiciosDAO serviciosDAO = new ServiciosDAO();
        ServiciosVista serviciosVista = new ServiciosVista();
        ServiciosController serviciosController = new ServiciosController(serviciosDAO,serviciosVista);
        
        
        
        
        boolean opcion = true;
        

        while (opcion) {        
            
                    String menu = """
                            ***BIENVENIDO **
                      1. Gestionar clientes
                      2.Gestión de Servicios
                      3.Gestión de Contratos
                      4.Gestión de Proyectos
                      5. Gestión de Empleados
                      6. Reportes
                      7. Salir
                      """;
            System.out.println(menu);
            System.out.println("Ingrese el numero de la lista: ");
            int numero = Integer.parseInt(vistaCliente.getScanner().next());
                    
          switch (numero) {
            case 1:
                clienteController.menu();
                break;
             case 2:
                serviciosController.menu();
                break;
                
            case 7:
                
                break;
            default:
                throw new AssertionError();
        }
        }

                
        
        
       
        
        
    }
}
