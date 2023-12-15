/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.idao;

import ec.edu.ups.practica3.modelo.Usuario;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IUsuarioDAO {
    List<Usuario> obtenerUsuario();
    Usuario obtenerUsuario(String id);
    void crearUsuario(Usuario usuario);
    boolean actualizarUsuario(String id, Usuario usuario);
    boolean eliminarUsuario(String id);
}
