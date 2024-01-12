/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.modelo;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Cliente extends Persona{
    private String direccion;
    private ArrayList<Pedido> pedidos;

    public Cliente() {
        this.pedidos = new ArrayList<> ();
    }

    public Cliente(String direccion, ArrayList<Pedido> pedidos) {
        this.direccion = direccion;
        this.pedidos = pedidos;
    }

    public Cliente(String direccion, ArrayList<Pedido> pedidos, String nombre, int id, String correo) {
        super(nombre, id, correo);
        this.direccion = direccion;
        this.pedidos = pedidos;
    }

    public Cliente(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "direccion=" + direccion + ", pedidos=" + pedidos + '}';
    }  

}
