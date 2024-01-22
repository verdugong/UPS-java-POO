/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.guiapp.controlador;

import ec.edu.ups.poo.guiapp.idao.ILibroDAO;
import ec.edu.ups.poo.guiapp.idao.IPrestamoDAO;
import ec.edu.ups.poo.guiapp.idao.IUsuarioDAO;
import ec.edu.ups.poo.guiapp.modelo.Libro;
import ec.edu.ups.poo.guiapp.modelo.Prestamo;
import ec.edu.ups.poo.guiapp.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PrestamoControlador {
    private IPrestamoDAO prestamoDAO;
    private Prestamo prestamo;
    
    private ILibroDAO libroDAO;
    private Libro libro;
    
    private IUsuarioDAO usuarioDAO;
    private Usuario usuario;

    public PrestamoControlador(IPrestamoDAO prestamoDAO, ILibroDAO libroDAO, IUsuarioDAO usuarioDAO) {
        this.prestamoDAO = prestamoDAO;
        this.libroDAO = libroDAO;
        this.usuarioDAO = usuarioDAO;
    }

                  
    
    public void crearPrestamo(int id, List<Libro> libros, Usuario usuario, Date fechaPrestamo, double total) throws UsuarioNoEncontradoException, LibroNoEncontradoException{
        if(usuario != null){
            prestamo = new Prestamo(id, libros, usuario, fechaPrestamo, total);
            prestamo.setUsuario(usuario);
             for (Libro libro : libros) {
                Libro libroExistente = libroDAO.obtenerLibro(libro.getCodigo());
                if (libroExistente != null) {
                    prestamo.agregarLibro(libroExistente);
                } else {
                    // Lanzar excepción si un libro no se encuentra
                    throw new LibroNoEncontradoException("No se ha encontrado el libro con ID: " + libro.getCodigo());
                }
            }
            prestamoDAO.crearPrestamo(prestamo);
        }else{
            throw new UsuarioNoEncontradoException("No se ha encontrado el usuario");
        }        
    }
    
    public class UsuarioNoEncontradoException extends Exception {
        public UsuarioNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    public class LibroNoEncontradoException extends Exception {
        public LibroNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public void actualizarPrestamo(int id, List<Libro> libros, Usuario usuario, Date fechaPrestamo, double total){
        prestamo = prestamoDAO.obtenerPrestamo(id);
        prestamo.setUsuario(usuario);
        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setTotal(total);
        prestamoDAO.actualizarPrestamo(id, prestamo);
    }
    
    public void eliminarPrestamo(int id){
        prestamo = prestamoDAO.obtenerPrestamo(id);
        prestamoDAO.eliminarPrestamo(prestamo.getId());
    }
    
    public Prestamo buscarPrestamoPorId(int id){
        prestamo = prestamoDAO.obtenerPrestamo(id);
        return prestamo;
    }
    
    public List<Prestamo> listarPrestamos(){
        return prestamoDAO.listarPrestamo();
    }
  
}
