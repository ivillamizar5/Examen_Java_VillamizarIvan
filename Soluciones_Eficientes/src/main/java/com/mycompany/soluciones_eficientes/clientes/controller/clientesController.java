/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.clientes.controller;

import com.mycompany.soluciones_eficientes.clientes.modelo.Cliente;
import com.mycompany.soluciones_eficientes.clientes.modelo.clientesDAO;
import com.mycompany.soluciones_eficientes.clientes.vista.clienteVista;

/**
 *
 * @author camper
 */
public class clientesController {
    
    
    private clientesDAO dao;
    private clienteVista vista;

    public clientesController(clientesDAO dao, clienteVista vista) {
     this.dao = dao;
     this.vista = vista;
    }
    
    
    
    
    
    public void registrarCliente(){
        Cliente ingCliente = vista.mostrarDatosIngreso(); 
        dao.crear(ingCliente);
    }
    
    
    
    
    public void menu(){
        
        
        String menu = """
                        *** GESTION DE CLIENTES ***
                      1. Registrar cliente;
                      """;
        
        System.out.println(menu);
        int opcion = vista.ingresarOpcionMenu();
        
        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
    
    
    
}
