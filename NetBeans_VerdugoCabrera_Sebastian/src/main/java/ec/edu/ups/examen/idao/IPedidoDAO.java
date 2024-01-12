/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.idao;

import ec.edu.ups.examen.modelo.Pedido;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IPedidoDAO {
    List<Pedido> obtenerPedido();
    Pedido obtenerPedido(int id);
    void crearPedido(Pedido pedido);
    boolean actualizarPedido(int id, Pedido pedido);
}
