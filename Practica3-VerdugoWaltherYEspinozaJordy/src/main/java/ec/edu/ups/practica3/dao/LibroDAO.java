/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.dao;

import ec.edu.ups.practica3.idao.ILibroDAO;
import ec.edu.ups.practica3.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class LibroDAO implements ILibroDAO{
    private List<Libro> listaLibros;

    public LibroDAO() {
        listaLibros = new ArrayList<>();
    }

    @Override
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    @Override
    public Libro obtenerLibro(int id) {
        for (Libro libro : listaLibros) {
            if(libro.getCodigo() == id){
                return libro;
            }
        }
        return null;
    }

    @Override
    public void crearLibro(Libro libro) {
        listaLibros.add(libro);
    }

    @Override
    public boolean actualizarLibro(int id, Libro libro) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libroEncontrado = listaLibros.get(i);
            if(libroEncontrado.getCodigo() == id){
                listaLibros.set(i, libro);
                return true;
            }
            
        }
        return false;
    }

    @Override
    public boolean eliminarLibro(int id) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libroEncontrado = listaLibros.get(i);
            if(libroEncontrado.getCodigo() == id){
                listaLibros.remove(i);
                return true;
            }
            
        }
        return false;
    }
}
