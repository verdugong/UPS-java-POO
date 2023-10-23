/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica1;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registro registro = new Registro();

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("===== SISTEMA DE REGISTRO =====");
            System.out.println("=ESCUELA DE APRENDIZAJE MÁGICO=");
            System.out.println("=====    BIENVENIDO/A     =====");
            System.out.println("1. ESTUDIANTE ");
            System.out.println("2. PROFESOR ");
            System.out.println("3. ASIGNATURA ");
            System.out.println("4. SALIR");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Realiza acciones para la Opción 1
                    registro.registrarEstudiante();
                    break;
                case 2:
                    // Realiza acciones para la Opción 2
                    registro.registrarProfesor();
                    break;
                case 3:
                    // Realiza acciones para la Opción 2
                    registro.registrarAsignatura();
                    break;
                case 4:
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
