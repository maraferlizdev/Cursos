/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadreams;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dsi
 */
public class Ventas {
    private Cliente cliente;
    private List<DetalleVenta> detalles;
    private double totalVenta;
    private Date fecha;

    public Ventas(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.totalVenta = 0.0;
        this.fecha = new Date();
    }

    /**
     * Añade un detalle a la venta si hay stock suficiente.
     * Devuelve true si se pudo agregar, false si no hay stock.
     */
    public boolean agregarDetalle(Producto producto, int cantidad) {
        if (producto.comprobarStock(cantidad)) {
            DetalleVenta detalle = new DetalleVenta(producto, cantidad);
            detalles.add(detalle);
            // descontar stock inmediatamente al agregar el detalle
            producto.actualizarStock(cantidad);
            calcularTotal();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcula el total de la venta sumando subtotales.
     */
    public double calcularTotal() {
        totalVenta = 0.0;
        for (DetalleVenta d : detalles) {
            // por si cambiaron precios o cantidades luego
            d.actualizarSubtotal();
            totalVenta += d.getSubtotal();
        }
        return totalVenta;
    }

    /**
     * Muestra la factura por consola: datos del cliente, fecha, lista de items y total.
     */
    public void mostrarFactura() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("\n===== FACTURA =====");
        System.out.println("Tienda: Dreams Store");
        System.out.println("Fecha: " + sdf.format(fecha));
        System.out.println("Cliente: " + cliente.getNombre() + " - " + cliente.getCorreo());
        System.out.println("-----------------------------");
        if (detalles.isEmpty()) {
            System.out.println("(No hay items en la venta)");
        } else {
            for (DetalleVenta d : detalles) {
                System.out.println(d.toString());
            }
            System.out.println("-----------------------------");
            System.out.printf("TOTAL: %.2f%n", calcularTotal());
        }
        System.out.println("=============================\n");
    }

    /**
     * Método para mostrar resumen (usado por TiendaDreams.mostrarResumenVentas)
     */
    public void consultarVentas() {
        System.out.printf("Venta a %s - Total: %.2f - Items: %d%n",
                cliente.getNombre(), totalVenta, detalles.size());
    }

    // Getters
    public Cliente getCliente() { return cliente; }
    public List<DetalleVenta> getDetalles() { return detalles; }
    public double getTotalVenta() { return totalVenta; }
    public Date getFecha() { return fecha; }
}