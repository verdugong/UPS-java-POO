/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.controlador;

import ec.edu.ups.examen.idao.IProductoDAO;
import ec.edu.ups.examen.modelo.Producto;
import ec.edu.ups.examen.vista.ProductoVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ProductoControlador {
   private IProductoDAO productoDAO;
    private ProductoVista productoVista;
    private Producto producto;

    public ProductoControlador(IProductoDAO productoDAO, ProductoVista productoVista) {
        this.productoDAO = productoDAO;
        this.productoVista = productoVista;
    }
    
    public void crearProducto(){
        producto = productoVista.ingresarDatosProducto();
        productoDAO.crearProducto(producto);
    }
    
    public void actualizarProducto(){
        producto = productoVista.actualizarDatosProducto();
        if(productoDAO.actualizarProducto(producto.getIdProducto(), producto) == true){
            productoVista.mostrarAlertas("Producto actualizado correctamente!");                    
        }else{
            productoVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void buscarProductoPorId(){
        int id = productoVista.buscarDatosProducto();
        producto = productoDAO.obtenerProducto(id);
        if(producto == null){
            productoVista.mostrarAlertas("Producto no encontrado");                    
        }else{
            productoVista.mostrarInformacionProducto(producto.getIdProducto(), producto.getNombre(), producto.getPrecio());
        }
    }
    
    public void listarProducto(){
        List<Producto> listaProductos = productoDAO.obtenerProducto();
        for (Producto producto : listaProductos) {
            productoVista.mostrarInformacionProducto(producto.getIdProducto(), producto.getNombre(), producto.getPrecio());
        }
    } 
}
