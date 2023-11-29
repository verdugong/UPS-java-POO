/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases;

/**
 *
 * @author sebas
 */
public class Planeta extends Esfera {
    int numSatelites;
    double coeficienteAchatamiento;

    Planeta(double r, double c){
        radio = r;
        coeficienteAchatamiento = c;
    }
    
    double superficie(){
        System.out.println("hola");
        return 0;
        
    }
}
