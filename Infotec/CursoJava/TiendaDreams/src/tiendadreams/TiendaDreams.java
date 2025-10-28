/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadreams;

/**
 *
 * @author dsi
 */
import java.util.ArrayList;
import java.util.List;

public class TiendaDreams {
    // atributos de la tienda
    private String nombre;
    private String direccion;
    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Ventas> ventas;
    // constructor 
    public TiendaDreams(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    // Metodo para registrar clientes en la tienda.
    public void registrarCliente(String nombre, String correo, int telefono) {
        Cliente nuevo = new Cliente(nombre, correo, telefono);
        clientes.add(nuevo);
        System.out.println("El cliente: " + nombre + " ha sido registrado con exito");
    }
    // Metodo para registrar productos en la tienda.
    public void registrarProducto(String nombre, double precio, String categoria, int stock) {
        Producto nuevo = new Producto(nombre, precio, categoria, stock);
        productos.add(nuevo);
        System.out.println("Producto " + this.nombre + " registrado.");
    }
    // Metodo para registrar ventas en la tienda.
    public void registrarVenta(Ventas venta) {
        ventas.add(venta);
    }
    // Metodo para mostrar el resumen de ventas en la tienda.
    public void mostrarResumenVentas() {
        
        System.out.println("=== Ventas de " + nombre + " ===");
        if (ventas.isEmpty()) {
            System.out.println("No se han registrado ventas (0).");
        } else {
            for (Ventas v : ventas) {
                v.consultarVentas();
            }
            System.out.println("Total de ventas: " + ventas.size());
            System.out.println("");
        }
    }
    // Metodos para consultar las existencias
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados (0).");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println("- " + c.getNombre() + " (" + c.getCorreo() + ")");
        }
        System.out.println("Total de clientes: " + clientes.size());
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
        System.out.println("No hay productos registrados (0).");
        } else {
            for (Producto p : productos) {
                p.mostrarDetalle();
            }
            System.out.println("Total de productos: " + productos.size());
        }
    }
    // metodos para consultar un campo
    public List<Producto> getProductos() {
        return productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }
}
