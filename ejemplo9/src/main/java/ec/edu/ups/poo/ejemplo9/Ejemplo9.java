/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.poo.ejemplo9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author sebas
 */
public class Ejemplo9 {

    public static void main(String[] args) {
        /*try {
            String ruta="C:/Users/sebas/OneDrive - Universidad Politecnica Salesiana/Documentos/archivoTexto.txt";
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.append("Hola mundo" + "\n");
            escritura.close();
            archivoEscritura.close();
            } catch(FileNotFoundException e1){
            System.out.println("Ruta de archivo no encontrada");
            } catch(IOException e2) {
            System.out.println("Error de escritura");
            } catch(Exception e3) {
            System.out.println("Error General");
        }*/
        
        
        /*try {
            String ruta="C:/Users/sebas/OneDrive - Universidad Politecnica Salesiana/Documentos/archivoTexto.txt";
            FileReader archivoLectura = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivoLectura);
            String linea= lectura.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=lectura.readLine();
            }
            lectura.close();
            archivoLectura.close();
            } catch(FileNotFoundException e1) {
            System.out.println("Ruta de archivo no encontrada");
            } catch(IOException e2) {
            System.out.println("Error de lectura");
            } catch(Exception e3) {
            System.out.println("Error General");
            } 
    }
        try {
            String ruta = "C:/Users/sebas/OneDrive - Universidad Politecnica Salesiana/Documentos/archivoRandomico.dat";
            RandomAccessFile archivoEscritura;
            archivoEscritura = new RandomAccessFile(ruta, "rw");
            archivoEscritura.writeInt(80);
            archivoEscritura.writeDouble(90.1);
            archivoEscritura.writeDouble(100.2);
            archivoEscritura.writeInt(80);
            archivoEscritura.close();

          } catch (FileNotFoundException e1) {

            System.out.println("Ruta de archivo no encontrada");

          } catch (IOException e1) {

            System.out.println("Error de escritura");

          } catch (Exception e1) {

            System.out.println("Error General");

        }*/
        
        try {
            String ruta = "C:/Users/sebas/OneDrive - Universidad Politecnica Salesiana/Documentos/archivoRandomico.dat";
            RandomAccessFile archivoLectura;
            archivoLectura = new RandomAccessFile(ruta, "r");
            archivoLectura.seek(12);
            double x = archivoLectura.readDouble();
            System.out.println(x);
            archivoLectura.close();

          } catch (FileNotFoundException e1) {

            System.out.println("Ruta de archivo no encontrada");

          } catch(IOException e1) {

            System.out.println("Error de lectura");

          } catch(Exception e1) {

            System.out.println("Error General");

        }
    }
}
