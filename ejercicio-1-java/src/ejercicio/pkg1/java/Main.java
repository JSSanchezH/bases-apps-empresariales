/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Isa Botero H
 */
public class Main {

 public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
 
 public static int[] encontrarMinMax(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numeros) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        /* -------- Main -------- */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.\n");
        } else {
            System.out.println(numero + " no es un numero primo.\n");
        }
        scanner.close();
        /* -------- Min Max -------- */
        List<Integer> numeros = Arrays.asList(3, 8, 1, 15, -4, 7, 10);
        int[] resultado = encontrarMinMax(numeros);
        System.out.println("Lista de numeros: " + numeros);
        System.out.println("Minimo: " + resultado[0]);
        System.out.println("Maximo: " + resultado[1]);
    }   
}
