/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadreams;

/**
 *
 * @author dsi
 */
public class DetalleVenta {
    // atributos de la tienda
    private Producto producto;
    private int cantidad;
    private double subtotal;
    // constructor 
    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }
    // metodos para consultar un campo
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getSubtotal() { return subtotal; }
    // metodos para actualizar el subtotal
    
    
    public void actualizarSubtotal() {
        this.subtotal = producto.getPrecio() * cantidad;
    }

    @Override
    //metodo para dar formato y mostrar el resultado de la factura
    public String toString() {
        return String.format("%s x %d  $ %.2f = $ %.2f",
                producto.getNombre(), cantidad, producto.getPrecio(), subtotal);
    }
}
