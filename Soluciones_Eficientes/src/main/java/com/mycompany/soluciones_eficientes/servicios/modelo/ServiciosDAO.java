/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones_eficientes.servicios.modelo;

import com.mycompany.soluciones_eficientes.utils.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class ServiciosDAO implements ServiciosInterface{

    private Connection db;
    
    public ServiciosDAO(){
      this.db = DatabaseConnector.getConnection();

    }
    

    @Override
    public void calcularCostoTotal(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crear(Servicios cliente) {

    String sql = "INSERT INTO servicio(nombre,descripcion,precioporhora,categoria) values(?,?,?,?)";
          try (PreparedStatement ps =db.prepareStatement(sql) ) {
              ps.setString(1, cliente.getNombre());
              ps.setString(2, cliente.getDescripcion());
              ps.setDouble(3, cliente.getPrecioHora());
              ps.setString(4, cliente.getCategoria());
              ps.executeUpdate();
              System.out.println("Datos registrados :)");
          } catch (Exception e) {
              System.out.println("Error al ingresar los datos del servicio "+ e.getMessage());
          }
    }

    @Override
    public List<Servicios> ServiciosCategoria(String categoria) {
    
        List<Servicios> lsServicios = new ArrayList<>();
        String sql = "select * from servicio  where UPPER(categoria)=UPPER(?)";
        try (PreparedStatement ps = db.prepareStatement(sql)){
            ps.setString(1, categoria);
            
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {                
               Servicios servicios = new Servicios(
                       rs.getString("nombre"),
                       rs.getString("descripcion"),
                       rs.getInt("preciohora"),
                       rs.getString("categoria")
               ); 
               lsServicios.add(servicios);
            }

        } catch (Exception e) {
            System.out.println("Error al traer los servicios " + e.getMessage());
        }
         return lsServicios;
    }

    
    
}
