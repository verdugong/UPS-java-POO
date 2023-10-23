/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica1;

/**
 *
 * @author sebas
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private int id;
    private String historia;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int id, String historia) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.historia = historia;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + " años" + ", id=" + id + ", historia=" + historia + '}';
    }
    
}
