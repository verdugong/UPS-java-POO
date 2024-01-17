/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica06.controlador;

import ec.edu.ups.poo.practica06.modelo.Directorio;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class DirectorioControlador {
    private Directorio modelo;
    private DefaultListModel<String> listaModelo;

    public DirectorioControlador(DefaultListModel<String> listaModelo) {
        this.modelo = new Directorio("/");
        this.listaModelo = listaModelo;
    }

    public void crearElementoEnRuta(String nombreElemento, boolean esDirectorio, String ruta) {
        File nuevoElemento = new File(ruta, nombreElemento);

        try {
            if (esDirectorio) {
                if (nuevoElemento.mkdir()) {
                    JOptionPane.showMessageDialog(null, "Directorio creado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El directorio ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                if (nuevoElemento.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Archivo creado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear el elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarModeloLista();
    }

    public void renombrarElementoEnRuta(String nombreElementoActual, String nuevoNombre, String ruta) {
        File elementoActual = new File(ruta, nombreElementoActual);
        File elementoNuevo = new File(ruta, nuevoNombre);

        if (elementoActual.exists()) {
            if (elementoActual.renameTo(elementoNuevo)) {
                JOptionPane.showMessageDialog(null, "Elemento renombrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al renombrar el elemento", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El elemento actual no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarModeloLista();
    }

    public void eliminarElementoEnRuta(String nombreElemento, String ruta) {
        File elemento = new File(ruta, nombreElemento);

        if (elemento.exists()) {
            if (elemento.isDirectory()) {
                eliminarDirectorio(elemento);
            } else {
                if (elemento.delete()) {
                    JOptionPane.showMessageDialog(null, "Elemento eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el elemento", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El elemento no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarModeloLista();
    }

    private void eliminarDirectorio(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                eliminarDirectorio(archivo);
            }
        }
        if (directorio.delete()) {
            JOptionPane.showMessageDialog(null, "Directorio eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el directorio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String[] listarElementos(boolean mostrarArchivosOcultos, boolean mostrarDirectoriosOcultos) {
    File directorioActual = new File(modelo.getRutaActual());

    try {
        if (directorioActual.exists() && directorioActual.isDirectory()) {
            File[] elementos = directorioActual.listFiles();
            if (elementos != null) {
                List<String> nombresElementos = new ArrayList<>();

                for (File elemento : elementos) {
                    boolean esVisible = true;

                    if (!mostrarArchivosOcultos && elemento.isHidden()) {
                        esVisible = false;
                    }

                    if (!mostrarDirectoriosOcultos && elemento.isDirectory() && elemento.isHidden()) {
                        esVisible = false;
                    }

                    if (esVisible) {
                        nombresElementos.add(elemento.getName());
                    }
                }

                return nombresElementos.toArray(new String[0]);
            }
        }
    } catch (SecurityException ex) {
        ex.printStackTrace();
    }

    return new String[0];
}

    
    public void actualizarRutaModelo(String nuevaRuta) {
        modelo.actualizarRuta(nuevaRuta);
    }
    
    public void actualizarModeloLista(boolean mostrarArchivosOcultos, boolean mostrarDirectoriosOcultos) {
        String[] nuevosElementos = listarElementos(mostrarArchivosOcultos, mostrarDirectoriosOcultos);

        listaModelo.clear();
        Arrays.stream(nuevosElementos).forEach(listaModelo::addElement);
    }
    
    public String[] listarElementos() {
        return listarElementos(false, false);
    }

    public void actualizarModeloLista() {
        actualizarModeloLista(false, false);
    }
    
    public String[] listarArchivosOcultos() {
        return listarElementos(true, false);
    }
    
    public String obtenerInformacionElemento(String nombreElemento) {
        String rutaElemento = modelo.getRutaActual() + File.separator + nombreElemento;
        File archivo = new File(rutaElemento);
        StringBuilder info = new StringBuilder();

        // Obtener el path absoluto
        info.append("Path absoluto: ").append(archivo.getAbsolutePath()).append("\n");

        // Obtener el tamaño del archivo
        info.append("Tamaño del archivo: ").append(archivo.length()).append(" bytes\n");

        // Obtener los permisos de lectura y escritura
        info.append("Permisos de lectura: ").append(archivo.canRead() ? "Sí" : "No").append("\n");
        info.append("Permisos de escritura: ").append(archivo.canWrite() ? "Sí" : "No").append("\n");

        // Obtener la fecha de última modificación
        long lastModified = archivo.lastModified();
        Date fechaModificacion = new Date(lastModified);
        info.append("Fecha de última modificación: ").append(fechaModificacion).append("\n");

        return info.toString();
    }
    
    
}
