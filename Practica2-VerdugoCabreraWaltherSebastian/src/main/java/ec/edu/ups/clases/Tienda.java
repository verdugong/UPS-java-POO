/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Tienda {
    Scanner scanner = new Scanner(System.in); // objeto que lee la entrada
    Usuario usuario = new Usuario();
    Carrito carrito = new Carrito(false, 0);
    
    public void registrarUsuario(){
        String name, address;
        int iD;
        System.out.println("Bienvenido/a Sr/rita. Usuario! Este es su espacio para registrarse: ");
        System.out.println("Por favor registre su nombre: ");
        name = scanner.nextLine();
        usuario.setNombre(name);
        
        System.out.println("Por favor registre su identificacion: ");
        iD = scanner.nextInt();
        usuario.setId(iD);
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Por favor registre su direccion: ");
        address = scanner.nextLine();
        usuario.setDireccion(address);
        scanner.nextLine(); // Consumir el salto de línea
        
        // Incrementar el contador de carritos
        usuario.incrementarNumCarritos();
        
        System.out.println("REGISTRO COMPLETADO!");
        System.out.println("La informacion registrada es la siguiente: ");
        System.out.println(usuario.toString());
    }
    
    public void agregarProductos(){
        System.out.println("Este es el espacio para agregar productos a su carrito. A continuacion agreguelos ");
        while (true) {
            System.out.print("Ingrese el tipo de producto (ropa/electronicos/fin para salir): ");
            String tipoProducto = scanner.nextLine();

            // Verificar si el usuario desea salir
            if (tipoProducto.equalsIgnoreCase("fin")) {
                break;
            }

            if (tipoProducto.equalsIgnoreCase("ropa")) {
                System.out.print("Ingrese la talla de la ropa: ");
                String talla = scanner.nextLine();
                System.out.print("Ingrese el nombre de la ropa: ");
                String nombreRopa = scanner.nextLine();
                System.out.print("Ingrese el código de la ropa: ");
                int codigoRopa = scanner.nextInt();
                System.out.print("Ingrese el precio de la ropa(ingresar los centavos después de una coma): ");
                double precioRopa = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer después de leer el precio

                // Crear una instancia de la clase Ropa y agregarla al carrito
                Ropa ropa = new Ropa(talla, nombreRopa, codigoRopa, "ropa", precioRopa);
                carrito.agregarProducto(ropa);
            } else if (tipoProducto.equalsIgnoreCase("electronicos")) {
                System.out.print("¿Es inalámbrico? (true/false): ");
                boolean esInalambrico = scanner.nextBoolean();
                System.out.print("Ingrese el nombre del producto electrónico: ");
                String nombreElectronico = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Ingrese el código del producto electrónico: ");
                int codigoElectronico = scanner.nextInt();
                System.out.print("Ingrese el precio del producto electrónico(ingresar los centavos después de una coma): ");
                double precioElectronico = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer después de leer el precio

                // Crear una instancia de la clase Electronicos y agregarla al carrito
                Electronicos electronicos = new Electronicos(esInalambrico, nombreElectronico, codigoElectronico, "electronicos", precioElectronico);
                carrito.agregarProducto(electronicos);
            } else {
                System.out.println("Tipo de producto no válido. Intente nuevamente.");
            }
        }
        
        System.out.println("Desea usar un carrito ESPECIAL (Podrá comprar más productos). Ingrese SÍ O NO: ");
        String special = scanner.next().toLowerCase();
        scanner.nextLine();
        
        boolean valorBooleano = false;
        if (special.equals("si")) {
            valorBooleano = true;
            System.out.println("Usted a seleccionado " + valorBooleano + " , se agrandará el tamaño de su carrito. ");
        } else if (special.equals("no")) {
            valorBooleano = false;
            System.out.println("Usted a seleccionado " + valorBooleano + " , no se agrandará el tamaño de su carrito. ");
        } else {
            System.out.println("Entrada no válida. Se esperaba 'si' o 'no'.");
        }
        
        carrito.setEsEspecial(valorBooleano);
        
        // Calcular el número de productos en el carrito
        int numProductos = carrito.getProductos().size();
        carrito.setNumProductos(numProductos);

        // Mostrar información del carrito
        System.out.println("Información del Carrito:");
        System.out.println(carrito.toString());
        
        // Mostrar el número de productos en el carrito
        //System.out.println("Número de productos en el carrito: " + carrito.getProductos().size());
        
    }
    
    public void realizarPedido(){
        System.out.println("Este es el espacio para mostrar su pedido de los productos agregados al carrito. \n");
        System.out.println("Ingrese su método de pago: ");
        String metodo = scanner.nextLine();
        Pedido pedido = new Pedido(usuario, carrito, metodo);
        pedido.datosPedido();
    }
    
    public void buscarProducto() {
    System.out.print("Ingrese el código del producto a buscar: ");
    int codigoBuscar = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    boolean encontrado = false;

    for (Producto producto : carrito.getProductos()) {
        if (producto.getCodigo() == codigoBuscar) {
            encontrado = true;
            System.out.println("Producto encontrado: \n" + producto.toString());
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontró un producto con el código ingresado.");
        }
    }
}
