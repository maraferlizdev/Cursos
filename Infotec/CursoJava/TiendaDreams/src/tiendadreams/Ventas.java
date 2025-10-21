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
public class Ventas {
    private List<Producto> productos;
    private int cantidad;
    private Cliente cliente;
    private double totalVenta;
    
    public Ventas(Cliente cliente){
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.totalVenta = 0;
    }
    
    public void registrarVenta(Producto producto, int cantidad) {
        if (producto.comprobarStock(cantidad)) {
            productos.add(producto);
            this.cantidad += cantidad;
            producto.actualizarStock(cantidad);
            calcularTotalVentas();
            cliente.agregarCompra(this);
            System.out.println("Venta registrada para " + cliente.getNombre());
        } else {
            System.out.println("No hay suficiente stock para " + producto.getNombre());
        }
    }
    
    public void calcularTotalVentas() {
        totalVenta = 0;
        for (Producto p : productos) {
            totalVenta += p.getPrecio() * cantidad;
        }
    }
    
    public void consultarVentas() {
        System.out.println("Venta a " + cliente.getNombre() + " por $" + totalVenta);
        for (Producto p : productos) {
            p.mostrarDetalle();
        }
    }
    
    public double getTotalVenta() { 
        return totalVenta; 
    }
    
}
