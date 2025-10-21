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
    private String nombre;
    private String direccion;
    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Ventas> ventas;

    public TiendaDreams(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarVenta(Ventas venta) {
        ventas.add(venta);
    }

    public void mostrarResumenVentas() {
        
        System.out.println("=== Ventas de " + nombre + " ===");
        if (ventas.isEmpty()) {
            System.out.println("No se han registrado ventas (0).");
        } else {
            for (Ventas v : ventas) {
                v.consultarVentas();
            }
            System.out.println("Total de ventas: " + ventas.size());
        }
    }
    
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
