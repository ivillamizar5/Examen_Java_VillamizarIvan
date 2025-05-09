/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.servicios.controller;

import com.mycompany.soluciones_eficientes.clientes.vista.clienteVista;
import com.mycompany.soluciones_eficientes.servicios.modelo.Servicios;
import com.mycompany.soluciones_eficientes.servicios.modelo.ServiciosDAO;
import com.mycompany.soluciones_eficientes.servicios.vista.ServiciosVista;
import java.util.Iterator;

/**
 *
 * @author camper
 */
public class ServiciosController {
    
      private ServiciosDAO dao;
    private ServiciosVista vista;

    public ServiciosController(ServiciosDAO dao, ServiciosVista vista) {
     this.dao = dao;
     this.vista = vista;
    }
    
    
   private void consultarServicioPorCategoria() {

       String categoria = vista.ingresarCategoria();
          for (Servicios servicios : dao.ServiciosCategoria(categoria)) {
              vista.mostrarServiciosPorCategoria(servicios);
          }
    }
    
    public void crearServicios(){
         Servicios ingServicio = vista.mostrarDatosIngreso(); 
        dao.crear(ingServicio);
    }

    public void menu() {

        String menu = """
                        *** GESTION DE Servicios ***
                      1. Registrar Servicios;
                      2. Consultar por categorias
                      """;
        
        System.out.println(menu);
        int opcion = vista.ingresarOpcionMenu();
        
        switch (opcion) {
            case 1:
                crearServicios();
                break;
            case 2:
                consultarServicioPorCategoria();
                break;
            default:
                throw new AssertionError();
        }    }
    
    
    
    
    
    
}
