/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.idao;

import ec.edu.ups.practica3.modelo.Libro;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface ILibroDAO {
    List<Libro> obtenerLibros();
    Libro obtenerLibro(int id);
    void crearLibro(Libro libro);
    boolean actualizarLibro(int id, Libro libro);
    boolean eliminarLibro(int id);
}
