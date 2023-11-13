/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

/**
 *
 * @author sebas
 */
public class Electronicos extends Producto{
    private boolean esInalambrico;

    public Electronicos() {
    }

    public Electronicos(boolean esInalambrico, String nombreProducto, int codigo, String tipo, double precio) {
        super(nombreProducto, codigo, tipo, precio);
        this.esInalambrico = esInalambrico;
    }

    public Electronicos(boolean esInalambrico) {
        this.esInalambrico = esInalambrico;
    }

    public boolean isEsInalambrico() {
        return esInalambrico;
    }

    public void setEsInalambrico(boolean esInalambrico) {
        this.esInalambrico = esInalambrico;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Electronicos{" + "esInalambrico=" + esInalambrico + '}';
    }    
    
    
}
