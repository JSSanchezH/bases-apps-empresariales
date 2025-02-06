/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Miguel Angel Patiño
 */
public class Vehiculo {
    
    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = 0;
    }
    
    public void acelerar() {
        System.out.println("El vehículo está acelerando...");
    }

    public void mostrarVelocidad() {
        System.out.println(marca + " va a " + velocidad + " km/h");
    }
    
    
    
    
    
}
