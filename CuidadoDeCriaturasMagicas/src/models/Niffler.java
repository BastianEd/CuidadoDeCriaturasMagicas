/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public class Niffler extends Criaturas implements CostoAlojamiento{
    private int tesorosEncontrados;

    //Constructor
    public Niffler(int tesorosEncontrados, String idCriaturaMagica, String nombre, String especie, double peso, int edad, int diasCuidadosPorHogwarts, boolean requiereSupervisionNocturna) {
        super(idCriaturaMagica, nombre, "Niffler", peso, edad, diasCuidadosPorHogwarts, requiereSupervisionNocturna);
        this.tesorosEncontrados = tesorosEncontrados;
    }
    
    //Getters and Setters

    public int getTesorosEncontrados() {
        return tesorosEncontrados;
    }

    public void setTesorosEncontrados(int tesorosEncontrados) {
        this.tesorosEncontrados = tesorosEncontrados;
    }
    
    
    //Metodos
    @Override
    
        //Mostar Datos del Dragon
    public String mostrarDatos() {
        return(
               "Niffler: " + getNombre() + 
               "\nCódigo: " + getIdCriaturaMagica()+
               "\nPeso: " + getPeso() + 
               "\nEdad: " + getEdad() + 
               "\nDías en cuidado: " + getDiasEnHogwarts()+
               "\nTesoros encontrados: " + tesorosEncontrados);
    }
    
        //Calcular la Estadia del alojamiento
    public double calcularCostoAlojamiento(){
        double costo = VALOR_DIA_ALOJAMIENTO * getDiasEnHogwarts();
        
        // Si encuentra más de 10 tesoros, descuento del 12%
        if(tesorosEncontrados > 10){
            return costo * 0.88; // 100% - 12% = 88%
        }
        return costo;
    }
     
    
    
    
    
    
}
