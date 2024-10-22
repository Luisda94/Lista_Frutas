package general;
import java.util.Random;  // Importamos Random para generar números aleatorios

public class Arreglos {
    public static void main(String[] args) {
        
        // Creamos un arreglo (una fila de 10 cajitas donde guardaremos números)
        int[] arreglo = new int[10]; 
        
        // Creamos un "random", que es como una máquina de números sorpresa
        Random random = new Random();  

        // Este bucle va a llenar las 10 cajitas con números aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            // En cada cajita (arreglo[i]), ponemos un número aleatorio entre 0 y 99
            arreglo[i] = random.nextInt(100); 
            
            // Imprimimos el número que pusimos en la cajita para que se muestre en pantalla
            System.out.println(arreglo[i]);  
        }
        
        // Al final, habremos llenado las 10 cajitas y mostrado los números
    }
}
