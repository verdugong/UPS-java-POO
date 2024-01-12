/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.idao;

import ec.edu.ups.examen.modelo.Producto;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IProductoDAO {
    List<Producto> obtenerProducto();
    Producto obtenerProducto(int id);
    void crearProducto(Producto producto);
    boolean actualizarProducto(int id, Producto producto);
}
