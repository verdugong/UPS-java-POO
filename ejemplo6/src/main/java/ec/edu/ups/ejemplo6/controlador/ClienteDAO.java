/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo6.controlador;

import ec.edu.ups.ejemplo6.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class ClienteDAO implements IClienteDAO {

    private List<Cliente> listaClientes;

    public ClienteDAO() {
        listaClientes = new ArrayList<>();

    }

    @Override
    public List<Cliente> obtenerClientes() {
        return listaClientes;
    }

    @Override
    public Cliente obtenerClientes(int id) {
        for (Cliente cliente : listaClientes){
            if(cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public boolean actualizarCliente(int id, Cliente cliente) {
        for(int i=0; i<listaClientes.size(); i++){
            Cliente clienteEncontrado = listaClientes.get(i);
            if(clienteEncontrado.getId() == id){
                listaClientes.set(i, cliente);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(int id) {
        for(int i=0; i<listaClientes.size(); i++){
            Cliente cliente = listaClientes.get(i);
            if(cliente.getId() == id){
                listaClientes.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void crearCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
}
