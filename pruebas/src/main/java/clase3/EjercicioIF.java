package clase3;

public class EjercicioIF {

	public static void main(String[] args) {
		double n1 = 1;
		double n2 = 2;
		double n3 = 3;
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1+" El  es el mayor");
		} if (n2 > n1 && n2 > n3){
			System.out.println(n2+" El  es el mayor");
		}if(n3 > n1 && n3 > n2){
			System.out.println(n3+" El  es el mayor");
		}else   {
			System.out.println("son iguales");
		}
		

	}

}
