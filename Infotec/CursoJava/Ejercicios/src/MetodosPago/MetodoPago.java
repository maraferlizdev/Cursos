/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MetodosPago;

import java.util.Map;

/**
 *
 * @author dsi
 */
public interface MetodoPago {
    
    boolean procesarPago(double monto, Map<String, String> datosPago);
    
}
