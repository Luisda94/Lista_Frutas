package Main;

import java.util.Arrays;

public class Lista_de_frutas {

	public static void main(String[] args) {
	
		/*¿QUE ES UN ARREGLO? = Es un conjuto de datos del mismo tipo.
		 * estos datos se guardan de forma lineal*/
		
		/*  datazo lo util de esto que evitas declarar multiples variables.
		 * Este proyecto es para saber como a hacer areglos usaremos el ejemplo de realizar una lista de frtas*
 */
		
		/*int[] arreglo1;
arreglo1 =new int[4];
*/
		/* esta es una forma de hacer el areglo.
		int[] arreglo;
	arreglo = new int[6]; //datozo se instancia declaron el tipo de areglo si es int, char y asi...

*/
		/*segundo forma asignando los valores y el tamaño directo. 
		int areglo2[]= {8,5,4,9};
*/
		//acaba abajo de forma explicita declaramos dos areglos uno int y otro String
		//areglo int
		int arreglo1[]= {1,3,5,8,9,15}; //forma 2 se asigna el valor directo hunto el tamaño.
/* Si fuera de la forma 1 deberia ser declarado asi
		arreglo [0] =1;
		arreglo [1] =3;
		arreglo [2] =5;
		arreglo [3] =8;
		arreglo [4] =9;
		arreglo [5] =15; */
		
		
		//arreglo string
		String arregloCadena[];
		arregloCadena = new String[6]; //foma 1 de hacer el areglo 
		//se asignaa el valor string a cada espacio dentro del areglo
		arregloCadena [0]="Platano";
		arregloCadena [1]="Manzana";
		arregloCadena [2]="Pera";
		arregloCadena [3]="Durazno";
		arregloCadena [4]="Melon";
		arregloCadena [5]="Sandia";
		//Arriba no mas guardamos los datos de los Arrays
		
		System.out.println(Arrays.toString(arreglo1));
		System.out.println(Arrays.toString(arregloCadena));

		//para saber el tamaño del areglo se usa lo siguiente : length.
		System.out.println("el tamaña del areglo int es de : "arreglo1.length);
		
}
}
