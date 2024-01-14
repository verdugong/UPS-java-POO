/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.poo.ejemplo8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejemplo8 {
        /**
    * Método estatico que devuelve la division entre dos numeros
    * lanzando una excepción si existe un error de Aritmética
    * @param numerador
    * @param denominador
    * @return resultado
    * @throws ArithmeticException
    */
        public static int obtieneCociente(int numerador, int denominador)
        throws ArithmeticException {
        //Inicilizamos la variable a retornar
        int resultado = 0;
        //realizamos el calculo del cociente
        resultado = numerador / denominador; //posible division para 0
        //devolvemos el resultado
        return resultado;
        }
        
        public static void main(String[] args) {
            //Declaramos e inicializamos las variables a utilizar en el método main
            int numerador = 0;
            int denominador = 0;
            int cociente = 0;
            boolean bandera = false;
            //Declaramos un scanner para leer los datos de entrada
            Scanner entrada = new Scanner(System.in);
            //Inicializamos un bucle mientras la bandera == false
            do{
                //Insertamos los bloques try - catch para capturar excepciones
                //En el bloque try leemos los datos y realizamos el calculo del cociente
                try{
                    //leemos datos con la variable entrada
                    System.out.print("Ingrese el numerador: ");
                    numerador = entrada.nextInt();
                    System.out.print("Ingrese el denominador: ");
                    denominador = entrada.nextInt();
                    //realizamos el calculo del cociente y guardamos el resultado en
                    //la variable cociente
                    cociente = obtieneCociente(numerador, denominador);
                    //Imprime el resultado si no hubo errores
                    System.out.println("Resultado: " + cociente);
                    //Termina el bucle
                    bandera = true;                    
                }
                    catch(ArithmeticException excepcionAritmetica){
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Excepcion: " + excepcionAritmetica);
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Error: Cero es un denominador inválido, intente nuevamente.");
                        System.out.println();
                    }catch(InputMismatchException excepcionEntrada){
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Excepcion: " + excepcionEntrada);
                        System.out.println("-------------------------------------------------------------");
                        entrada.nextLine();
                        System.out.println("Error: Debe introducir números decimales");
                        System.out.println();
                        }
                finally{
                System.out.println("*************************************");
                System.out.println("Sistema realizado por: Gabriel Léon");
                System.out.println("*************************************");
            }
                }while(bandera==false);
            }
        }
