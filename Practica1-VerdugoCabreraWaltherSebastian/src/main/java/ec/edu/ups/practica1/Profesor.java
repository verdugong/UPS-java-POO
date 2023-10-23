/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica1;

/**
 *
 * @author sebas
 */
public class Profesor {
    private String nombre;
    private int edad;
    private String conocimientos;
    private String especialidades;

    public Profesor() {
    }

    public Profesor(String nombre, int edad, String conocimientos, String especialidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.conocimientos = conocimientos;
        this.especialidades = especialidades;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String conocimientos) {
        this.conocimientos = conocimientos;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + " años" + ", conocimientos=" + conocimientos + ", especialidades=" + especialidades + '}';
    }
    
    
}
