/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.guiapp.dao;

import ec.edu.ups.poo.guiapp.idao.ILibroDAO;
import ec.edu.ups.poo.guiapp.modelo.Libro;
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
    public void actualizarLibro(int id, Libro libro) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libroEncontrado = listaLibros.get(i);
            if(libroEncontrado.getCodigo() == id){
                listaLibros.set(i, libro);
                break;
            }
        }
    }

    @Override
    public void eliminarLibro(int id) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libroEncontrado = listaLibros.get(i);
            if(libroEncontrado.getCodigo() == id){
                listaLibros.remove(i);
                break;
            }   
        }
    }

    @Override
    public List<Libro> listaLibro() {
        return listaLibros;
    }
}
