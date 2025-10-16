/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author dsi
 */
public class Coche extends Vehiculo {
    
    private int numeroPuertas;
    
    public Coche(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año); // Llama al constructor del padre
        this.numeroPuertas = numeroPuertas;
    }

}
