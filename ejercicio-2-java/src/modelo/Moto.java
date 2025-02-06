/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Miguel Angel Patiño
 */
public class Moto extends Vehiculo{
    
    public Moto(String marca, int velocidad){
        super(marca, velocidad);
    }
    
    @Override
    public void acelerar() {
        velocidad += 15;
        System.out.println("La moto acelera. Nueva velocidad: " + velocidad + " km/h");
    }
    
    
}
