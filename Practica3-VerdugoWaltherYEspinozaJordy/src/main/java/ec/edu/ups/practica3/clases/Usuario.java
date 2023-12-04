/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Usuario extends Persona{
    private String correo;
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String correo, ArrayList<Prestamo> listaPrestamos, String nombre, String identificacion) {
        super(nombre, identificacion);
        this.correo = correo;
        this.listaPrestamos = listaPrestamos;
    }

    public Usuario(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString() + ", correo=" + correo + ", listaPrestamos=" + listaPrestamos + '}';
    }
    
    public void incrementarNumPrestamos() {
        listaPrestamos.add(new Prestamo());
    }
    
    public void solicitarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);

        prestamo.calcularDiasPrestamo();
        prestamo.esPrestamoVigente();
    }
    
    public void devolverLibro() {
        Scanner scanner = new Scanner(System.in); 

        // Mostrar los libros que tiene el usuario en préstamo
        System.out.println("Libros que tiene en préstamo:");
        for (Prestamo prestamo : listaPrestamos) {
            Libro libroPrestado = prestamo.getLibro();
            if (libroPrestado != null) {
                System.out.println("- " + libroPrestado.getTitulo());
            }
        }

        // Pedir al usuario el título del libro que desea devolver
        System.out.println("Ingrese el título del libro que desea devolver: ");
        String tituloADevolver = scanner.nextLine();

        boolean libroEncontrado = false;
        Iterator<Prestamo> iterator = listaPrestamos.iterator();

        while (iterator.hasNext()) {
            Prestamo prestamo = iterator.next();
            Libro libroPrestado = prestamo.getLibro();
            if (libroPrestado != null && libroPrestado.getTitulo().equalsIgnoreCase(tituloADevolver)) {
                iterator.remove(); // Eliminar el elemento actual del iterador de listaPrestamos
                libroPrestado.setDisponible(true);
                System.out.println("¡Libro devuelto con éxito!");
                libroEncontrado = true;
                break;
            }
        }

        // Si no se encontró el libro en los préstamos del usuario
        if (!libroEncontrado) {
            System.out.println("No tiene ese libro en préstamo.");
        }
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Información del préstamo:");
        for (Prestamo prestamo : listaPrestamos) {
            Libro libroPrestado = prestamo.getLibro();
            Usuario usuarioSolicitante = prestamo.getUsuario();

            // Mostrar información del libro prestado
            System.out.println("Detalles del libro prestado:");
            System.out.println(libroPrestado.toString());

            // Mostrar información del usuario que solicitó el préstamo
            System.out.println("Detalles del usuario que solicitó el préstamo:");
            System.out.println(usuarioSolicitante.toString());
        }
    }
    
}
