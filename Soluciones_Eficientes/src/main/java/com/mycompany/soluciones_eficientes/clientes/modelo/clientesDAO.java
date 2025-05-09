/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.clientes.modelo;

import com.mycompany.soluciones_eficientes.utils.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author camper
 */
public class clientesDAO implements clientesDAOInterface{

    private Connection db;

    public clientesDAO() {
        this.db = DatabaseConnector.getConnection();
    }
    
    
      @Override
    public void crear(Cliente cliente) {
        
           String sql = "INSERT INTO cliente(nombre,correo,telefono,direccion,sector,representante) values(?,?,?,?,?,?)";
          try (PreparedStatement ps =db.prepareStatement(sql) ) {
              ps.setString(1, cliente.getNombre());
              ps.setString(2, cliente.getCorreo());
              ps.setString(3, cliente.getTelefono());
              ps.setString(4, cliente.getDireccion());
              ps.setString(5, cliente.getSector());
              ps.setString(6, cliente.getRepresentante());
              ps.executeUpdate();
              System.out.println("Datos registrados :)");
          } catch (Exception e) {
              System.out.println("Error al ingresar los datos del cliente "+ e.getMessage());
          }
    }
    

    @Override
    public List<Cliente> listar() {
       return null;

    }

    @Override
    public void actualizar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
}
