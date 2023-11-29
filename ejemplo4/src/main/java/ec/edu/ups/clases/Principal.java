/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clases;

import ec.edu.ups.clases.Esfera;
import ec.edu.ups.clases.Planeta;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        Esfera esfera1 = new Esfera(); //Esfera de la izq es estático y el Esfera() de la der es dinámico
        Esfera esfera2 = new Planeta(6378, 35.3);
        double s = esfera2.superficie();
        
        
    }
}
