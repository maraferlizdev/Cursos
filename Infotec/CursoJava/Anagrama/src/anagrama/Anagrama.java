/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrama;

/**
 *
 * @author dsi
 */

public class Anagrama {
    
//    String palabra1 = "";
//    String palabra2 = "";
    boolean esAnagrama;
    
    public Anagrama(){
        
    }
    
    public boolean esAnagrama(String palabra1, String palabra2){
        
        if (palabra1.length() == palabra2.length()){
            
                    char[] charArray1 = palabra1.toCharArray();
        
                    char[] charArray2 = palabra2.toCharArray();
                    
                    return esAnagrama;
        }else{
            esAnagrama = false;
            System.out.println("No son anagramas.");
        return esAnagrama; 
        }
    }
    
}


    //Soliicitar las palabras
    
    //Paso 0 Validar que las 2 palabras tengan el mismo número de letras.
    
    //Paso 1 convertir las cadena de string a un array de caracteres
    
    //Paso 2 Ordenar los caracteres
    
    //Paso 3 Comparar los valores para ver si es un anagrama
    
    //Paso 4 mostrar si es anagrama o no 