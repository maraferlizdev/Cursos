/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author dsi
 */
public class Gerente extends Empleado {
    private double bono;
    
    public Gerente (String nombre, double salarioBase, double bono){
        super(nombre,salarioBase);
                this.bono=bono;
    }
    @Override
    public double calcularSalario() {
        return salarioBase + bono; // Hereda y modifica el comportamiento
    }

}
