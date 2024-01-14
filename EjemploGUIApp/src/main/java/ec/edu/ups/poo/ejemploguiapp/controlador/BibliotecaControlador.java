/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.controlador;

import ec.edu.ups.poo.ejemplouiapp.modelo.Biblioteca;
import ec.edu.ups.poo.ejemploguiapp.idao.IBibliotecaDAO;
import java.util.List;

/**
 *
 * @author sebas
 */
public class BibliotecaControlador {
    private IBibliotecaDAO bibliotecaDAO;
    private Biblioteca biblioteca;

    public BibliotecaControlador(IBibliotecaDAO bibliotecaDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
    }
    
    public void crearBiblioteca(int codigo, String nombre, String direccion, String telefono){
        biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
        bibliotecaDAO.crearBiblioteca(biblioteca);
    }
    
    public Biblioteca buscarBiblioteca(int codigo){
        biblioteca = bibliotecaDAO.obtenerBiblioteca(codigo);
        return biblioteca;
    }
    
    public void actualizarBiblioteca(int codigo, String nombre, String direccion, String telefono){
        biblioteca = bibliotecaDAO.obtenerBiblioteca(codigo);
        biblioteca.setNombre(nombre);
        biblioteca.setDireccion(direccion);
        biblioteca.setTelefono(telefono);
        bibliotecaDAO.actualizarBiblioteca(codigo, biblioteca);
    }
    
    public void eliminarBiblioteca(int codigo){
        biblioteca = bibliotecaDAO.obtenerBiblioteca(codigo);
        bibliotecaDAO.eliminarBiblioteca(biblioteca.getCodigo());
    }
    
    public List<Biblioteca> listarBiblioteca(){
        return bibliotecaDAO.listarBiblioteca();
    }
}
