/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo7;

import java.awt.Frame;
import java.awt.Point;

/**
 *
 * @author sebas
 */
public class MiVentana extends Frame {
    
    public MiVentana(String titulo, int ancho, int alto, int posX, int posY) {
        this(titulo,ancho,alto);
        this.setLocation(new Point(posX, posY));
    }
    public MiVentana(String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }
    
    public MiVentana(String titulo, int ancho, int alto){
        this(titulo);
        this.setSize(ancho, alto);
    }
    
    public MiVentana(){
        this("Mi Ventana", 600, 400);
    }
}
