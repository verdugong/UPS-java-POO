/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.modelo;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author sebas
 */
public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo() {
    }

    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
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

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "libro=" + libro + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
    public void calcularDiasPrestamo() {
        LocalDate fechaInicial = convertirADateLocal(fechaPrestamo);
        LocalDate fechaFinal = convertirADateLocal(fechaDevolucion);

        // Calcular la diferencia de días entre las fechas
        Duration diferencia = Duration.between(fechaInicial.atStartOfDay(), fechaFinal.atStartOfDay());
        long diasDiferencia = diferencia.toDays();

        System.out.println("La diferencia de días entre la fecha de préstamo y devolución es: " + diasDiferencia + " días.");
    }

    // Método para convertir de Date a LocalDate
    private LocalDate convertirADateLocal(Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }
    
    public void esPrestamoVigente() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaPrestamoLocal = convertirADateLocal(fechaPrestamo);
        LocalDate fechaDevolucionLocal = convertirADateLocal(fechaDevolucion);

        // Verificar si la fecha actual está dentro del rango del préstamo
        if ((fechaActual.isEqual(fechaPrestamoLocal) || fechaActual.isAfter(fechaPrestamoLocal))
                && fechaActual.isBefore(fechaDevolucionLocal)) {
            System.out.println("El préstamo está vigente.");
        } else {
            System.out.println("El préstamo no está vigente.");
        }
    }
    
}
