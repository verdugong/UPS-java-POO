/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.examen.main;

import ec.edu.ups.examen.controlador.PedidoControlador;
import ec.edu.ups.examen.controlador.PersonaControlador;
import ec.edu.ups.examen.controlador.ProductoControlador;
import ec.edu.ups.examen.dao.PedidoDAO;
import ec.edu.ups.examen.dao.PersonaDAO;
import ec.edu.ups.examen.dao.ProductoDAO;
import ec.edu.ups.examen.idao.IPedidoDAO;
import ec.edu.ups.examen.idao.IPersonaDAO;
import ec.edu.ups.examen.idao.IProductoDAO;
import ec.edu.ups.examen.vista.PedidoVista;
import ec.edu.ups.examen.vista.PersonaVista;
import ec.edu.ups.examen.vista.ProductoVista;

/**
 *
 * @author sebas
 */
public class NetBeans_VerdugoCabrera_Sebastian {

    public static void main(String[] args) {
        // Instancias de DAO
        IProductoDAO productoDao = new ProductoDAO();
        IPedidoDAO pedidoDao = new PedidoDAO();
        IPersonaDAO personaDao = new PersonaDAO();

        // Instancias de Vistas
        ProductoVista productoVista = new ProductoVista();
        PedidoVista pedidoVista = new PedidoVista();
        PersonaVista personaVista = new PersonaVista();
        
         // Instancias de Controladores
        ProductoControlador productoControlador = new ProductoControlador(productoDao, productoVista);
        PedidoControlador pedidoControlador = new PedidoControlador(pedidoDao, pedidoVista);
        PersonaControlador personaControlador = new PersonaControlador(personaDao, personaVista);
        
        // Pruebas
        realizarPruebasDeProductos(productoControlador);
        realizarPruebasDePedidos(pedidoControlador);
        realizarPruebasDePersonas(personaControlador);
        
        private static void realizarPruebasDeProductos(ProductoControlador controlador) {
        // Implementar pruebas para 3 productos

    }

    private static void realizarPruebasDePersonas(PersonaControlador controlador) {
        // Implementar pruebas para persona con un cliente y un empleado
    }

        private static void realizarPruebasDePedidos(PedidoControlador controlador) {
        // Implementar pruebas para un pedido con al menos dos productos agregados
    }
    }
    }
}
