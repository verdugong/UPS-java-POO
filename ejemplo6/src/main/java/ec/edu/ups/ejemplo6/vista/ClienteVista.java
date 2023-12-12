/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemplo6.vista;

import ec.edu.ups.ejemplo6.modelo.Cliente;
import java.util.Scanner;


/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class ClienteVista {

    private Scanner entrada;
    
    public ClienteVista(){
        entrada = new Scanner(System.in);
    }
    
    public Cliente ingresarDatosCliente(){
        System.out.println("=====INGRESO NUEVO CLIENTE======");
        System.out.println("Ingresa ID del cliente: ");
        int id = entrada.nextInt();
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = entrada.next();
        System.out.println("Ingresa el apellido del cliente: ");
        String apellido = entrada.next();
        
        return new Cliente(id, nombre, apellido);
    }
    
    public Cliente actualizarDatosCliente(){
        System.out.println("=====ACTUALIZAR DATOS CLIENTE======");
        System.out.println("Ingresa ID del cliente a actualizar: ");
        int id = entrada.nextInt();
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = entrada.next();
        System.out.println("Ingresa el apellido del cliente: ");
        String apellido = entrada.next();
        
        return new Cliente(id, nombre, apellido);
    }
    
    public int eliminarCliente(){
        System.out.println("=====ELIMINAR DATOS CLIENTE======");
        System.out.println("Ingresa ID del cliente a eliminar: ");
        int id = entrada.nextInt();
        return id;
    }
    
    public int buscarCliente(){
        System.out.println("=====BUSCAR DATOS CLIENTE======");
        System.out.println("Ingresa ID del cliente a eliminar: ");
        int id = entrada.nextInt();
        return id;
    }
    
    public void mostrarInfoCliente(int id, String nombre, String apellido){
        System.out.println("Datos del cliente: \n" + id + " - " + nombre + " - " + apellido);
    }
    
    public void mostrarInfo(String mensaje){
        System.out.println(mensaje);
    }
}
