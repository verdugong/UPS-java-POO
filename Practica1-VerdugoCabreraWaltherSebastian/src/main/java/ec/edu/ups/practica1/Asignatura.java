/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica1;

/**
 *
 * @author sebas
 */
public class Asignatura {
    private String nombre;
    private int codigo;
    private int numHorasDeMateria;

    public Asignatura() {
    }

    public Asignatura(String nombre, int codigo, int numHorasDeMateria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHorasDeMateria = numHorasDeMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumHorasDeMateria() {
        return numHorasDeMateria;
    }

    public void setNumHorasDeMateria(int numHorasDeMateria) {
        this.numHorasDeMateria = numHorasDeMateria;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", codigo=" + codigo + ", numHorasDeMateria=" + numHorasDeMateria + "horas" + '}';
    }
    
    
}
