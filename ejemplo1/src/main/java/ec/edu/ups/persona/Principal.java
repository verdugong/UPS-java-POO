/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.persona;

import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto que lee la entrada
        Persona juanitoPerez = new Persona();
        String name, lastName, num;
        
        
        System.out.println("Ingrese el nombre: ");
        name = scanner.nextLine();
        juanitoPerez.setNombre(name);
        
        System.out.println("Ingrese el apellido: ");
        lastName = scanner.nextLine();
        juanitoPerez.setApellido(lastName);
        
        System.out.println("Ingrese el número de cédula: ");
        num = scanner.nextLine();
        juanitoPerez.setNumCedula(num);
        
        System.out.println(juanitoPerez.toString());
        
        /*juanitoPerez.setNombre("JUANITO");
        juanitoPerez.setApellido("PEREZ");
        juanitoPerez.setNumCedula("0302517545");*/
        
        //System.out.println("Su nombre es " + juanitoPerez.getNombre() + " " + juanitoPerez.getApellido() + " y su numero de cedula es " + juanitoPerez.getNumCedula());
        
        System.out.println("Su nombre es " + juanitoPerez.getNombre() + " " + juanitoPerez.getApellido() + " y su numero de cedula es " + juanitoPerez.getNumCedula());
        
        Persona personaDos = new Persona("0302517545","LIONEL", "MESSI");
        System.out.println(personaDos.getNumCedula());
        personaDos.setNumCedula("0301116299");
        System.out.println(personaDos.getNumCedula());
        
        System.out.println(personaDos);
        
        //Manejo de la clase Date
        
        
        
        /*Persona personaUno = new Persona();
        Persona personaDos = new Persona();
        
        juanitoPerez.nombre = "JUANITO";
        juanitoPerez.apellido = "MENDOZA";
        juanitoPerez.numCedula = "0301116299";
        
        personaUno.nombre = "SEBASTIAN";
        personaUno.apellido = "VERDUGO";
        personaUno.numCedula = "0302517545";
        
        personaDos.nombre = "OSWALDO";
        personaDos.apellido = "CABRERA";
        personaDos.numCedula = "03084756421";
        
        System.out.println(juanitoPerez.nombre);
        System.out.println(juanitoPerez.apellido);
        System.out.println(juanitoPerez.numCedula);
        
        System.out.println(personaUno.nombre);
        System.out.println(personaUno.apellido);
        System.out.println(personaUno.numCedula);
        
        System.out.println(personaDos.nombre);
        System.out.println(personaDos.apellido);
        System.out.println(personaDos.numCedula);*/
    }
}
