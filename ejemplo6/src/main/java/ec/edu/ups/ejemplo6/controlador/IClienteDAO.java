/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.ejemplo6.controlador;

import ec.edu.ups.ejemplo6.modelo.Cliente;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public interface IClienteDAO {
 
    List<Cliente> obtenerClientes();
    Cliente obtenerClientes(int id);
    void crearCliente(Cliente cliente);
    boolean actualizarCliente(int id, Cliente cliente);
    boolean eliminarCliente(int id);
    
}
