/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Carrito {
    private List<Producto> productos;
    private boolean esEspecial;
    private int numProductos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public Carrito( boolean esEspecial, int numProductos) {
        this.productos = new ArrayList<>();
        this.esEspecial = esEspecial;
        this.numProductos = numProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public boolean isEsEspecial() {
        return esEspecial;
    }

    public void setEsEspecial(boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }
    
    // Método para agregar productos al carrito
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrito{");
        sb.append("productos=[");
        
        // Iterar sobre la lista de productos y agregar su información al StringBuilder
        for (Producto producto : productos) {
            sb.append(producto.toString());
            sb.append(", ");
        }
        
        sb.append("], esEspecial=").append(esEspecial);
        sb.append(", numProductos=").append(numProductos);
        sb.append('}');
        return sb.toString();
    }
    
}
