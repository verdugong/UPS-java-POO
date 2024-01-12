/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.modelo;

import ec.edu.ups.examen.idao.ICalculadorCosto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sebas
 */
public class Pedido implements ICalculadorCosto{
   private int idPedido;
   private Date fecha;
   private String detalles;
   private ArrayList<Producto> productos;
   private ArrayList<Cliente> clientes;
   private ArrayList<Empleado> empleadoAsociado;
   private ArrayList<Persona> personas;

    public Pedido() {
        this.productos = new ArrayList<> ();
        this.clientes = new ArrayList<> ();
        this.personas = new ArrayList<> ();
        this.empleadoAsociado = new ArrayList<> ();
        fecha = new Date();
    }

    public Pedido(int idPedido, Date fecha, String detalles) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.detalles = detalles;
    }

    public Pedido(ArrayList<Producto> productos, ArrayList<Cliente> clientes, ArrayList<Empleado> empleadoAsociado, ArrayList<Persona> personas) {
        this.productos = productos;
        this.clientes = clientes;
        this.empleadoAsociado = empleadoAsociado;
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(ArrayList<Empleado> empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idPedido;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return this.idPedido == other.idPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fecha=" + fecha + ", detalles=" + detalles + ", productos=" + productos + ", clientes=" + clientes + ", empleadoAsociado=" + empleadoAsociado + ", personas=" + personas + '}';
    }

    

    @Override
    public double calcularCostoSinIVA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularCostoConIVA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double aplicarDescuento(double costo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double aplicarDescuento(String tipoCliente, double costo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
