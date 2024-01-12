/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.controlador;

import ec.edu.ups.practica3.idao.ILibroDAO;
import ec.edu.ups.practica3.idao.IPrestamoDAO;
import ec.edu.ups.practica3.idao.IUsuarioDAO;
import ec.edu.ups.practica3.modelo.Libro;
import ec.edu.ups.practica3.modelo.Prestamo;
import ec.edu.ups.practica3.modelo.Usuario;
import ec.edu.ups.practica3.vista.LibroVista;
import ec.edu.ups.practica3.vista.PrestamoVista;
import ec.edu.ups.practica3.vista.UsuarioVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PrestamoControlador {
    private IPrestamoDAO prestamoDAO;
    private PrestamoVista prestamoVista;
    private Prestamo prestamo;
    
    private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;
    
    private IUsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Usuario usuario;

    public PrestamoControlador(IPrestamoDAO prestamoDAO, PrestamoVista prestamoVista, ILibroDAO libroDAO, LibroVista libroVista, IUsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.prestamoDAO = prestamoDAO;
        this.prestamoVista = prestamoVista;
        this.libroDAO = libroDAO;
        this.libroVista = libroVista;
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
    }

                  
    
    public void crearPrestamo(){
        prestamo = prestamoVista.ingresarDatosPrestamo();
        String idUsuario = usuarioVista.buscarDatosUsuario();
        usuario = usuarioDAO.obtenerUsuario(idUsuario);
        if(usuario != null){
            prestamo.setUsuario(usuario);
            int numeroDeLibros = prestamoVista.agregarProductosAPrestamo();
            for (int i = 0; i < numeroDeLibros; i++) {
                int idLibro = libroVista.buscarDatosLibro();
                libro = libroDAO.obtenerLibro(idLibro);
                if(libro != null){
                    prestamo.agregarLibro(libro);
                }else{
                    libroVista.mostrarAlertas("No se ha encontrado los datos del Libro!");
                }
            } 
            prestamoDAO.crearPrestamo(prestamo);
        }else{
            usuarioVista.mostrarAlertas("No se ha encontrado los datos del Usuario!");
        }
        
    }
    
    public void actualizarPrestamo(){
        prestamo = prestamoVista.actualizarDatosPrestamo();
        if(prestamoDAO.actualizarPrestamo(prestamo.getId(), prestamo) == true){
            prestamoVista.mostrarAlertas("Prestamo actualizado correctamente!");                    
        }else{
            prestamoVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void eliminarPrestamo(){
        int id = prestamoVista.eliminarDatosPrestamo();
        if(prestamoDAO.eliminarPrestamo(id) == true){
            prestamoVista.mostrarAlertas("Prestamo eliminado correctamente!");                    
        }else{
            prestamoVista.mostrarAlertas("Ha ocurrido un error!");
        }
    }
    
    public void buscarPrestamoPorId(){
        int id = prestamoVista.buscarDatosPrestamo();
        prestamo = prestamoDAO.obtenerPrestamo(id);
        if(prestamo == null){
            prestamoVista.mostrarAlertas("Prestamo no encontrado");
        }else{
            prestamoVista.mostrarInformacionPrestamo(prestamo);
        }
    }
    
    public void listarPrestamos(){
        List<Prestamo> listaPrestamos = prestamoDAO.obtenerPrestamo();
        for (Prestamo prestamo : listaPrestamos) {
            prestamoVista.mostrarInformacionPrestamo(prestamo);
        }
    }
}
