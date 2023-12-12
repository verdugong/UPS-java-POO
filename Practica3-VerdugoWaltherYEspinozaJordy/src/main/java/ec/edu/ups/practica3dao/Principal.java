/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica3dao;

import ec.edu.ups.practica3.modelo.Biblioteca;
import ec.edu.ups.practica3.modelo.Libro;
import ec.edu.ups.practica3.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "123 Calle Principal");
        Usuario usuario1 = new Usuario();
        Libro libro1 = new Libro();

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("====== BIBLIOTECA ======");
            System.out.println(biblioteca.toString());
            System.out.println("===== BIENVENIDO/A =====");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Registrar Usuario");
            System.out.println("3. Buscar Libro");
            System.out.println("4. Prestar Libro");
            System.out.println("5. Devolver Libro");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Realiza acciones para la Opción 1
                    biblioteca.agregarLibro(libro1);
                    break;
                case 2:
                    // Realiza acciones para la Opción 2
                    biblioteca.registrarUsuario(usuario1);
                    break;
                case 3:
                    // Realiza acciones para la Opción 2
                    String tituloBusc = null;
                    biblioteca.buscarLibroPorTitulo(tituloBusc);
                    break;
                case 4:
                    // Realiza acciones para la Opción 2
                    libro1.prestar();
                    biblioteca.prestarLibro(libro1, usuario1);
                    break;
                case 5:
                    // Realiza acciones para la Opción 2w
                    libro1.devolver(libro1);
                    usuario1.devolverLibro();
                    break;
                case 6:
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
    
}
