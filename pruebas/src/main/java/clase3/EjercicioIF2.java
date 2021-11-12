package clase3;

public class EjercicioIF2 {

	public static void main(String[] args) {
		//determinar dado 3 numero, cual es el mayor

		// necesito 3 
		// if
		// mostrar
		
		int n1, n2,n3;
		n1 = 11;
		n2 = 11;
		n3 = 15;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
		}
		if(n2 > n1 && n2 > n3) {
			System.out.println(n2);
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println(n3);
		}
		
		// n1 y n2 < n3
		// n1 y n3 < n2
		// n3 y n2 < n1
		if(n1 == n2 && n1 > n3) {
			System.out.println(n1);
		}else {
			if(n3 > n2) {
				System.out.println(n3);
			}
		}
		if(n1 == n3 && n1 > n2) {
			System.out.println(n1);
		}else {
			if(n2 > n1) {
				System.out.println(n2);
			}
		}
		if(n2 == n3 && n2 > n1) {
			System.out.println(n2);
		}else {
			if(n1 > n2) {
				System.out.println(n1);
			}
		}
		
		// n1 == n2 == n3
		if(n1 == n2 && n2 == n3 ) {
			System.out.println("iguales");
		}
	}

}

