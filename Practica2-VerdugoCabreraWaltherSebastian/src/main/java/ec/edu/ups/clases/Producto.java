/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

/**
 *
 * @author sebas
 */
public class Producto {
    private String nombreProducto;
    private int codigo;
    private String tipo;
    private double precio;

    public Producto() {
    }

    public Producto(String nombreProducto, int codigo, String tipo, double precio) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", codigo=" + codigo + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
   
}
