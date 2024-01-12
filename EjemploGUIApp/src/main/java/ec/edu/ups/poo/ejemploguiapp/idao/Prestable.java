/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.idao;

import ec.edu.ups.poo.ejemplouiapp.modelo.Libro;

/**
 *
 * @author sebas
 */
public interface Prestable {
    public abstract void prestar();
    
    public abstract void devolver(Libro libro);
}
