/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.controlador;

import ec.edu.ups.examen.idao.IPedidoDAO;
import ec.edu.ups.examen.idao.IPersonaDAO;
import ec.edu.ups.examen.idao.IProductoDAO;
import ec.edu.ups.examen.modelo.Pedido;
import ec.edu.ups.examen.modelo.Persona;
import ec.edu.ups.examen.modelo.Producto;
import ec.edu.ups.examen.vista.PedidoVista;
import ec.edu.ups.examen.vista.PersonaVista;
import ec.edu.ups.examen.vista.ProductoVista;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PedidoControlador {
    private IPedidoDAO pedidoDAO;
    private PedidoVista pedidoVista;
    private Pedido pedido;
    
    private IProductoDAO productoDAO;
    private ProductoVista productoVista;
    private Producto producto;
    
    private IPersonaDAO personaDAO;
    private PersonaVista personaVista;
    private Persona persona;

    public PedidoControlador(IPedidoDAO pedidoDAO, PedidoVista pedidoVista, IProductoDAO productoDAO, ProductoVista productoVista, IPersonaDAO personaDAO, PersonaVista personaVista) {
        this.pedidoDAO = pedidoDAO;
        this.pedidoVista = pedidoVista;
        this.productoDAO = productoDAO;
        this.productoVista = productoVista;
        this.personaDAO = personaDAO;
        this.personaVista = personaVista;
    }
   
    public void crearPedido(){
        pedido = pedidoVista.ingresarDatosPedido();
        int idPersona = personaVista.buscarDatosPersona();
        persona = personaDAO.obtenerPersona(idPersona);
        if(persona != null){
            pedido.setClientes(persona);
            int numeroDeProductos = pedidoVista.agregarProductosAPedido();
            for (int i = 0; i < numeroDeProductos; i++) {
                int idProducto = productoVista.buscarDatosProducto();
                producto = productoDAO.obtenerProducto(idProducto);
                if(producto != null){
                    pedido.agregarProducto(producto);
                }else{
                    productoVista.mostrarAlertas("No se ha encontrado los datos del Libro!");
                }
            } 
            pedidoDAO.crearPedido(pedido);
        }else{
            personaVista.mostrarAlertas("No se ha encontrado los datos del Usuario!");
        }
        
    }
    
    public void actualizarPedido(){
        pedido = pedidoVista.actualizarDatosPedido();
        if(pedidoDAO.actualizarPedido(pedido.getIdPedido(), pedido) == true){
            pedidoVista.mostrarAlertas("Pedido actualizado correctamente!");                    
        }else{
            pedidoVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void buscarPedidoPorId(){
        int id = pedidoVista.buscarDatosPedido();
        pedido = pedidoDAO.obtenerPedido(id);
        if(pedido == null){
            pedidoVista.mostrarAlertas("Prestamo no encontrado");
        }else{
            pedidoVista.mostrarInformacionPedido(pedido);
        }
    }
    
    public void listarPedidos(){
        List<Pedido> listaPedidos = pedidoDAO.obtenerPedido();
        for (Pedido pedido : listaPedidos) {
            pedidoVista.mostrarInformacionPedido(pedido);
        }
    }
}
