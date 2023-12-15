/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import ec.edu.ups.practica3.modelo.Libro;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class LibroVista {
    private Scanner entrada;

    public LibroVista() {
        entrada = new Scanner(System.in);
    }
    
    public Libro ingresarDatosLibro(){
        System.out.println("------Ingreso de Nuevo Libro------");
        System.out.println("Ingresa el codigo del libro");
        int codigo = entrada.nextInt();
        System.out.println("Ingresa el titulo del libro");
        String titulo = entrada.next();
        System.out.println("Ingresa el autor del libro");
        String autor = entrada.next();
        System.out.println("Ingresa el año de publicacion del libro");
        int anio = entrada.nextInt();
        System.out.println("Ingresa el precio del libro");
        double precio = entrada.nextDouble();
        
        return new Libro(titulo,autor,anio,codigo,precio);
    }
    
    public Libro actualizarDatosLibro(){
        System.out.println("------Actualizar Libro------");
        System.out.println("Ingresa el codigo del libro a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingresa el titulo del libro a actualizar");
        String titulo = entrada.next();
        System.out.println("Ingresa el autor del libro a actualizar");
        String autor = entrada.next();
        System.out.println("Ingresa el año de publicacion del libro a actualizar");
        int anio = entrada.nextInt();
        System.out.println("Ingresa el precio del libro");
        double precio = entrada.nextDouble();
        
        return new Libro(titulo,autor,anio,codigo,precio);
    }
    
    public int eliminarDatosLibro(){
        System.out.println("------Eliminar Libro------");
        System.out.println("Ingresa el codigo del libro a eliminar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public int buscarDatosLibro(){
        System.out.println("------Buscar Libro------");
        System.out.println("Ingresa el codigo del libro a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }        
    
    public void mostrarInformacionLibro(String titulo, String autor, int anio, int codigo, double precio, boolean disponible){
        System.out.println("Datos del Libro: \n" + titulo + " - " + autor + " - " + anio + " - " + codigo + " - " + precio + " - " + disponible);
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
