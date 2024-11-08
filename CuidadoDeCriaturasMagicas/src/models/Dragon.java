/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public class Dragon extends Criaturas implements CostoAlojamiento{
    private int vecesEscupeFuegoAlDia;

    //Constructor
    public Dragon(int vecesEscupeFuegoAlDia, String idCriaturaMagica, String nombre, 
            String especie, double peso, int edad, int diasCuidadosPorHogwarts,
            boolean requiereSupervisionNocturna) {
        //Llamamos al constructor de la clase Padre
        super(idCriaturaMagica, nombre, "Dragon", peso, edad, diasCuidadosPorHogwarts, requiereSupervisionNocturna);
        this.vecesEscupeFuegoAlDia = vecesEscupeFuegoAlDia;
    }

    public int getVecesEscupeFuegoAlDia() {
        return vecesEscupeFuegoAlDia;
    }

    public void setVecesEscupeFuegoAlDia(int vecesEscupeFuegoAlDia) {
        this.vecesEscupeFuegoAlDia = vecesEscupeFuegoAlDia;
    }
    
    @Override
    //Mostar Datos del Dragon
    public String mostrarDatos() {
        return(
                "NOMBRE: "+ getNombre()+
                "\nCódigo: " + getIdCriaturaMagica() +
                "\nPeso: "+ getPeso()+
                "\nEdad: "+getPeso()+
                "\nDías en cuidado: "+getDiasEnHogwarts()+
                "\n Fuego por dia: "+vecesEscupeFuegoAlDia
                );
    }
    
    //Calcular la Estadia del alojamiento
    public double calcularCostoAlojamiento(){
        double costo = VALOR_DIA_ALOJAMIENTO * getDiasEnHogwarts();
        if(vecesEscupeFuegoAlDia > 5){
            costo += costo * 1.15;
        }
        return costo;
    }
   
}
