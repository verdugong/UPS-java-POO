/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.ClienteView;

/**
 *
 * @author sebas
 */
public class ClienteController {
    private ClienteView vista;
    private Cliente modelo;

    public ClienteController(ClienteView vista, Cliente modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public int getId(){
        return modelo.getId();
    }
    
    public void setId(int id){
        this.modelo.setId(id);
    }
    
    public String getNombre(){
        return modelo.getNombre();
    }
    
    public void setNombre(String nombre){
        this.modelo.setNombre(nombre);
    }
    
    public String getApellido(){
        return modelo.getApeliido();
    }
    
    public void setApellido(String apellido){
        this.modelo.setApeliido(apellido);
    }
    
    public void actualizarVista(){
        vista.imprimirDatosCliente(modelo.getId(), modelo.getNombre(), modelo.getApeliido());
    }
    
}
