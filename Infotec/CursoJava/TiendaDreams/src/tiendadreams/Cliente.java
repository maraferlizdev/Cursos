/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadreams;

/**
 *
 * @author dsi
 */
public class Cliente {
    private String nombre;
    private String correo;
    private int telefono;

    public Cliente(String nombre, String correo, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
 
    public void registrarCliente(String nombre, String correo, int telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        
        System.out.println("El cliente ha sido registrado con exito");
    }
    
    public void ConsultarCompras(){
        
    }
    
    public void actualizarCliente(String nombre, String correo, int telefono){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
}
