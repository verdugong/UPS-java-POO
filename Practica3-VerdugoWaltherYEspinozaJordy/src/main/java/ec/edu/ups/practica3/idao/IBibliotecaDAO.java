/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.idao;

import ec.edu.ups.practica3.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IBibliotecaDAO {
    List<Biblioteca> obtenerBiblioteca();
    Biblioteca obtenerBiblioteca(int id);
    void crearBiblioteca(Biblioteca biblioteca);
    boolean actualizarBiblioteca(int id, Biblioteca biblioteca);
    boolean eliminarBiblioteca(int id);
}
