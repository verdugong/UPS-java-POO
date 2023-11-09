/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

/**
 *
 * @author sebas
 */
public class Telefono {
    private int numero;
    private String tipo;
    private OperadoraTelefonia unaOperadora;
    private Persona unaPersona;

    public Telefono() {
    }

    public Telefono(int numero, String tipo, OperadoraTelefonia unaOperadora, Persona unaPersona) {
        this.numero = numero;
        this.tipo = tipo;
        this.unaOperadora = unaOperadora;
        this.unaPersona = unaPersona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public OperadoraTelefonia getUnaOperadora() {
        return unaOperadora;
    }

    public void setUnaOperadora(OperadoraTelefonia unaOperadora) {
        this.unaOperadora = unaOperadora;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", tipo=" + tipo + ", unaOperadora=" + unaOperadora + ", unaPersona=" + unaPersona + '}';
    }
    
    
    
}
