/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import ec.edu.ups.practica3.modelo.Biblioteca;
import ec.edu.ups.practica3.modelo.Libro;
import ec.edu.ups.practica3.modelo.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class BibliotecaVista {
    
    private Scanner entrada;

    public BibliotecaVista() {
        entrada = new Scanner(System.in);
    }
    
    public Biblioteca ingresarDatosBiblioteca(){
        System.out.println("------Ingreso de Nueva Biblioteca------");
        System.out.println("Ingresa el id de la biblioteca");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el nombre de la biblioteca");
        String nombre = entrada.next();
        entrada.nextLine();
        System.out.println("Ingresa la direccion de la biblioteca");
        String direccion = entrada.next();
        
        return new Biblioteca(id,nombre,direccion);
    }
    
    public Biblioteca actualizarDatosBiblioteca(){
        System.out.println("------Actualizar Biblioteca------");
        System.out.println("Ingresa el id de la biblioteca a actualizar");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el nombre de la biblioteca a actualizar");
        String nombre = entrada.next();
        entrada.nextLine();
        System.out.println("Ingresa la direccion de la biblioteca a actualizar");
        String direccion = entrada.next();
        
        return new Biblioteca(id,nombre,direccion);
    }
    
    public int eliminarDatosBiblioteca(){
        System.out.println("------Eliminar Biblioteca------");
        System.out.println("Ingresa el id de la biblioteca eliminar");
        int id = entrada.nextInt();
        return id;
    }
    
    public int buscarDatosBiblioteca(){
        System.out.println("------Buscar Biblioteca------");
        System.out.println("Ingresa el id de la biblioteca");
        int id = entrada.nextInt();
        return id;
    }        
    
    public void mostrarInformacionBiblioteca(int id, String nombre, String direccion, ArrayList<Libro> listaLibros, ArrayList<Usuario> listaUsuarios){
        System.out.println("Datos de la Biblioteca: \n" + id + " - "+ nombre + " - " + direccion + " - " + listaLibros + " - " + listaUsuarios);
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
