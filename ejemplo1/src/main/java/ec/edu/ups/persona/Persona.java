/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.persona;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class Persona {
    public String numCedula;
    public String nombre;
    public String apellido;
    private Date fechaNac;
    private double estatura;
    private double peso;
    
    public Persona(){
        
    }
    public Persona(String numCedula, String nombre, String apellido){
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String numCedula, String nombre, String apellido, Date fechaNac, double estatura, double peso) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int calcularEdad(Date fechaActual){
        return 0;
    }
    
    public double calcularIMC(){
        return 2.5;
    }
    
    public boolean esMayorDeEdad(int limteEdad){
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" + "numCedula=" + numCedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
