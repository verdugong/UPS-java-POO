/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.idao;

import ec.edu.ups.poo.ejemplouiapp.modelo.Prestamo;
import ec.edu.ups.poo.ejemplouiapp.modelo.Usuario;
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
