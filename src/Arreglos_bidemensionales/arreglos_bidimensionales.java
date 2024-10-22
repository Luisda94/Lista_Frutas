package Arreglos_bidemensionales;

public class arreglos_bidimensionales {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		Los arreglos bidimensionales son una tabla con filas y columnas(dos dimensiones) 
		Es similar al concepto de matrices en matematica.
		*/
		//para declarar un Array Bidimensional se puede hacer de las siguientes formas:
		// uno instanciando el arreglo y colocando el tamaño de la fila y el tamaño de la columna.
		//dato la fila siempre es el primero de izquierda a derecha el primero de derecha a izquierda.
		int[][] arregloBidimensional = new int[3][3];
		//en este caso tenemos que asignarles un valor a cada uno de los indices que hay en este arreglo
		//en este caso son 3 datos para la fila y 3 datos para la columna.
		//nombre de arreglos | nro fila |nro columna| valor asignado
		arregloBidimensional [0][0] = 1 ;
		arregloBidimensional [0][1] = 2;
		arregloBidimensional [0][2] =3 ;
		arregloBidimensional [1][1] =4 ;
		arregloBidimensional [1][2] = 5;
		//Dato tanto la fila como la columna parten en el indice 0
		
		//se comienza a hacer el recorrido con for
		
		for (int I=0;I<arregloBidimensional.length; I++) {
			System.out.println(arregloBidimensional[0][I]);
		}
		
		
	}

}
