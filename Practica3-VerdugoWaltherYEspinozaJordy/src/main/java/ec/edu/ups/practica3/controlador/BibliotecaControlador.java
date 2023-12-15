/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.controlador;

import ec.edu.ups.practica3.idao.IBibliotecaDAO;
import ec.edu.ups.practica3.modelo.Biblioteca;
import ec.edu.ups.practica3.vista.BibliotecaVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class BibliotecaControlador {
    private IBibliotecaDAO bibliotecaDAO;
    private BibliotecaVista bibliotecaVista;
    private Biblioteca biblioteca;

    public BibliotecaControlador(IBibliotecaDAO bibliotecaDAO, BibliotecaVista bibliotecaVista) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.bibliotecaVista = bibliotecaVista;
    }
    
    public void crearBiblioteca(){
        biblioteca = bibliotecaVista.ingresarDatosBiblioteca();
        bibliotecaDAO.crearBiblioteca(biblioteca);
    }
    
    public void actualizarBiblioteca(){
        biblioteca = bibliotecaVista.actualizarDatosBiblioteca();
        if(bibliotecaDAO.actualizarBiblioteca(biblioteca.getId(), biblioteca) == true){
            bibliotecaVista.mostrarAlertas("Biblioteca actualizada correctamente!");                    
        }else{
            bibliotecaVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void eliminarBiblioteca(){
        int id = bibliotecaVista.eliminarDatosBiblioteca();
        if(bibliotecaDAO.eliminarBiblioteca(id) == true){
            bibliotecaVista.mostrarAlertas("Biblioteca eliminado correctamente!");                    
        }else{
            bibliotecaVista.mostrarAlertas("Ha ocurrido un error!");
        }
    }
    
    public void buscarBibliotecaPorId(){
        int id = bibliotecaVista.buscarDatosBiblioteca();
        biblioteca = bibliotecaDAO.obtenerBiblioteca(id);
        if(biblioteca == null){
            bibliotecaVista.mostrarAlertas("Biblioteca no encontrada");                    
        }else{
            bibliotecaVista.mostrarInformacionBiblioteca(biblioteca.getId(), biblioteca.getNombre(), biblioteca.getDireccion(), biblioteca.getListaLibros(), biblioteca.getListaUsuarios());
        }
    }
    
    public void listarBibliotecas(){
        List<Biblioteca> listaBibliotecas = bibliotecaDAO.obtenerBiblioteca();
        for (Biblioteca biblioteca : listaBibliotecas) {
            bibliotecaVista.mostrarInformacionBiblioteca(biblioteca.getId(),biblioteca.getNombre(), biblioteca.getDireccion(), biblioteca.getListaLibros(), biblioteca.getListaUsuarios());
        }
    }
}
