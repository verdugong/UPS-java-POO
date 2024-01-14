/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemplouiapp.modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Prestamo {
    private int id;
    private List<Libro> libros;
    private Usuario usuario;
    private Date fechaPrestamo;
    private double total;

    public Prestamo() {
        libros = new ArrayList<>();
        fechaPrestamo = new Date();
    }

    public Prestamo(int id, Date fechaPrestamo) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        libros = new ArrayList<>();
    }

    public Prestamo(int id, List<Libro> libros, Usuario usuario, Date fechaPrestamo, double total) {
        this.id = id;
        this.libros = libros;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.total = total;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
    
    public void calcularTotal(){
        double total=0;
        for (Libro libros : libros) {
            total += libros.getPrecio();
        }
        this.setTotal(total);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prestamo other = (Prestamo) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", libros=" + libros + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo +  ", total=" + total + '}';
    }
}
