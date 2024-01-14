/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.dao;

import ec.edu.ups.poo.ejemplouiapp.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.ejemploguiapp.idao.IBibliotecaDAO;

/**
 *
 * @author sebas
 */
public class BibliotecaDAO implements IBibliotecaDAO {
    
    private List<Biblioteca> bibliotecas;

    public BibliotecaDAO() {
        bibliotecas = new ArrayList<>();

    }
    
    @Override
    public void crearBiblioteca(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca obtenerBiblioteca(int codigo) {
        for(Biblioteca biblioteca : bibliotecas){
            if(biblioteca.getCodigo() == codigo){
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void actualizarBiblioteca(int codigo, Biblioteca biblioteca) {
        for (int i = 0; 1 < bibliotecas.size(); i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if(bibliotecaBuscada.getCodigo() == codigo){
                bibliotecas.set(i, biblioteca);
                break;
            }
        }
    }

    @Override
    public void eliminarBiblioteca(int codigo) {
        for (int i = 0; 1 < bibliotecas.size(); i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if(bibliotecaBuscada.getCodigo() == codigo){
                bibliotecas.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Biblioteca> listarBiblioteca() {
        return bibliotecas;
    }
    
}
