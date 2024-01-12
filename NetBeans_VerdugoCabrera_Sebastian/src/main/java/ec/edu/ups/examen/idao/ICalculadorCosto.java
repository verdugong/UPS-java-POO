/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen.idao;

/**
 *
 * @author sebas
 */
public interface ICalculadorCosto {
    double calcularCostoSinIVA();
    double calcularCostoConIVA();
    double aplicarDescuento(double costo);
    
}
