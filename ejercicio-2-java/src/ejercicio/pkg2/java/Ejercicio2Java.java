/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2.java;

import modelo.Carro;
import modelo.Empleado;
import modelo.Empresa;
import modelo.Moto;
import modelo.Pagable;
import modelo.TarjetaCredito;
import modelo.TransferenciaBancaria;
import modelo.Vehiculo;

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
        
        System.out.println("------------------ Ejercicio 1 ------------------");

        Empleado empleado1 = new Empleado("Miguel Angel", 500000, "Gerente");
        Empleado empleado2 = new Empleado("Sebastian Sanchez", 400000, "Gerente");
        Empleado empleado3 = new Empleado("Mariana", 600000, "Gerente");
        Empresa empresa = new Empresa();

        empresa.getListaEmpleados().add(empleado1);
        empresa.getListaEmpleados().add(empleado2);
        empresa.getListaEmpleados().add(empleado3);
        try {
            double promedio = Empresa.calcularSalario(empresa.getListaEmpleados());
            System.out.println("El promedio de los salarios de los empleados es: " + promedio);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());  
        }
        
        System.out.println("\n\n------------------ Ejercicio 2 ------------------");
        
        Vehiculo miCarro = new Carro("Toyota",0);
        Vehiculo miMoto = new Moto("Yamaha",0);

        miCarro.acelerar();
        miMoto.acelerar();

        miCarro.mostrarVelocidad();
        miMoto.mostrarVelocidad();
        
        System.out.println("\n\n------------------ Ejercicio 3 ------------------");
        
        Pagable pagoConTarjeta = new TarjetaCredito("1234567812345678");
        Pagable pagoConTransferencia = new TransferenciaBancaria("987654321");

        pagoConTarjeta.procesarPago(150.75);
        pagoConTransferencia.procesarPago(300.50);

    }

}
