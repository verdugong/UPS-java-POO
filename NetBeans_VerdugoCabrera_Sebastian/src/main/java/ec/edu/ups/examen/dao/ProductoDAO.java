/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.dao;

import ec.edu.ups.examen.idao.IProductoDAO;
import ec.edu.ups.examen.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ProductoDAO implements IProductoDAO{
    private List<Producto> listaProductos;
		
		public ProductoDAO(){
			  listaProductos = new ArrayList<>();
		}
                
    @Override
    public List<Producto> obtenerProducto() {
        return listaProductos;
    }

    @Override
    public Producto obtenerProducto(int id) {
        for (Producto producto : listaProductos) {
            if(producto.getIdProducto() == id){
                return producto;
            }
        }
        return null;
    }

    @Override
    public void crearProducto(Producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public boolean actualizarProducto(int id, Producto producto) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto productoEncontrado = listaProductos.get(i);
            if(productoEncontrado.getIdProducto() == id){
                listaProductos.set(i, producto);
                return true;
            }
        }
        return false;
    }
    
}
