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
    // atributos del producto
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;
    // constructor vacio
    public Producto() {
    }
    // constructor para productos
    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }
    // metodo para comprobar el stock
    public boolean comprobarStock(int cantidad){
        return this.stock >= cantidad;
    }
    // metodo para actualizar el stock
    public void actualizarStock(int cantidad){
        
        if (comprobarStock(cantidad)) {
            this.stock -= cantidad;
            System.out.println("Stock de " + this.nombre + " actualizado. Nuevo stock: " + this.stock);
        } else {
            System.out.println("No hay suficiente stock para " + this.nombre);
        }
    }
    // metodo para mostrar el detalle
    public void mostrarDetalle(){
        System.out.println("--- Detalles del Producto ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoría: " + this.categoria);
        System.out.println("Stock: " + this.stock);
    }
    // metodos para consultar un campo
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
    // metodo para actualizar un campo
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}


