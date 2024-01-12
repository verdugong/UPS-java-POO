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
    void create(Biblioteca biblioteca);
    Biblioteca read(int codigo);
    void update(int codigo, Biblioteca biblioteca);
    void delete(int codigo);
    List<Biblioteca> list();
}
