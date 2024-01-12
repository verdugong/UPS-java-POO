/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.idao;

import ec.edu.ups.poo.ejemplouiapp.modelo.Usuario;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IUsuarioDAO {
    List<Usuario> listaUsuario();
    Usuario obtenerUsuario(String id);
    void crearUsuario(Usuario usuario);
    void actualizarUsuario(String id, Usuario usuario);
    void eliminarUsuario(String id);
}
