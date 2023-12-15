/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.controlador;

import ec.edu.ups.practica3.idao.ILibroDAO;
import ec.edu.ups.practica3.modelo.Libro;
import ec.edu.ups.practica3.vista.LibroVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class LibroControlador {
  private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;

    public LibroControlador(ILibroDAO libroDAO, LibroVista libroVista) {
        this.libroDAO = libroDAO;
        this.libroVista = libroVista;
    }

    public void crearLibro(){
        libro = libroVista.ingresarDatosLibro();
        libroDAO.crearLibro(libro);
    }
    
    public void actualizarLibro(){
        libro = libroVista.actualizarDatosLibro();
        if(libroDAO.actualizarLibro(libro.getCodigo(), libro) == true){
            libroVista.mostrarAlertas("Libro actualizado correctamente!");                    
        }else{
            libroVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void eliminarLibro(){
        int id = libroVista.eliminarDatosLibro();
        if(libroDAO.eliminarLibro(id) == true){
            libroVista.mostrarAlertas("Libro eliminado correctamente!");                    
        }else{
            libroVista.mostrarAlertas("Ha ocurrido un error!");
        }
    }
    
    public void buscarLibroPorId(){
        int id = libroVista.buscarDatosLibro();
        libro = libroDAO.obtenerLibro(id);
        if(libro == null){
            libroVista.mostrarAlertas("Libro no encontrado");
        }else{
            libroVista.mostrarInformacionLibro(libro.getTitulo(), libro.getAutor(), libro.getAnio(), libro.getCodigo(), libro.getPrecio(),true);
        }
    }
    
    public void listarLibros(){
        List<Libro> listaLibros = libroDAO.obtenerLibros();
        for (Libro libro : listaLibros) {
            libroVista.mostrarInformacionLibro(libro.getTitulo(), libro.getAutor(), libro.getAnio(), libro.getCodigo(), libro.getPrecio(),true);
        }
    }  
}
