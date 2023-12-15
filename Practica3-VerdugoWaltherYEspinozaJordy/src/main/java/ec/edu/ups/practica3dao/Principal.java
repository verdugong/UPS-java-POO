/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica3dao;

import ec.edu.ups.practica3.controlador.BibliotecaControlador;
import ec.edu.ups.practica3.controlador.LibroControlador;
import ec.edu.ups.practica3.controlador.PrestamoControlador;
import ec.edu.ups.practica3.controlador.UsuarioControlador;
import ec.edu.ups.practica3.dao.BibliotecaDAO;
import ec.edu.ups.practica3.dao.LibroDAO;
import ec.edu.ups.practica3.dao.PrestamoDAO;
import ec.edu.ups.practica3.dao.UsuarioDAO;
import ec.edu.ups.practica3.idao.IBibliotecaDAO;
import ec.edu.ups.practica3.idao.ILibroDAO;
import ec.edu.ups.practica3.idao.IPrestamoDAO;
import ec.edu.ups.practica3.idao.IUsuarioDAO;
import ec.edu.ups.practica3.modelo.Usuario;
import ec.edu.ups.practica3.vista.BibliotecaVista;
import ec.edu.ups.practica3.vista.LibroVista;
import ec.edu.ups.practica3.vista.PrestamoVista;
import ec.edu.ups.practica3.vista.UsuarioVista;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       IBibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
       BibliotecaVista bibliotecaVista = new BibliotecaVista();
       IUsuarioDAO usuarioDAO = new UsuarioDAO();
       UsuarioVista usuarioVista = new UsuarioVista();
       ILibroDAO libroDAO = new LibroDAO();
       LibroVista libroVista = new LibroVista();
       IPrestamoDAO prestamoDAO = new PrestamoDAO();
       PrestamoVista prestamoVista = new PrestamoVista();
       
        BibliotecaControlador controladorBiblioteca = new BibliotecaControlador(bibliotecaDAO,bibliotecaVista);
        UsuarioControlador controladorUsuario = new UsuarioControlador(usuarioDAO,usuarioVista);
        LibroControlador controladorLibro = new LibroControlador(libroDAO,libroVista);
        PrestamoControlador controladorPrestamo = new PrestamoControlador(prestamoDAO,prestamoVista,libroDAO,libroVista,usuarioDAO,usuarioVista);
        
        Usuario usuario = new Usuario();

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("= PROGRAMA DE REGISTRO =");
            //System.out.println(biblioteca.toString());
            System.out.println("===== BIENVENIDO/A =====");
            System.out.println("1. Biblioteca");
            System.out.println("2. Usuario");
            System.out.println("3. Libro");
            System.out.println("4. Prestamo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcionSubMenu1 = 0;
                    while (opcionSubMenu1 != 6) {
                        mostrarSubMenu1();
                        System.out.print("Selecciona una opción: ");
                        opcionSubMenu1 = scanner.nextInt();
                        switch (opcionSubMenu1) {
                        case 1:
                            controladorBiblioteca.crearBiblioteca();
                            controladorBiblioteca.listarBibliotecas();
                            break;
                        case 2:
                            controladorBiblioteca.buscarBibliotecaPorId();
                            break;
                        case 3:
                            controladorBiblioteca.actualizarBiblioteca();
                            controladorBiblioteca.listarBibliotecas();
                            break;
                        case 4:
                            controladorBiblioteca.eliminarBiblioteca();
                            controladorBiblioteca.listarBibliotecas();
                            break;
                        case 5:
                            opcionSubMenu1 = 6;
                            break;       
                        case 6:
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                        }
                    }
                    break;
                
                case 2:
                    int opcionSubMenu2 = 0;
                    while (opcionSubMenu2 != 6) {
                        mostrarSubMenu2();
                        System.out.print("Selecciona una opción: ");
                        opcionSubMenu2 = scanner.nextInt();
                        switch (opcionSubMenu2) {
                        case 1:
                            controladorUsuario.crearUsuario();
                            controladorUsuario.listarUsuarios();
                            break;
                        case 2:
                            usuario.mostrarInformacion();
                            controladorUsuario.buscarUsuarioPorId();
                            break;
                        case 3:
                            controladorUsuario.actualizarUsuario();
                            controladorUsuario.listarUsuarios();
                            break;
                        case 4:
                            controladorUsuario.eliminarUsuario();
                            controladorUsuario.listarUsuarios();
                            break;
                        case 5:
                            opcionSubMenu2 = 6;
                            break;   
                        case 6:
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                        }
                    }
                    break;
                
                case 3:
                    int opcionSubMenu3 = 0;
                    while (opcionSubMenu3 != 6) {
                        mostrarSubMenu3();
                        System.out.print("Selecciona una opción: ");
                        opcionSubMenu3 = scanner.nextInt();
                        switch (opcionSubMenu3) {
                        case 1:
                            controladorLibro.crearLibro();
                            controladorLibro.listarLibros();
                            break;
                        case 2:
                            controladorLibro.buscarLibroPorId();
                            break;
                        case 3:
                            controladorLibro.actualizarLibro();
                            controladorLibro.listarLibros();
                            break;
                        case 4:
                            controladorLibro.eliminarLibro();
                            controladorLibro.listarLibros();
                            break;
                        case 5:
                            opcionSubMenu3 = 6;
                            break;
                            
                        case 6:
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                        }
                    }
                    break;
                
                case 4:
                    int opcionSubMenu4 = 0;
                    while (opcionSubMenu4 != 6) {
                        mostrarSubMenu4();
                        System.out.print("Selecciona una opción: ");
                        opcionSubMenu4 = scanner.nextInt();
                        
                        switch (opcionSubMenu4) {
                        case 1:
                            controladorPrestamo.crearPrestamo();
                            controladorPrestamo.listarPrestamos();
                            break;
                        case 2:
                            controladorPrestamo.buscarPrestamoPorId();
                            break;
                        case 3:
                            controladorPrestamo.actualizarPrestamo();
                            controladorPrestamo.listarPrestamos();
                            break;
                        case 4:
                            controladorPrestamo.eliminarPrestamo();
                            controladorPrestamo.listarPrestamos();
                            break;
                        case 5:
                            opcionSubMenu4 = 6;
                            break;
                        case 6:
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                        }
                    }
                    break;
                    
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa.");

                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        }

        scanner.close();
    } 
    
    public static void mostrarSubMenu1() {
        System.out.println("Biblioteca");
        System.out.println("1. Agregar Biblioteca");
        System.out.println("2. Buscar Biblioteca");
        System.out.println("3. Actualizar Bilioteca");
        System.out.println("4. Borrar Biblioteca");
        System.out.println("5. Volver al Menú Principal");
        System.out.println("6. Salir");
    }

    public static void mostrarSubMenu2() {
        System.out.println("Usuario");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Buscar Usuario");
        System.out.println("3. Actualizar Usuario");
        System.out.println("4. Borrar Usuario");
        System.out.println("5. Volver al Menú Principal");
        System.out.println("6. Salir");
    }
    
    public static void mostrarSubMenu3() {
        System.out.println("Libro");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Buscar Libro");
        System.out.println("3. Actualizar Libro");
        System.out.println("4. Borrar Libro");
        System.out.println("5. Volver al Menú Principal");
        System.out.println("6. Salir");
    }
    
    public static void mostrarSubMenu4() {
        System.out.println("Prestamo");
        System.out.println("1. Agregar Prestamo");
        System.out.println("2. Listar Prestamo");
        System.out.println("3. Actualizar Prestamo");
        System.out.println("4. Borrar Prestamo");
        System.out.println("5. Volver al Menú Principal");
        System.out.println("6. Salir");
    }
}
