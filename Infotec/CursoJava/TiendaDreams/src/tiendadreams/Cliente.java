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
    // atributos del cliente
    private String nombre;
    private String correo;
    private int telefono;
    private List<Ventas> compras;
    
    // constructor vacio
    public Cliente() {
    }
    //  constructor para crear clientes
    public Cliente(String nombre, String correo, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.compras = new ArrayList<>();
    }
    //   Muesta las compras de un cliente que corresponden a una venta
    public void ConsultarCompras(){
        System.out.println("Consultando compras del cliente " + this.nombre + ":");
        
        for (Ventas venta : compras) {
            venta.consultarVentas();
        }
    }
    //  Permite modificar los datos de un cliente registrado
    public void actualizarCliente(String nombre, String correo, int telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        
        System.out.println("Información del cliente " + this.nombre + " actualizada.");
    }
    // Permite agregar una compra a un cliente+++
    public void agregarCompra(Ventas venta) {
        compras.add(venta);
    }
    // Devuelve el nombre de un cliente
    public String getNombre() {
        return nombre;
    }
    // Devuelve el correo de un cliente
    public String getCorreo() {
        return correo;
    }
    // Devuelve el teléfono de un cliente
    public int getTelefono() {
        return telefono;
    }
}
