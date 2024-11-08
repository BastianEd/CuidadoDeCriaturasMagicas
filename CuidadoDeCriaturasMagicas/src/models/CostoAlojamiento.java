/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public interface CostoAlojamiento {
    double VALOR_DIA_ALOJAMIENTO =250.0;// galeones por dia.
    
    /**
     * Calcula el costo total de alojamiento para la criatura
     * @return el costo total en galeones
     */
    double calcularCostoAlojamiento();
}
