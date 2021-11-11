package pruebas;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingese el valor de a:");
		int a = teclado.nextInt();
		
		System.out.println("Ingrese el valor de b:");
		int b = teclado.nextInt();
		
		int suma = a + b;
		
		System.out.println("la suma es= "+ suma);
		
		teclado.close();
	}

}
