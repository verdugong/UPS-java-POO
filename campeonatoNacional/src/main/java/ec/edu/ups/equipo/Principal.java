/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.equipo;

/**
 *
 * @author sebas
 */
public class Principal {
    public static void main(String[] args) {
        Equipo equipoUno;
        equipoUno = new Equipo();
        
        Equipo equipoDos = new Equipo();
        Equipo equipoTres = new Equipo();
        
        equipoUno.ciudad = "QUITO";
        equipoUno.nombre = "LIGA DE QUITO";
                
        equipoDos.ciudad = "GUAYAQUIL";
        equipoDos.nombre = "BARCELONA S.C.";
        
        equipoTres.ciudad = "CUENCA";
        equipoTres.nombre = "DEPORTIVO CUENCA";
        
        
        System.out.println(equipoUno.ciudad);
        System.out.println(equipoUno.nombre);
        
        System.out.println(equipoDos.ciudad);
        System.out.println(equipoDos.nombre);
        
        System.out.println(equipoTres.ciudad);
        System.out.println(equipoTres.nombre);
            
    }
}
