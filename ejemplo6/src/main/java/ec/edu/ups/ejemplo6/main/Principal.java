/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo6.main;

import ec.edu.ups.ejemplo6.controlador.ClienteControlador;
import ec.edu.ups.ejemplo6.controlador.ClienteDAO;
import ec.edu.ups.ejemplo6.controlador.IClienteDAO;
import ec.edu.ups.ejemplo6.vista.ClienteVista;

/**
 *
 * @author sebas
 */
public class Principal {
    public static void main(String[] args){
        IClienteDAO clienteDAO = new ClienteDAO();
        ClienteVista clienteVista = new ClienteVista();
        
        ClienteControlador controlador = new ClienteControlador(clienteDAO, clienteVista);
                
        controlador.crearCleinte();
        controlador.crearCleinte();
        controlador.listarCliente();
        controlador.actualizarCliente();
        controlador.listarCliente();
        controlador.eliminarCliente();
        controlador.listarCliente();
        controlador.buscarClientePorID();
    }
}
