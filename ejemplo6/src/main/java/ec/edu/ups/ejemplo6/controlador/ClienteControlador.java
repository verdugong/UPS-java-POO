/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo6.controlador;

import ec.edu.ups.ejemplo6.modelo.Cliente;
import ec.edu.ups.ejemplo6.vista.ClienteVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ClienteControlador {
    
    private IClienteDAO clienteDAO;
    private ClienteVista clienteVista;
    private Cliente cliente;
    
    public ClienteControlador(IClienteDAO clienteDAO, ClienteVista clienteVista){
        this.clienteDAO = clienteDAO;
        this.clienteVista = clienteVista;
    }
    
    public void crearCleinte(){
        cliente = clienteVista.ingresarDatosCliente();
        clienteDAO.crearCliente(cliente);
    }
    
    public void actualizarCliente(){
        cliente = clienteVista.actualizarDatosCliente();
        if(clienteDAO.actualizarCliente(cliente.getId(), cliente) == true){
            clienteVista.mostrarInfo("Cliente acutalizado correctamente");
        }else{
            clienteVista.mostrarInfo("Ha ocurrido un error");
        }
    }
    
    public void eliminarCliente(){
        int id = clienteVista.eliminarCliente();
        if(clienteDAO.eliminarCliente(id) == true){
            clienteVista.mostrarInfo("Cliente eliminado correctamente");
        }else{
            clienteVista.mostrarInfo("Ha ocurrido un error");
        }
    }
    
    public void buscarClientePorID(){
        int id = clienteVista.buscarCliente();
        cliente = clienteDAO.obtenerClientes(id);
        if(cliente == null){
            clienteVista.mostrarInfo("Ha ocurrido un error. Cliente no encontrado");
        }else{
            clienteVista.mostrarInfoCliente(cliente.getId(), cliente.getNombre(), cliente.getApellido());
        }
    }
    
    public void listarCliente(){
        List<Cliente> listaClientes = clienteDAO.obtenerClientes();
        for (Cliente cliente : listaClientes){
            clienteVista.mostrarInfoCliente(cliente.getId(), cliente.getNombre(), cliente.getApellido());
        }

    }
}
