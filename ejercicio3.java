import java.util.*;
import java.util.stream.Collectors;

public class ejercicio3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Andrés", "Juan", "Alberto", "Beatriz", "Carlos", "Andrea");

        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("\nNombres que comienzan con A: " + nombresConA);

        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Nombres en mayúsculas: " + nombresMayusculas);

        long contadorMasDe5Letras = nombres.stream()
                .filter(nombre -> nombre.length() > 5)
                .count();
        System.out.println("Cantidad de nombres con más de 5 letras: " + contadorMasDe5Letras);

        List<String> palabras = Arrays.asList("hola", "mundo", "hola", "java", "stream", "mundo", "java", "hola");
        Map<String, Long> frecuenciaPalabras = palabras.stream()
                .collect(Collectors.groupingBy(palabra -> palabra, Collectors.counting()));
        System.out.println("Frecuencia de palabras: " + frecuenciaPalabras);
    }
}
