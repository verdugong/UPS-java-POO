/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica1;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Registro {
    Scanner scanner = new Scanner(System.in); // objeto que lee la entrada
    Estudiante estudiante = new Estudiante();
    Profesor profesor = new Profesor();
    Asignatura asignatura = new Asignatura();
    
    public void registrarEstudiante(){
        
        String name, history;
        int age, iD;
        
        System.out.println("Bienvenido/a Sr/rita. Estudiante! Este es su espacio para registrarse: ");
        System.out.println("Por favor registre su nombre: ");
        name = scanner.nextLine();
        estudiante.setNombre(name);
        
        System.out.println("Por favor registre su edad: ");
        age = scanner.nextInt();
        estudiante.setEdad(age);
        
        System.out.println("Por favor registre su identificacion: ");
        iD = scanner.nextInt();
        estudiante.setId(iD);
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Este es el espacio para registrar su historia");
        System.out.println("Por favor ingresela a continuación: ");
        history = scanner.nextLine();
        estudiante.setHistoria(history);
        
        System.out.println("REGISTRO COMPLETADO!");
        System.out.println("La informacion registrada es la siguiente: ");
        System.out.println(estudiante.toString());
    }
    
    public void registrarProfesor(){
        
        String name, conocimiento, especialidad;
        int age;
        
        System.out.println("Bienvenido/a Sr/rita. Profesor/a! Este es su espacio para registrarse: ");
        System.out.println("Por favor registre su nombre: ");
        name = scanner.nextLine();
        profesor.setNombre(name);
        
        System.out.println("Por favor registre su edad: ");
        age = scanner.nextInt();
        profesor.setEdad(age);
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Este es el espacio para registrar sus conocimientos");
        System.out.println("Por favor ingresela a continuación: ");
        conocimiento = scanner.nextLine();
        profesor.setConocimientos(conocimiento);
        
        System.out.println("Este es el espacio para registrar su especialidad");
        System.out.println("Por favor ingresela a continuación: ");
        especialidad = scanner.nextLine();
        profesor.setEspecialidades(especialidad);
        
        System.out.println("REGISTRO COMPLETADO!");
        System.out.println("La informacion registrada es la siguiente: ");
        System.out.println(profesor.toString());
    }
    
    public void registrarAsignatura(){
        
        String name;
        int code, numHoras;
        
        System.out.println("Bienvenido/a Sr/rita. Profesor/a! Este es el espacio para registrar materias: ");
        System.out.println("Por favor registre el nombre de la materia: ");
        name = scanner.nextLine();
        asignatura.setNombre(name);
        
        System.out.println("Por favor registre el codigo de la materia: ");
        code = scanner.nextInt();
        asignatura.setCodigo(code);
        
        System.out.println("Por favor registre el numero de horas establecidad para impartir la materia: ");
        numHoras = scanner.nextInt();
        asignatura.setNumHorasDeMateria(numHoras);
        
        System.out.println("REGISTRO COMPLETADO!");
        System.out.println("La informacion registrada es la siguiente: ");
        System.out.println(asignatura.toString());
    }
        
}

