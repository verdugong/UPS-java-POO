/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemplo7;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author sebas
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        /*Frame miVentana = new Frame();
        miVentana.setSize(600, 400);
        miVentana.setTitle("Mi ventana de ejemplo");
        miVentana.setVisible(true);
        */
        
        /*MiVentana v1 = new MiVentana();
        MiVentana v2 = new MiVentana("Ventana2");
        MiVentana v3 = new MiVentana("Ventana3", 400, 200);
        */
        
        /*Frame miMarco = new Frame();
        miMarco.setSize(600, 400);
        miMarco.setTitle("Mi ventana de ejemplo");
        miMarco.setLocation(new Point(0, 0));
        miMarco.setVisible(true);
        */
        
        /*MiVentana v3 = new MiVentana("Ventana3", 400, 200, 400, 100);
        */
        
        /*//Creamos una ventana nueva
        Frame miVentana = new Frame();
        //Creamos un boton nuevo
        Button botonHola = new Button("hOLA");
        //Agregamos propiedades a ventana
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botón");
        miVentana.setVisible(true);
        //Añadimos el baton a nuestra ventana
        miVentana.add(botonHola);
        */
        
        /*Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        Button botonArea = new Button("Calcular área");
        Button botonPerimetro = new Button("Calcular Perimetro");
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botones");
        miVentana.setVisible(true);
        miVentana.add(miPanel);
        miPanel.add(botonArea);
        miPanel.add(botonPerimetro);
        */
        
        /*Frame MiMarco = new Frame();

        Panel PanelPrincipal = new Panel();
        Panel PanelIzq = new Panel();
        Panel PanelDcha = new Panel();

        Button BotonCorrer = new Button("Correr");
        Button BotonSaltar = new Button("Saltar");
        Button BotonDescansar = new Button("Descansar");

        MiMarco.add(PanelPrincipal);
        PanelPrincipal.add(PanelIzq);
        PanelPrincipal.add(PanelDcha);

        PanelIzq.add(BotonCorrer);
        PanelIzq.add(BotonSaltar);
        PanelDcha.add(BotonDescansar);

        MiMarco.setSize(400, 200);
        MiMarco.setTitle("Ventana con paneles");
        MiMarco.setVisible(true);
        */
        
        /*
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        FlowLayout posicionamientoSecuencial = new FlowLayout();
        Button botonA = new Button("Primer botón");
        Button botonB = new Button("Segundo botón");
        Button botonC = new Button("Tercer botón");
        Button botonD = new Button("Cuarto botón");
        miPanel.setLayout(posicionamientoSecuencial);
        miVentana.add(miPanel);
        miPanel.add(botonA);
        miPanel.add(botonB);
        miPanel.add(botonC);
        miPanel.add(botonD);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con flow layout");
        miVentana.setVisible(true);
        */
        
        /*
        Frame miMarco = new Frame();
        Panel panelMenuNorte = new Panel();
        Panel panelGeneral = new Panel();
        BorderLayout puntosCardinales = new BorderLayout();
        FlowLayout opcionesMenu = new FlowLayout();
        Button botonOpcion1 = new Button("Opción 1");
        Button botonOpcion2 = new Button("Opción 2");
        Button botonOpcion3 = new Button("Opción 3");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");
        panelGeneral.setLayout(puntosCardinales);
        panelMenuNorte.setLayout(opcionesMenu);
        miMarco.add(panelGeneral);
        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        panelMenuNorte.add(botonOpcion1);
        panelMenuNorte.add(botonOpcion2);
        panelMenuNorte.add(botonOpcion3);
        panelGeneral.add(botonSur, BorderLayout.SOUTH);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);
        miMarco.setSize(400, 150);
        miMarco.setTitle("Ventana con BorderLayout");
        miMarco.setVisible(true);
        */
        
        /*
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(2, 3);
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++)
        botones[i] = new Button("Botón " + i);
        miPanel.setLayout(matriz);
        for (int i = 0; i < 6; i++)
        miPanel.add(botones[i]);
        miVentana.add(miPanel);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con GridLayout");
        miVentana.setVisible(true);
        */
        
        /*
        Frame MiMarco = new Frame();
        Label Titulo = new Label("Notas de atematica");
        
        MiMarco.add(Titulo);
        
        MiMarco.setSize(200,100);
        MiMarco.setTitle("Ventana con etiqueta");
        MiMarco.setVisible(true);
        */

        Frame MiMarco = new Frame();

        Panel EntradaDeDatos = new Panel(new FlowLayout());

        TextField Nombre = new TextField(15);
        TextField Apellidos = new TextField(60);
        TextField Nacionalidad = new TextField("Española", 15);

        EntradaDeDatos.add(Nombre);
        EntradaDeDatos.add(Apellidos);
        EntradaDeDatos.add(Nacionalidad);

        MiMarco.add(EntradaDeDatos);

        MiMarco.setSize(500, 130);

        MiMarco.setTitle("Ventana con campos de texto");

        MiMarco.setVisible(true);
        
    }
}

