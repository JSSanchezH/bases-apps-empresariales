/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Miguel Angel Patiño
 */
public class Empresa {

    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();  
    }

    public static double calcularSalario(ArrayList<Empleado> empleados) {
        if (empleados.isEmpty()) {
            throw new IllegalArgumentException("No se puede sacar proedio porque la lista de empleados esta vacia");  
        }

        double suma = 0;
        for (Empleado empleado : empleados) {
            suma += empleado.getSalario();
        }

        return suma / empleados.size();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

}
