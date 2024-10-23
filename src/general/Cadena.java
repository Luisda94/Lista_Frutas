package general;

import java.util.Scanner;

public class Cadena {

    public static void main(String[] args) {
        // Creamos un escáner para leer lo que el usuario escriba
        Scanner sc = new Scanner(System.in);
        
        // Pedimos que ingrese una palabra
        System.out.println("Ingrese la palabra: ");
        String palabra = sc.nextLine();  // Guardamos la palabra que el usuario escribió

        
        String espaciador = palabra.replaceAll("[\\s]", "").toLowerCase(); // Eliminar espacios y convertir a minúsculas
        
        
        // Creamos una versión de la palabra pero al revés
        String reverso = new StringBuilder(espaciador).reverse().toString();
       
        if (espaciador.equalsIgnoreCase(reverso)) {
            // Si son iguales, la palabra es un palíndromo
            System.out.println("Es un palíndromo");
        } else {
            // Si no son iguales, no es un palíndromo
            System.out.println("No es un palíndromo");
        }
        
        // Cerramos el escáner para evitar fugas de memoria
        sc.close();
    }
}
