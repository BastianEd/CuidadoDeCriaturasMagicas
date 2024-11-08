/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public class Bowtruckles extends Criaturas implements CostoAlojamiento{
    private int arbolesReparados;

    //Constuctor
    public Bowtruckles(int arbolesReparados, String idCriaturaMagica, String nombre, String especie, double peso, int edad, int diasCuidadosPorHogwarts, boolean requiereSupervisionNocturna) {
        super(idCriaturaMagica, nombre, especie, peso, edad, diasCuidadosPorHogwarts, requiereSupervisionNocturna);
        this.arbolesReparados = arbolesReparados;
    }
    
    //Getters and Setters

    public int getArbolesReparados() {
        return arbolesReparados;
    }

    public void setArbolesReparados(int arbolesReparados) {
        this.arbolesReparados = arbolesReparados;
    }
    
    //Metodos
    
    @Override
    public String mostrarDatos() {
        return (
                "Bowtruckle: " + getNombre() + 
               "\nCódigo: " + getIdCriaturaMagica()+
               "\nPeso: " + getPeso() + 
               "\nEdad: " + getEdad() + 
               "\nDías en cuidado: " + getDiasEnHogwarts()+
               "\nÁrboles reparados: " + arbolesReparados);
    }

    @Override
    public double calcularCostoAlojamiento() {
        double costo = VALOR_DIA_ALOJAMIENTO * getDiasEnHogwarts();
        // Si repara más de 3 árboles, descuento del 5%
        if (arbolesReparados > 3) {
            return costo * 0.95; // 100% - 5% = 95%
        }
        return costo;
    }    
}
