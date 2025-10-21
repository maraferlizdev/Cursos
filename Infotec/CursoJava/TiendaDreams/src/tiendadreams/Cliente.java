/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadreams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsi
 */
public class Cliente {
    private String nombre;
    private String correo;
    private int telefono;
    private List<Ventas> compras;

    public Cliente() {
    }
    
    public Cliente(String nombre, String correo, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.compras = new ArrayList<>();
    }
 
    public void registrarCliente(String nombre, String correo, int telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.compras = new ArrayList<>();
        
        System.out.println("El cliente: " + nombre + " ha sido registrado con exito");
    }
    
    public void ConsultarCompras(){
        System.out.println("Consultando compras del cliente " + this.nombre + ":");
        
        for (Ventas venta : compras) {
            venta.consultarVentas();
        }
    }
    
    public void actualizarCliente(String nombre, String correo, int telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        
        System.out.println("Información del cliente " + this.nombre + " actualizada.");
    }
    
    public void agregarCompra(Ventas venta) {
        compras.add(venta);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    
    
}
