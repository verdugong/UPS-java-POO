/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.dao;

import ec.edu.ups.examen.idao.IPedidoDAO;
import ec.edu.ups.examen.modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PedidoDAO implements IPedidoDAO{
    private List<Pedido> listaPedidos;
		
		public PedidoDAO(){
			  listaPedidos = new ArrayList<>();
		}
    @Override
    public List<Pedido> obtenerPedido() {
        return listaPedidos;
    }

    @Override
    public Pedido obtenerPedido(int id) {
        for (Pedido pedido : listaPedidos) {
            if(pedido.getIdPedido() == id){
                return pedido;
            }
        }
        return null;
    }

    @Override
    public void crearPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    @Override
    public boolean actualizarPedido(int id, Pedido pedido) {
        for (int i = 0; i < listaPedidos.size(); i++) {
            Pedido pedidoEncontrado = listaPedidos.get(i);
            if(pedidoEncontrado.getIdPedido() == id){
                listaPedidos.set(i, pedido);
                return true;
            }            
        }
        return false;
    }
    
}
