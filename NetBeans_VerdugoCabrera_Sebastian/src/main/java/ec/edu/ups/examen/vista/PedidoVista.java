/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.vista;

import ec.edu.ups.examen.modelo.Pedido;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PedidoVista {
    private Scanner entrada;

    public PedidoVista() {
        entrada = new Scanner(System.in);
    }
    
    
    public Pedido ingresarDatosPedido(){
        System.out.println("------Ingreso de Nuevo Pedido------");
        System.out.println("Ingresa el id del pedido");
        int id = entrada.nextInt();
        System.out.println("¿Deseas ingresar una nueva fecha? (s/n)");
        String respuesta = entrada.next();
        Date fechaPedido;
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPedido = new Date(anio, (mes-1), dia);            
        }else{
            fechaPedido = new Date();
        }
        System.out.println("Ingrese los detalles del pedido");
        String detalles = entrada.next();
        return new Pedido(id, fechaPedido, detalles);
    }                      
    
    public Pedido actualizarDatosPedido(){
        System.out.println("------Actualizar Pedido------");
        System.out.println("Ingresa el id del pedido a actualizar");
        int id = entrada.nextInt();
        System.out.println("¿Deseas ingresar una nueva fecha? (s/n)");
        String respuesta = entrada.next();
        Date fechaPedido;
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPedido = new Date(anio, (mes-1), dia);            
        }else{
            fechaPedido = new Date();
        }
        System.out.println("Ingrese los detalles del pedido a actualizar");
        String detalles = entrada.next();
        return new Pedido(id, fechaPedido, detalles);
    }
    
    
    public int buscarDatosPedido(){
        System.out.println("------Buscar Pedido------");
        System.out.println("Ingresa el id del pedido a buscar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public int agregarProductosAPedido(){
        System.out.println("------Agregar Productos al Prestamo------");
        System.out.println("Ingresa número de Productos a agregar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public void mostrarInformacionPedido(Pedido pedido){
        System.out.println(pedido.toString());
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
