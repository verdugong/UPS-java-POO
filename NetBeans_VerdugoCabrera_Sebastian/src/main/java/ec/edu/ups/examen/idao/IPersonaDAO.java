/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.idao;

import ec.edu.ups.examen.modelo.Persona;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IPersonaDAO {
   List<Persona> obtenerPersona();
    Persona obtenerPersona(int id);
    void crearPersona(Persona persona);
    boolean actualizarPersona(int id, Persona persona);
}
