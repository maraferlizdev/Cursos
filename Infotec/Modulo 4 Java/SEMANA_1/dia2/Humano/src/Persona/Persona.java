package Persona;

public class Persona {
private String nombre;
private int edad;
private final String fechaDeNacimiento;
public String fechaActual="";

public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}
public void presentarse(){
    System.out.println("Hola soy "+ nombre+ " tengo "+ edad);
}

public String presentarse2(){
    return "Hola soy " + nombre + " tengo " + edad + "años";
}
}

public int CalculoDeEdad(int fechaActual){
    int edadReal=0;
    edadReal =(int)this.fechaDeNacimiento-(int)this.fechaActual;

    return edadReal
}