package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Ingrese un dato y si es > 18 imprimir "mayor de edad"
		
		System.out.println("Ingrese edad");
		
		int edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println( "Es Mayor de edad");
		}else {
			System.out.println("Es menor de edad");
			
	}
		teclado.close();
}
}