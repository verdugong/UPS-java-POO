/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.idao;

import ec.edu.ups.practica3.modelo.Prestamo;
import ec.edu.ups.practica3.modelo.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IPrestamoDAO {
    List<Prestamo> obtenerPrestamo();
    List<Prestamo> obtenerPrestamosPorUsuario(Usuario usuario);
    List<Prestamo> obtenerPrestamoPorFecha(Date fechaPrestamo);
    Prestamo obtenerPrestamo(int id);
    void crearPrestamo(Prestamo prestamo);
    boolean actualizarPrestamo(int id, Prestamo prestamo);
    boolean eliminarPrestamo(int id);
}
