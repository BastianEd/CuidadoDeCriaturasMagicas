/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public class Hipogrifo extends Criaturas implements CostoAlojamiento{
    private int vuelosAlDia;
    private String temperamentoAlDias;

    //Constructor
    public Hipogrifo(int vuelosAlDia, String temperamentoAlDias, String idCriaturaMagica, String nombre, String especie, double peso, int edad, int diasCuidadosPorHogwarts, boolean requiereSupervisionNocturna) {
        super(idCriaturaMagica, nombre, "Hipogrifo", peso, edad, diasCuidadosPorHogwarts, requiereSupervisionNocturna);
        this.vuelosAlDia = vuelosAlDia;
        this.temperamentoAlDias = temperamentoAlDias;
    }
    
    //Getters and Setters

    public int getVuelosAlDia() {
        return vuelosAlDia;
    }

    public void setVuelosAlDia(int vuelosAlDia) {
        this.vuelosAlDia = vuelosAlDia;
    }

    public String getTemperamentoAlDias() {
        return temperamentoAlDias;
    }

    public void setTemperamentoAlDias(String temperamentoAlDias) {
        this.temperamentoAlDias = temperamentoAlDias;
    }
    
    
    

    @Override
    //Mostar Datos del Hipogrifo
    public String mostrarDatos() {
        return (
                "Hipogrifo: " + getNombre() + 
               "\nCódigo: " + getIdCriaturaMagica()+
               "\nPeso: " + getPeso() + 
               "\nEdad: " + getEdad() + 
               "\nDías en cuidado: " + getDiasEnHogwarts()+
               "\nTemperamento: " + temperamentoAlDias +
               "\nVuelos diarios: " + vuelosAlDia
                );
    }
    
    //Calcular la Estadia del alojamiento
    public double calcularCostoAlojamiento(){
        double costo = VALOR_DIA_ALOJAMIENTO * getDiasEnHogwarts();
        if(vuelosAlDia > 3){
            costo += costo * 1.10;
        }
        return costo;
    }
}
