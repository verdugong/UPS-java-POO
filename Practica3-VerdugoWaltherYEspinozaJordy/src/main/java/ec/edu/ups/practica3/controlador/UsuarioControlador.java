/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.controlador;

import ec.edu.ups.practica3.idao.IUsuarioDAO;
import ec.edu.ups.practica3.modelo.Usuario;
import ec.edu.ups.practica3.vista.UsuarioVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class UsuarioControlador {
    private IUsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Usuario usuario;

    public UsuarioControlador(IUsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
    }
    
    public void crearUsuario(){
        usuario = usuarioVista.ingresarDatosUsuario();
        usuarioDAO.crearUsuario(usuario);
    }
    
    public void actualizarUsuario(){
        usuario = usuarioVista.actualizarDatosUsuario();
        if(usuarioDAO.actualizarUsuario(usuario.getIdentificacion(), usuario) == true){
            usuarioVista.mostrarAlertas("Usuario actualizado correctamente!");                    
        }else{
            usuarioVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void eliminarUsuario(){
        String id = usuarioVista.eliminarDatosUsuario();
        if(usuarioDAO.eliminarUsuario(id) == true){
            usuarioVista.mostrarAlertas("Usuario eliminado correctamente!");                    
        }else{
            usuarioVista.mostrarAlertas("Ha ocurrido un error!");
        }
    }
    
    public void buscarUsuarioPorId(){
        String id = usuarioVista.buscarDatosUsuario();
        usuario = usuarioDAO.obtenerUsuario(id);
        if(usuario == null){
            usuarioVista.mostrarAlertas("Usuario no encontrado");                    
        }else{
            usuarioVista.mostrarInformacionUsuario(usuario.getCorreo(), usuario.getNombre(), usuario.getIdentificacion());
        }
    }
    
    public void listarUsuarios(){
        List<Usuario> listaUsuarios = usuarioDAO.obtenerUsuario();
        for (Usuario usuario : listaUsuarios) {
            usuarioVista.mostrarInformacionUsuario(usuario.getCorreo(), usuario.getNombre(), usuario.getIdentificacion());
        }
    }
}
