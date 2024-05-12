/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sebas
 */
public class Guerrero extends Personaje {

    private int fuerza;

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getHabilidad() {
        return habilidad;
    }

    @Override
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String getEquipo() {
        return equipo;
    }

    @Override
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Guerrero(int fuerza, String nombre, String habilidad, String equipo) {
        super(nombre, habilidad, equipo);
        this.imagen = "/imagenes/guerrero.png";
        this.fuerza = fuerza;
    }

    @Override
    public CloneablePersonaje clonar() {
        Guerrero guerreroClon = new Guerrero(fuerza, nombre, habilidad, equipo);
        guerreroClon.setImagen(imagen); 
        guerreroClon.setFuerza(fuerza);
        guerreroClon.setNombre(nombre);
        guerreroClon.setHabilidad(habilidad);
        guerreroClon.setEquipo(equipo);
        return guerreroClon;
    }

}
