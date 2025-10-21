/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principios_dry;

import java.util.Scanner;

/**
 *
 * @author dsi
 */
public class main {

    static Scanner sc = new Scanner(System.in);
    static String nombre;
    static int edad;
    static int fechaNacimiento;
    /**
     * @param args the command line arguments
     */
    
    public static String Preguntar(String texto){
        System.out.println(texto);
        String respuesta = sc.nextLine();
        return respuesta;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        nombre=Preguntar("Ingresa tu nombre");
        edad= Integer.parseInt(Preguntar( "Ingresa tu edad: "));
        
        fechaNacimiento = Integer.parseInt(Preguntar("Ingresa tu fecha de nacimiento"));
        
        System.out.println("Hola " + nombre + " tienes: " + edad + " y naciste: " + fechaNacimiento);
        
        sc.close();
    }
    
}
