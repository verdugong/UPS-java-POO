/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.clases;

/**
 *
 * @author sebas
 */
public class Libro implements Prestable{
    private String titulo;
    private String autor;
    private int anio;
    private int codigo;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio, int codigo, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", codigo=" + codigo + ", disponible=" + disponible + '}';
    }

    @Override
    public void prestar() {

        System.out.println("El método prestarLibro se realizará a continuación: ");
    }

    @Override
    public void devolver(Libro libro) {

        System.out.println("El método devolverLibro se realizará a continuación: ");
    }

    
    
}
