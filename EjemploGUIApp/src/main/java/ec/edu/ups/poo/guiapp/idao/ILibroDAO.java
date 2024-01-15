/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.guiapp.idao;

import ec.edu.ups.poo.guiapp.modelo.Libro;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface ILibroDAO {
    List<Libro> listaLibro();
    Libro obtenerLibro(int id);
    void crearLibro(Libro libro);
    void actualizarLibro(int id, Libro libro);
    void eliminarLibro(int id);
}
