/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.modelo;

import java.util.ArrayList;
import java.util.Scanner;
// l libro ebe saber a que biblioteca pertenece pues es un sistema de varias bibliotecas
/**
 *
 * @author sebas
 */
public class Biblioteca {
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Usuario> listaUsuarios;
    private Scanner scanner;
    
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        scanner = new Scanner(System.in);
        
    }

    public Biblioteca(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Biblioteca(ArrayList<Libro> listaLibros, ArrayList<Usuario> listaUsuarios) {
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;
    }

    public Biblioteca(int id, String nombre, String direccion, ArrayList<Libro> listaLibros, ArrayList<Usuario> listaUsuarios) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", listaLibros=" + listaLibros + ", listaUsuarios=" + listaUsuarios + '}';
    }
}
