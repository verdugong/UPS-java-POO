/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.modelo;

/**
 *
 * @author sebas
 */
public class Empleado extends Persona{
    private String rol;
    private int pedidosAtendidos;

    public Empleado() {
    }

    public Empleado(String rol, int pedidosAtendidos) {
        this.rol = rol;
        this.pedidosAtendidos = pedidosAtendidos;
    }

    public Empleado(String rol, int pedidosAtendidos, String nombre, int id, String correo) {
        super(nombre, id, correo);
        this.rol = rol;
        this.pedidosAtendidos = pedidosAtendidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getPedidosAtendidos() {
        return pedidosAtendidos;
    }

    public void setPedidosAtendidos(int pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rol=" + rol + ", pedidosAtendidos=" + pedidosAtendidos + '}';
    }

}
