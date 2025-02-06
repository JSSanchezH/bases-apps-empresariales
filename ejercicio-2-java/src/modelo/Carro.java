/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Miguel Angel Patiño
 */
public class Carro extends Vehiculo {

    public Carro(String marca, int velocidad){
        super(marca, velocidad);
    }
    
     @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El carro acelera. Nueva velocidad: " + velocidad + " km/h");
    }
    
}
