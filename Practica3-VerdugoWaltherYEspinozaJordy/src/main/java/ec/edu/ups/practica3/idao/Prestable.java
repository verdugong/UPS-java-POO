/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.idao;

import ec.edu.ups.practica3.modelo.Libro;

/**
 *
 * @author sebas
 */
public interface Prestable {
    public abstract void prestar();
    
    public abstract void devolver(Libro libro);
}
