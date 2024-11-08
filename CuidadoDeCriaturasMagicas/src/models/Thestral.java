/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public class Thestral extends Criaturas implements CostoAlojamiento{
    private String magoCuidador;
    
    //Constructor
    public Thestral(String magoCuidador, String idCriaturaMagica, String nombre, String especie, double peso, int edad, int diasCuidadosPorHogwarts, boolean requiereSupervisionNocturna) {
        super(idCriaturaMagica, nombre, "Thestral", peso, edad, diasCuidadosPorHogwarts, requiereSupervisionNocturna);
        this.magoCuidador = magoCuidador;
    }

    //Getters and Setters

    public String getMagoCuidador() {
        return magoCuidador;
    }

    public void setMagoCuidador(String magoCuidador) {
        this.magoCuidador = magoCuidador;
    }
    
    
    
    //Metodos
    @Override
        //Mostar Datos del Dragon
    public String mostrarDatos() {
        return(
                "Thestral: " + getNombre() + 
               "\nCódigo: " + getIdCriaturaMagica()+
               "\nPeso: " + getPeso() + 
               "\nEdad: " + getEdad() + 
               "\nDías en cuidado: " + getDiasEnHogwarts()+
               "\nMago cuidador: " + magoCuidador);
    }
    
        //Calcular la Estadia del alojamiento
    public double calcularCostoAlojamiento(){
        return VALOR_DIA_ALOJAMIENTO * getDiasEnHogwarts() * 1.08;
    }
}
