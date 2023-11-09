/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        Date date = new Date();
        Persona personita = new Persona("Pepito", "0302517545", date);
        OperadoraTelefonia operadorita = new OperadoraTelefonia(1,"EM");
        Telefono telefonito = new Telefono(1, "convencional", operadorita, personita);
        
        telefonito.setNumero(0);
        System.out.println(telefonito.getUnaPersona().getNombre());
        
        
    
    }
}
