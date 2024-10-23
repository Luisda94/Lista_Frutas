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
		arregloBidimensional [1][0] =4 ;
		arregloBidimensional [1][1] = 5;
		//el areglo de esta forma visualmente seria algo asi: 
		/*{	{1,2,3},
		 	{4,5,0},
		 	{0,0,0}}*/
		//Dato tanto la fila como la columna parten en el indice 0
		//si no se declara todo los valores java interpreta el resto con null o cero
		//se comienza a hacer el recorrido con for
		
		for (int I=0;I<arregloBidimensional.length; I++) {
			for (int F=0;F<arregloBidimensional[I].length; F++)
			System.out.println(arregloBidimensional[I][F]);
		}
		// segunda forma : //2 filas 4 columnas datos llenos sin null o cero
		int[][] numeros = {{1,5,9,6},//fila 0
							{8,6,15,7}}; //fila1 
		for (int i = 0; i < numeros.length; i++) {  // Recorre las filas
		    for (int j = 0; j < numeros[i].length; j++) {  // Recorre las columnas
		        System.out.println("Elemento en [" + i + "][" + j + "] es: " + numeros[i][j]);
		
		    
		    }
		}
		
		
		///
		
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("hasta la fila 1");
            System.out.println("");
            // Recorrer solo hasta la fila 1.
            for (int i = 0; i < matriz.length; i++) { // Cambia el límite superior para incluir solo hasta la fila 1
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("la fila "+ i + "y la columna" + j + "tiene "+matriz[i][j]);
                }
            }
            System.out.println();
            System.out.println("Un nuevo recorrido con for-each");
            System.out.println(); // Nueva línea después de cada fila
            for(int [] fila : matriz) {
            	for (int c: fila) {
            		// c=5; //eso me cambiara todo por el mismo valor 
            		System.out.println(c+" ");
            } 
            } System.out.println();

	}
}
