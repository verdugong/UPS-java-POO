/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.principal;

import ec.edu.ups.clases.Tienda;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("====== TIENDA E-COMMERCE ======");
            System.out.println("=====    BIENVENIDO/A     =====");
            System.out.println("1. REGISTRARSE ");
            System.out.println("2. AGREGAR PRODUCTOS AL CARRITO ");
            System.out.println("3. BUSCAR PRODUCTO ");
            System.out.println("4. REALIZAR PEDIDO ");
            System.out.println("5. SALIR ");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Realiza acciones para la Opción 1
                    tienda.registrarUsuario();
                    
                    break;
                case 2:
                    // Realiza acciones para la Opción 2
                    tienda.agregarProductos();
                    break;
                case 3:
                    // Realiza acciones para la Opción 2
                    tienda.buscarProducto();
                    break;
                case 4:
                    // Realiza acciones para la Opción 2
                    tienda.realizarPedido();
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
}
