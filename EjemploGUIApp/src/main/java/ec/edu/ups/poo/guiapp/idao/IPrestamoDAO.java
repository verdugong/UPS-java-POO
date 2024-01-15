/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.guiapp.idao;

import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IPrestamoDAO {
    List<Prestamo> listarPrestamo();
    Prestamo obtenerPrestamo(int id);
    void crearPrestamo(Prestamo prestamo);
    void actualizarPrestamo(int id, Prestamo prestamo);
    void eliminarPrestamo(int id);
}
