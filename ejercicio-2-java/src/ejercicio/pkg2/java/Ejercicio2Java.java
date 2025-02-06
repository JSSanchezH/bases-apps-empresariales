/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2.java;

import modelo.Empleado;
import modelo.Empresa;

/**
 *
 * @author Miguel Angel Patiño
 */
public class Ejercicio2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Empleado empleado1 = new Empleado("Miguel Angel", 500000, "Gerente");
//        Empleado empleado2 = new Empleado("Sebastian Sanchez", 400000, "Gerente");
//        Empleado empleado3 = new Empleado("Mariana", 600000, "Gerente");
        
        Empresa empresa = new Empresa();
        
//        empresa.getListaEmpleados().add(empleado1);
//        empresa.getListaEmpleados().add(empleado2);
//        empresa.getListaEmpleados().add(empleado3);
        
        System.out.println("El promedio de los salarios de los empleados es: " +Empresa.calcularSalario(empresa.getListaEmpleados()));
    }
    
}
