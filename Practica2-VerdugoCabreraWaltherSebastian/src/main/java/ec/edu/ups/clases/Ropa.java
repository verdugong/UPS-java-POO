/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

/**
 *
 * @author sebas
 */
public class Ropa extends Producto{
    private String talla;

    public Ropa() {
    }

    public Ropa(String talla, String nombreProducto, int codigo, String tipo, double precio) {
        super(nombreProducto, codigo, tipo, precio);
        this.talla = talla;
    }

    public Ropa(String talla) {
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Ropa{" + "talla=" + talla + '}';
    }

    
    
}
