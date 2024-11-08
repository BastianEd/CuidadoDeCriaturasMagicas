/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrNess
 */
public class RegistroCriaturas{
    private List<Criaturas> criaturasMagica = new ArrayList<>();

    //Constructor
    public RegistroCriaturas() {
    }

    
    //Getters and Setters
    public List<Criaturas> getCriaturasMagica() {
        return criaturasMagica;
    }

    public void setCriaturasMagica(List<Criaturas> criaturasMagica) {
        this.criaturasMagica = criaturasMagica;
    }
    
    //METODOS
    
        //Valida y agregar
    public boolean agregarCriatura(Criaturas parCriatura){
        for(Criaturas c : criaturasMagica){
            if(c.getIdCriaturaMagica().equals(parCriatura.getIdCriaturaMagica())){
               return false;
            }
        }
        criaturasMagica.add(parCriatura);
        return true;
    }
    
        //  Calcular costo Total de alojamiento
    public double calcularCostoTotalAlojamiento(){
        double costoTotal = 0;
        for(Criaturas c : criaturasMagica){
            costoTotal += c.calcularCostoAlojamiento();
        }             
        return costoTotal;   
    }
        //Listar Criaturas
    public void listarCrituras(){
        System.out.println("=== REGISTRO DE CRIATURAS MÁGICAS ===");
        for(Criaturas c: criaturasMagica){
            System.out.println("\n" + c.mostrarDatos());
            System.out.println("Costo de alojamiento: " + 
                    c.calcularCostoAlojamiento() + " Galeones");
            System.out.println("------------------");
        }
    }   
        //Contador de Criaturas Magicas dentro de la lista
    public int contarCriatura(){
        return criaturasMagica.size();
    }
    
    
}
