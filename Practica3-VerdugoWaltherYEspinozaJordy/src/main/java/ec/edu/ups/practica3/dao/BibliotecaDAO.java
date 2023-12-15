/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.dao;

import ec.edu.ups.practica3.idao.IBibliotecaDAO;
import ec.edu.ups.practica3.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class BibliotecaDAO implements IBibliotecaDAO {
    private List<Biblioteca> listaBibliotecas;

    public BibliotecaDAO() {
        listaBibliotecas = new ArrayList<>();
    }
    
    @Override
    public List<Biblioteca> obtenerBiblioteca() {
        return listaBibliotecas;
    }

    @Override
    public Biblioteca obtenerBiblioteca(int id) {
        for (Biblioteca biblioteca : listaBibliotecas) {
            if(biblioteca.getId() == id){
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void crearBiblioteca(Biblioteca biblioteca) {
        listaBibliotecas.add(biblioteca);
    }

    @Override
    public boolean actualizarBiblioteca(int id, Biblioteca biblioteca) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if(bibliotecaEncontrada.getId() == id){
                listaBibliotecas.set(i, biblioteca);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarBiblioteca(int id) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if(bibliotecaEncontrada.getId() == id){
                listaBibliotecas.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
