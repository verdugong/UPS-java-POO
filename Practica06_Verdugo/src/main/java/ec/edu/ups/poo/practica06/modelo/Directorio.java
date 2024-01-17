/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica06.modelo;

/**
 *
 * @author sebas
 */
public class Directorio {
    private String rutaActual;
    
    public Directorio(String rutaActual) {
        this.rutaActual = rutaActual;
    }
    
    public void actualizarRuta(String nuevaRuta) {
        this.rutaActual = nuevaRuta;
    }

    public String getRutaActual() {
        return rutaActual;
    }

    public void setRutaActual(String rutaActual) {
        this.rutaActual = rutaActual;
    }
    
}
