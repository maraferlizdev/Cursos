/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadreams;

/**
 *
 * @author dsi
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;

    public Producto() {
    }
    
    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }
    
    public void registrarProducto(String nombre, double precio, String categoria, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        
        System.out.println("Producto " + this.nombre + " registrado.");
    }
    
    public boolean comprobarStock(int cantidad){
        return this.stock >= cantidad;
    }
    
    public void actualizarStock(int cantidad){
        
        if (comprobarStock(cantidad)) {
            this.stock -= cantidad;
            System.out.println("Stock de " + this.nombre + " actualizado. Nuevo stock: " + this.stock);
        } else {
            System.out.println("No hay suficiente stock para " + this.nombre);
        }
    }
    
    public void mostrarDetalle(){
        System.out.println("--- Detalles del Producto ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoría: " + this.categoria);
        System.out.println("Stock: " + this.stock);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}


