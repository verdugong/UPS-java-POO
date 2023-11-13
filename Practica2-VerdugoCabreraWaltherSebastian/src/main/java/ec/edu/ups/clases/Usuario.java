/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Usuario {
    private String nombre;
    private int id;
    private String direccion;
    private Pedido pedidos;
    private List<Carrito> numCarritos;

    public Usuario() {
        this.numCarritos = new ArrayList<>();
    }

    public Usuario(String nombre, int id, String direccion, Pedido pedidos, List<Carrito> numCarritos) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.pedidos = pedidos;
        this.numCarritos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    public List<Carrito> getNumCarritos() {
        return numCarritos;
    }

    public void setNumCarritos(List<Carrito> numCarritos) {
        this.numCarritos = numCarritos;
    }
    
    public void agregarCarrito(Carrito dir){
        numCarritos.add(dir);
    }
    
    // Método para incrementar el contador de carritos
    public void incrementarNumCarritos() {
        numCarritos.add(new Carrito());
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", pedidos=" + pedidos + ", numCarritos=" + numCarritos.size() + '}';
    }

    
    
}
