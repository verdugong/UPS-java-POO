/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import ec.edu.ups.practica3.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class UsuarioVista {
    private Scanner entrada;

    public UsuarioVista() {
        entrada = new Scanner(System.in);
    }
    
    public Usuario ingresarDatosUsuario(){
        System.out.println("------Ingreso de Nuevo Usuario------");
        System.out.println("Ingresa el id del usuario");
        String id = entrada.next();
        System.out.println("Ingresa el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("Ingresa el correo del usuario");
        String correo = entrada.next();
        
        return new Usuario(correo, nombre,id);
    }
    
    public Usuario actualizarDatosUsuario(){
        System.out.println("------Actualizar Usuario------");
        System.out.println("Ingresa el id del usuario");
        String id = entrada.next();
        System.out.println("Ingresa el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("Ingresa el correo del usuario");
        String correo = entrada.next();
        
        return new Usuario(correo, nombre,id);
    }
    
    public String eliminarDatosUsuario(){
        System.out.println("------Eliminar Usuario------");
        System.out.println("Ingresa el id del Usuario a eliminar");
        String id = entrada.next();
        return id;
    }
    
    public String buscarDatosUsuario(){
        System.out.println("------Buscar Usuario------");
        System.out.println("Ingresa el id del Usuario a buscar");
        String id = entrada.next();
        return id;
    }        
    
    public void mostrarInformacionUsuario(String correo, String nombre, String identificacion){
        System.out.println("Datos del Usuario: \n" + correo + " - " + nombre + " - " + identificacion);
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
