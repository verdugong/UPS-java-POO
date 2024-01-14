/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.idao;

import ec.edu.ups.poo.ejemplouiapp.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IBibliotecaDAO {
    void crearBiblioteca(Biblioteca biblioteca);
    Biblioteca obtenerBiblioteca(int codigo);
    void actualizarBiblioteca(int codigo, Biblioteca biblioteca);
    void eliminarBiblioteca(int codigo);
    List<Biblioteca> listarBiblioteca();
}
