/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.clientes.modelo;

import java.util.List;

/**
 *
 * @author camper
 */
public interface clientesDAOInterface {
    
   
    List<Cliente>listar();
    void actualizar(Cliente cliente);
    void eliminar(int id);
    void crear(Cliente cliente);
    
    
}
