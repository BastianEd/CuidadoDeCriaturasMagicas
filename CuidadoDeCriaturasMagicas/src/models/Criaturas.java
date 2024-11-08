/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author basti
 */
public abstract class Criaturas {
    private String idCriaturaMagica;
    private String nombre;
    private String especie;
    private double peso;
    private int edad;
    private int diasEnHogwarts;
    private boolean requiereSupervisionNocturna;

    //Constructor
    public Criaturas(String idCriaturaMagica, String nombre, String especie, 
            double peso, int edad, int diasEnHogwarts, boolean requiereSupervisionNocturna) {
        this.idCriaturaMagica = idCriaturaMagica;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
        this.diasEnHogwarts = diasEnHogwarts;
        this.requiereSupervisionNocturna = requiereSupervisionNocturna;
    }
    
    //Getters and Setters

    public String getIdCriaturaMagica() {
        return idCriaturaMagica;
    }

    public void setIdCriaturaMagica(String idCriaturaMagica) {
        this.idCriaturaMagica = idCriaturaMagica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasEnHogwarts() {
        return diasEnHogwarts;
    }

    public void setDiasEnHogwarts(int diasEnHogwarts) {
        this.diasEnHogwarts = diasEnHogwarts;
    }

    public boolean isRequiereSupervisionNocturna() {
        return requiereSupervisionNocturna;
    }

    public void setRequiereSupervisionNocturna(boolean requiereSupervisionNocturna) {
        this.requiereSupervisionNocturna = requiereSupervisionNocturna;
    }
    
    
    
    
    //Metodo
    public abstract String mostrarDatos(); 
    public abstract double calcularCostoAlojamiento();
    
}
