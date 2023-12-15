/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import ec.edu.ups.practica3.modelo.Biblioteca;
import ec.edu.ups.practica3.modelo.Prestamo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PrestamoVista {
    private Scanner entrada;
    private Biblioteca biblioteca;

    public PrestamoVista() {
        entrada = new Scanner(System.in);
        this.biblioteca = biblioteca;
    }
    
    
    public Prestamo ingresarDatosPrestamo(){
        System.out.println("------Ingreso de Nuevo Prestamo------");
        System.out.println("Ingresa el id del prestamo");
        int id = entrada.nextInt();
        System.out.println("¿Deseas ingresar una nueva fecha? (s/n)");
        String respuesta = entrada.next();
        Date fechaPrestamo;
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPrestamo = new Date(anio, (mes-1), dia);            
        }else{
            fechaPrestamo = new Date();
        }
        return new Prestamo(id, fechaPrestamo);
    }                      
    
    public Prestamo actualizarDatosPrestamo(){
        System.out.println("------Actualizar Prestamo------");
        System.out.println("Ingresa el id del prestamo a actualizar");
        int id = entrada.nextInt();
        System.out.println("¿Deseas ingresar una nueva fecha? (s/n)");
        String respuesta = entrada.next();
        Date fechaPrestamo;
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Ingresa el dia: ");
            int dia = entrada.nextInt();
            System.out.println("Ingresa el mes: ");
            int mes = entrada.nextInt();
            System.out.println("Ingresa el año: ");
            int anio = entrada.nextInt();
            fechaPrestamo = new Date(anio, (mes-1), dia);            
        }else{
            fechaPrestamo = new Date();
        }
        
        return new Prestamo(id, fechaPrestamo);
    }
    
    public int eliminarDatosPrestamo(){
        System.out.println("------Eliminar Prestamo------");
        System.out.println("Ingresa el id del prestamo a eliminar");
        int id = entrada.nextInt();
        return id;
    }
    
    public int buscarDatosPrestamo(){
        System.out.println("------Buscar Prestamo------");
        System.out.println("Ingresa el id del prestamo a buscar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public int agregarProductosAPrestamo(){
        System.out.println("------Agregar Productos al Prestamo------");
        System.out.println("Ingresa número de Productos a agregar");
        int id = entrada.nextInt();
        return id;
    }        
    
    public void mostrarInformacionPrestamo(Prestamo prestamo){
        System.out.println(prestamo.toString());
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
}
