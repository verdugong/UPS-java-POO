/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> listaLibros = new ArrayList<>(); 
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    Scanner scanner = new Scanner(System.in);

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Biblioteca(ArrayList<Libro> listaLibros, ArrayList<Usuario> listaUsuarios) {
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;
    }

    public Biblioteca(String nombre, String direccion, ArrayList<Libro> listaLibros, ArrayList<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaLibros=" + listaLibros + ", listaUsuarios=" + listaUsuarios + '}';
    }

    public void agregarLibro(Libro libro){
        String title, writer;
        int year, code;
        boolean estaDisponible = true;
        
        System.out.println("Este es el espacio para agregar un libro a la biblioteca. A continuacion agreguelos ");
        System.out.println("Por favor ingrese el titulo del libro: ");
        title = scanner.nextLine();
        libro.setTitulo(title);
        
        System.out.println("Por favor el autor del libro: ");
        writer = scanner.nextLine();
        libro.setAutor(writer);
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Por favor ingrese el año de publicacion: ");
        year = scanner.nextInt();
        libro.setAnio(year);
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Por favor ingrese un codigo para el libro: ");
        code = scanner.nextInt();
        libro.setCodigo(code);
        scanner.nextLine(); // Consumir el salto de línea
        
        libro.setDisponible(estaDisponible); // Establecer el libro como disponible

        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado a la biblioteca y está disponible.");
        // Agregar el libro a la lista de libros de la biblioteca
        listaLibros.add(libro);
        
        System.out.println("REGISTRO COMPLETADO!");
        System.out.println("La informacion registrada es la siguiente: ");
        System.out.println(libro.toString());
        
    }
    
    public void registrarUsuario(Usuario usuario){
        String name, iD, mail;

        System.out.println("Bienvenido/a Sr/rita. Usuario! Este es su espacio para registrarse: ");
        System.out.println("Por favor registre su nombre: ");
        name = scanner.nextLine();
        usuario.setNombre(name);
        
        System.out.println("Por favor registre su identificacion: ");
        iD = scanner.nextLine();
        usuario.setIdentificacion(iD);
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Por favor registre su correo: ");
        mail = scanner.nextLine();
        usuario.setCorreo(mail);
        scanner.nextLine(); // Consumir el salto de línea
        
        // Incrementar el contador de carritos
        usuario.incrementarNumPrestamos();
        listaUsuarios.add(usuario);
        
        System.out.println("REGISTRO COMPLETADO!");
        System.out.println("La informacion registrada es la siguiente: ");
        System.out.println(usuario.toString());
    }
    
    public void buscarLibroPorTitulo(String tituloBuscado) {
        
        System.out.println("Este es el espacio para buscar un libro de la biblioteca.");
        System.out.println("Por favor ingrese el titulo del libro a buscar: ");
        tituloBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                System.out.println("Libro encontrado: " + libro.toString());
                encontrado = true;
                break; // Terminar el bucle si se encuentra el libro
            }
        }

        if (!encontrado) {
            System.out.println("El libro no se encuentra en la biblioteca.");
        }
    }
    
    public void prestarLibro(Libro libro, Usuario usuario) {
        // Mostrar los libros disponibles para préstamo
        System.out.println("Libros disponibles para préstamo:");
        for (Libro l : listaLibros) {
            if (l.isDisponible()) {
                System.out.println("- " + l.getTitulo());
            }
        }

        // Pedir al usuario el título del libro que desea llevarse
        System.out.println("Ingrese el título del libro que desea llevarse: ");
        String tituloDeseado = scanner.nextLine();

        // Buscar el libro por su título en la lista de libros
        Libro libroSeleccionado = null;
        Usuario usuarioNuevo = null;
        for (Libro l : listaLibros) {
            if (l.getTitulo().equalsIgnoreCase(tituloDeseado)) {
                libroSeleccionado = l;
                break;
            }
        }

        // Verificar si se encontró el libro
        if (libroSeleccionado != null) {
            // Verificar si el libro seleccionado está disponible
            if (libroSeleccionado.isDisponible()) {
                // Solicitar fechas de préstamo y devolución al usuario
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaPrestamoUno = null;
                Date fechaDevolucionUno = null;
                try {
                    System.out.println("Ingrese la fecha de préstamo (dd/MM/yyyy): ");
                    String inputFechaPrestamo = scanner.nextLine();
                    fechaPrestamoUno = dateFormat.parse(inputFechaPrestamo);

                    System.out.println("Ingrese la fecha de devolución (dd/MM/yyyy): ");
                    String inputFechaDevolucion = scanner.nextLine();
                    fechaDevolucionUno = dateFormat.parse(inputFechaDevolucion);
                } catch (ParseException e) {
                    System.out.println("Error al ingresar la fecha. Por favor, ingrese una fecha válida en formato dd/MM/yyyy.");
                    return;
                }

                // Crear el nuevo préstamo con las fechas ingresadas
                Prestamo nuevoPrestamo = new Prestamo(libroSeleccionado, usuarioNuevo, fechaPrestamoUno, fechaDevolucionUno);

                // Agregar el libro a la lista de libros prestados del usuario
                usuario.solicitarPrestamo(nuevoPrestamo);
                

                // Marcar el libro como no disponible
                libroSeleccionado.setDisponible(false);

                // Mostrar mensaje de préstamo exitoso
                System.out.println("¡Libro prestado con éxito a " + usuario.getNombre() + "!");

                // Mostrar información del préstamo realizado
                System.out.println("Información del préstamo:");
                System.out.println(nuevoPrestamo.toString());
            } else {
                System.out.println("El libro seleccionado no está disponible para préstamo.");
            }
        } else {
            System.out.println("El libro no se encuentra en la biblioteca.");
        }
    }
}
