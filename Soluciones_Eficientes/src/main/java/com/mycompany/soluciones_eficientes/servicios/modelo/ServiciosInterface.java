/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.servicios.modelo;

import java.util.List;

/**
 *
 * @author camper
 */
public interface ServiciosInterface {
   
    
     List<Servicios>ServiciosCategoria(String cate);
    void calcularCostoTotal(int id);
    void crear(Servicios cliente);

    
}
