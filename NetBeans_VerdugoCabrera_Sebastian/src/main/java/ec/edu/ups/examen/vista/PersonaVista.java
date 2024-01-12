/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.vista;

import ec.edu.ups.examen.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PersonaVista {
    private Scanner entrada;

    public PersonaVista() {
        entrada = new Scanner(System.in);
    }
    
    public Persona ingresarDatosPersona(){
        System.out.println("------Ingreso de Nuevo Usuario------");
        System.out.println("Ingresa el id del usuario");
        int id = entrada.nextInt();
        System.out.println("Ingresa el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("Ingresa el correo del usuario");
        String correo = entrada.next();
        
        return new Persona(nombre, id, correo);
    }
    
    public Persona actualizarDatosUsuario(){
        System.out.println("------Ingreso de Nuevo Usuario------");
        System.out.println("Ingresa el id del usuario");
        int id = entrada.nextInt();
        System.out.println("Ingresa el nombre del usuario");
        String nombre = entrada.next();
        System.out.println("Ingresa el correo del usuario");
        String correo = entrada.next();
        
        return new Persona(nombre, id, correo);
    }
    
    
    public int buscarDatosPersona(){
        System.out.println("------Buscar Usuario------");
        System.out.println("Ingresa el id del Usuario a buscar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public void mostrarInformacionUsuario(String nombre, int id, String correo){
        System.out.println("Datos del Usuario: \n" + nombre + " - " + id + " - " + correo);
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
