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
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
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
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Normalizar (sin espacios ni signos)
        int izquierda = 0, derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        /* -------- Primos -------- */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println(numero + (esPrimo(numero) ? " es un número primo." : " no es un número primo."));

//        scanner.close();
        /* -------- Min Max -------- */
        List<Integer> numeros = Arrays.asList(3, 8, 1, 15, -4, 7, 10);
        int[] resultado = encontrarMinMax(numeros);
        System.out.println("Lista de numeros: " + numeros);
        System.out.println("Minimo: " + resultado[0]);
        System.out.println("Maximo: " + resultado[1]);
        
        /* -------- Palindromo -------- */
              
        System.out.print("Ingrese una palabra: ");
        scanner.nextLine();
        String palabra = scanner.nextLine();

        System.out.println("La palabra '" + palabra + "' " + (esPalindromo(palabra) ? "es" : "no es") + " un palindromo.");
        scanner.close();
    }
    
}
