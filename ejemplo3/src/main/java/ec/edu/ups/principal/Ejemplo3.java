/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.principal;

import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.EmpleadoPorComision;
import ec.edu.ups.clases.EmpleadoPorHoras;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Ejemplo3 {
    
    public static void ingresarDatos(){
        
    }

    public static void main(String[] args) {      
    

    /*public static int cuadrado(int valorInt){
            System.out.printf("\nSe llamo cuadrado con argumento int: %d", valorInt);
            return valorInt * valorInt;
        }
    
    public static double cuadrado(double valorDouble){
        System.out.printf("\nSe llamo cuadrado con argumento int: %f\n", valorDouble);
        return valorDouble * valorDouble;
    }*/
    
    /*EmpleadoAsalariado empleadoUno = new EmpleadoAsalariado(10, 1200, 2, 
                "0101", "Pepito", "Perez", "Gerente");
        EmpleadoPorComision empleadoDos = new EmpleadoPorComision(100000, 10, 
                300, "011", "Juanito", "Perez");
        EmpleadoPorHoras empleadoTres = new EmpleadoPorHoras(120, 10, "0303", 
                "Jaimito", "Perez", new Date(2023, 10, 20), "09999", "Calle 1", 
                "Vendedor");
        
        System.out.println("Empleado Asalariado: " + empleadoUno.toString());
        System.out.println("Salario: " + empleadoUno.calcularSalario());
        
        System.out.println("Empleado Comisión: " + empleadoDos.toString());
        System.out.println("Salario: " + empleadoDos.calcularSalario());
        
        System.out.println("Empleado Horas: " + empleadoTres.toString());
        System.out.println("Salario: " + empleadoTres.calcularSalario());
        
        System.out.println("EmpleadoUno es igual a EmpleadoDos: " 
                + empleadoUno.equals(empleadoDos));
               
        
        Empleado empleadoX = new Empleado("010101");
        Empleado empleadoY = new Empleado("010101");
        
        
        System.out.println("EmpleadoX es igual a EmpleadoY: " 
                + empleadoX.equals(empleadoY));
        
        System.out.println("EmpleadoX hashcode: " + empleadoX.hashCode());
        System.out.println("EmpleadoY hashcode: "+ empleadoY.hashCode());
        
        int num1 = 100;
        int num2 = (int) num1;
        
        System.out.println(num1);
        System.out.println(num2);*/
        
        List <Empleado> empleados = new ArrayList<>();
        Empleado empleadoUno = new EmpleadoAsalariado(6, 800, 2, "0101", "Pepito", "Perez", "Jefe");
        empleadoUno.aumentarNumeroEmpleados();
        Empleado empleadoDos = new EmpleadoPorComision(1000, 10, 400, "020201", "Juanito", "Perez");
        empleadoDos.aumentarNumeroEmpleados();
        Empleado empleadoTres = new EmpleadoPorHoras(160, 4, "010203", "Maria", "Perez", new Date(1999, 2, 30), "0987654321", "Calle", "Secretaria");
        empleadoTres.aumentarNumeroEmpleados();
        
        System.out.println(Empleado.numeroDeEmpleados);
        System.out.println(Empleado.calcularMulta(5));
        empleados.add(empleadoUno);
        empleados.add(empleadoDos);
        empleados.add(empleadoTres);
        
        for (Empleado empleado : empleados){
            System.out.println(empleado.toString());
            System.out.println(empleado.calcularSalario());
            if(empleado instanceof EmpleadoPorHoras){
                EmpleadoPorHoras miEmpleado = (EmpleadoPorHoras) empleado;
                System.out.println("Horas Trabajadas: " + miEmpleado.getNumeroDeHorasTrabajadas());
            }else if(empleado instanceof EmpleadoAsalariado){
                EmpleadoAsalariado miEmpleado = (EmpleadoAsalariado) empleado;
                System.out.println("Anios antiguedad: " + miEmpleado.getAniosAntiguedad());
            }else if(empleado instanceof EmpleadoPorComision){
                EmpleadoPorComision miEmpleado = (EmpleadoPorComision) empleado;
                System.out.println("Total de ventas: " + miEmpleado.getTotalDeVentas());
            }
            
        }
    }
}
