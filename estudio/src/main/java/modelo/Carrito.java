/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author sebas
 */
public class Carrito {
    private int id;
    private Date fechaPago;
    private double subtotal;
    private double iva;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Producto> listaProductos;

    public Carrito() {
        fechaPago = new Date();
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
    }

    public Carrito(int id, Date fechaPago, double subtotal, double iva) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.subtotal = subtotal;
        this.iva = iva;
    }

    public Carrito(ArrayList<Cliente> listaClientes, ArrayList<Producto> listaProductos) {
        this.listaClientes = listaClientes;
        this.listaProductos = listaProductos;
    }

    public Carrito(int id, Date fechaPago, double subtotal, double iva, ArrayList<Cliente> listaClientes, ArrayList<Producto> listaProductos) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.subtotal = subtotal;
        this.iva = iva;
        this.listaClientes = listaClientes;
        this.listaProductos = listaProductos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Carrito other = (Carrito) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", fechaPago=" + fechaPago + ", subtotal=" + subtotal + ", iva=" + iva + ", listaClientes=" + listaClientes + ", listaProductos=" + listaProductos + '}';
    }   
    
}
