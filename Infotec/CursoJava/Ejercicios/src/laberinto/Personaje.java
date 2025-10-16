/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

/**
 *
 * @author dsi
 */
public class Personaje {
    
    private String nombre;
    private int vida = 10;
    
    public Personaje(){
        
    }
    
    public Personaje(String nombre, int vida ){
        this.nombre= nombre;
        this.vida = vida;
    }
}
