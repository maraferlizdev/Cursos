/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carltel;

/**
 *
 * @author dsi
 */
public class Cartel {
    int columna;
    int fila;
    
    public Cartel(){
        
    }
    
    public void dibujarL(){
        
        for(int columna = 1; columna <= 5; ++columna) {
         for(int fila = 1; fila <= 5; ++fila) {
            if (columna == 1 && fila == 1) {
               System.out.println("*");
            } else if (columna == 2 && fila == 1) {
               System.out.println("*");
            } else if (columna == 3 && fila == 1) {
               System.out.println("*");
            } else if (columna == 4 && fila == 1) {
               System.out.println("*");
            } else if (columna == 5 && (fila == 1 || fila == 2 || fila == 3 || fila == 4 || fila == 5)) {
               System.out.print("*");
            }
         }
      }
    }
    
    public void dibujarXx(){
        for(int columna = 1; columna <= 10; ++columna) {
            for(int fila = 1; fila <= 9; ++fila) {
                System.out.println("*         *");
                if (columna == 2) {
                    System.out.println(" *       * ");
                }else if (columna == 3) {
                    System.out.println("  *     *  ");
                } else if (columna == 4 || columna == 6 ){
                     System.out.println("   *   *   ");
                } else if (columna == 5){
                    System.out.println("    * *    ");
                    columna +=1; 
                    fila +=1; 
                }else if (columna == 7){
                     System.out.println("  *     *  ");
                }else if (columna == 8){
                 System.out.println(" *       * ");
                }else if (columna == 9){
                    System.out.println("*         *");
                }
            }
        }
        
    }
    
    
    public void dibujarX(){
        
        for(int fila = 1; fila <= 5; ++fila) {
         for(int columna = 1; columna <= 5; ++columna) {
            if (columna ==  fila || columna +  fila==6) {
               System.out.print("*");
            }else{
                System.out.print(" ");
            }
         }
            System.out.println("");
      }
    }
    
    
}


//for(fila = 1; fila <= 5; ++fila) €
//for (columna = 1; columna <= 5; ++columna) €
//if (fila = columna && fila + columna == 6) (
//System.out.print(s:"*");
//y else (
//System.out-print(s:" ");
//System.out.printin);