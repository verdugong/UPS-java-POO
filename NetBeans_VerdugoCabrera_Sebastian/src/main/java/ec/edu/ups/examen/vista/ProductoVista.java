/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.vista;

import ec.edu.ups.examen.modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ProductoVista {
   private Scanner entrada;

    public ProductoVista() {
        entrada = new Scanner(System.in);
    }
    
    public Producto ingresarDatosProducto(){
        System.out.println("------Ingreso de Nuevo Producto------");
        System.out.println("Ingresa el id del producto");
        int id = entrada.nextInt();
        System.out.println("Ingresa el nombre del producto");
        String nombre = entrada.next();
        System.out.println("Ingresa el precio del producto");
        double precio = entrada.nextDouble();
        
        return new Producto(id, nombre,precio);
    }
    
    public Producto actualizarDatosProducto(){
        System.out.println("------Actualizar Producto------");
        System.out.println("Ingresa el id del producto a actualizar");
        int id = entrada.nextInt();
        System.out.println("Ingresa el nombre del producto a actualizar");
        String nombre = entrada.next();
        System.out.println("Ingresa el precio del producto a actualizar");
        double precio = entrada.nextDouble();
        
        return new Producto(id, nombre,precio);
    }
    
    public int buscarDatosProducto(){
        System.out.println("------Buscar Producto------");
        System.out.println("Ingresa el id del Producto a buscar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public void mostrarInformacionProducto(int idProducto, String nombre, double precio){
        System.out.println("Datos del Usuario: \n" + idProducto + " - " + nombre + " - " + precio);
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    } 
}
