/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.dao;

import ec.edu.ups.examen.idao.IPersonaDAO;
import ec.edu.ups.examen.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PersonaDAO implements IPersonaDAO{
    private List<Persona> listaPersonas;
		
		public PersonaDAO(){
			  listaPersonas = new ArrayList<>();
		}

    @Override
    public List<Persona> obtenerPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona obtenerPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crearPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarPersona(int id, Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
