package general;

import java.util.Scanner;

public class Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("INgrese la palabra");
String palabra = sc.nextLine();
String reverso = new StringBuilder(palabra).reverse().toString();
String nuevoreverso = reverso.replaceAll(palabra, reverso);
if (palabra.equalsIgnoreCase(reverso)) {
System.out.println("es palindromo");
	}else {
		System.out.println("no es palindromo");
	}
sc.close();
}
}