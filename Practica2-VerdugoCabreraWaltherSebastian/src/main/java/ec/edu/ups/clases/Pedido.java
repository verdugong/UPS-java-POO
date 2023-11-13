/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author sebas
 */
public class Pedido {
    private Usuario datosUsuario;
    private Carrito totalProductos;
    private String metodoDePago;

    public Pedido() {
    }

    public Pedido(Usuario datosUsuario, Carrito valorAPagar, String metodoDePago) {
        this.datosUsuario = datosUsuario;
        this.totalProductos = valorAPagar;
        this.metodoDePago = metodoDePago;
    }

    public Usuario getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(Usuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public Carrito getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(Carrito totalProductos) {
        this.totalProductos = totalProductos;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "Pedido{" + "datosUsuario=" + datosUsuario + ", totalProductos=" + totalProductos + ", metodoDePago=" + metodoDePago + '}';
    }

    public void datosPedido() {
        System.out.println("Detalles del Pedido:");
        System.out.println("Datos del Usuario: " + datosUsuario.toString());
        System.out.println("Carrito de Compras:");
        System.out.println(totalProductos.toString());

        double totalAPagar = calcularTotalAPagar();
        System.out.println("Total a Pagar: $" + totalAPagar);

        System.out.println("Método de Pago: " + metodoDePago);
    }

    private double calcularTotalAPagar() {
        List<Producto> productos = totalProductos.getProductos();
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }
    
}
