/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author dsi
 */
public class Circulo {
    
    private Punto centro;
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(Punto puntoA, Punto puntoB){
        
    }
            
    public Circulo(double x, double y, double z){
    }
    
    public Punto getCentro(){
        return centro;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
        return 3.1416*radio*radio;
    }
    
    public double calcularPerimetro(){
        return 2*3.1416*radio;
                
    }
    
    public double calcularDistanciaDesde(Punto x){
        return x.calcularDistanciaDesde(x);
    }
    
}
