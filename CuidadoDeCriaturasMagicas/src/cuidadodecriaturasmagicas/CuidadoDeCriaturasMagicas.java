/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuidadodecriaturasmagicas;

    //Importacione de Models
import models.*;// El * implementa todas las clases dentro del package models
import java.util.Scanner;
/**
 *
 * @author basti
 */
public class CuidadoDeCriaturasMagicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegistroCriaturas registro = new RegistroCriaturas();
        
        //Agregar Criacturas Magicas
            //Dragones
        Dragon dragon1 = new Dragon(15, "D001", "Norberta", "Colacuerno Húngaro", 2000, 1, 10, false);
        Dragon dragon2 = new Dragon(10,"D002","Michael","Bola de Fuego Chino",2500,2,10,false);
            
            //Niffler
        Niffler niffler11 = new Niffler(10, "N001", "Teddy", "North American", 1, 2, 15, true);
            
            //Hipogrifo
        Hipogrifo hipogrifo1 = new Hipogrifo(16, "Amigable", "H001", "Julian", "Asian", 600, 2, 15, false);
        
            //Thestral
        Thestral thestral1 = new Thestral("Luna lovengood", "T001", "Manda", "Britian", 50, 1, 1, false);
        
            //Bowtruckles
        Bowtruckles bowtruckles1 = new Bowtruckles(12, "B001", "Jualiana", "Scottish", 0.100, 1, 2, false);
        
        //Añadir Criaturas Magicas al Registro
        registro.agregarCriatura(dragon1);
        registro.agregarCriatura(dragon2);
        registro.agregarCriatura(niffler11);
        registro.agregarCriatura(hipogrifo1);
        registro.agregarCriatura(thestral1);
        registro.agregarCriatura(bowtruckles1);
        
        // Listar Criaturas
        registro.listarCrituras();
        
        // Mostrar el total de criaturas
        System.out.println("\nTotal de criaturas en el registro: " + 
                          registro.contarCriatura());
        
        // Mostrar el costo total de alojamiento
        System.out.println("Costo total de alojamiento: " + 
                          registro.calcularCostoTotalAlojamiento() + " Galeones");
        
        // Intentar agregar una criatura con código duplicado
        Dragon dragonDuplicado = new Dragon(15, "D001", "Norberta", "Colacuerno Húngaro", 2000, 1, 10, false);
        if (!registro.agregarCriatura(dragonDuplicado)) {
            System.out.println("\n¡Error! No se puede agregar una criatura con código duplicado.");
        }
        
        
        //MENU ---PROXIMAMENTE---
        Scanner entrada = new Scanner(System.in);
        
        
            //Ciclo while
        int opcion = 0;
        while(opcion !=4){
            System.out.println("=====MENU======");
            System.out.println("[1] Agregar Criatura Magica");
            System.out.println("[2] Mostrar Lista de Criaturas Magicas");
            System.out.println("[3] Mostrar Total de Criaturas y el Costo de Alojamiento");
            System.out.println("[4] Salir");
            System.out.println("Seleccione una opción:");
            opcion = entrada.nextInt();
            
            //switch de opciones del menu
            switch (opcion) {
                case 1:
                     
                case 2:
                
                case 3:
                
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
                    
        }
        
    }
}
