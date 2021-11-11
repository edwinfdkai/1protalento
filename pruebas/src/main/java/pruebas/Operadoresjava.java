package pruebas;

public class Operadoresjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad1 = 10;
		int edad2 = 20;
		int res = 30;
		
		//syso+ctr+space
		System.out.println("edad1+edad2= "+ res);
		System.out.println("-------------------------------------------------");
		
		//string 
		String nombre = "edwin";
		String apellido = "caicedo";
		String nombreCompleto = nombre + apellido;
		System.out.println("Su nombre completo es= " + nombreCompleto);
		System.out.println("-------------------------------------------------");
		
		double alto = 175.5;
		
		//para los float
		float ancho = 205.7F;
		System.out.println("-------------------------------------------------");
		
		float resDiv = (float)alto/ancho;
		System.out.println(resDiv);
		
		int a = 10;
		int b = 5;
		int c = a/b;
		int mod = a%b; 
		System.out.println("resultado con /"+c);
		System.out.println(a + "/"+ b + "=" + mod);
		
		System.out.println("-------------------------------------------------");
		
		double multi = alto*ancho;
		System.out.println("*"+ multi);
		
		System.out.println("-------------------------------------------------");
		
		// relacionales
		// > < >= <= != TODOS boolean
							//175.5 < 205.5
		boolean resAltoAncho = alto < ancho; // true 
		System.out.println(alto + " < " + ancho + " = " + resAltoAncho);
		
		//Logicos
		// && AND
		//|| inclusivo OR
		// ! NOT
		//xor esclusivo XOR
		
		// dia sea martes con1
		//horario 19:30 cond2
		// comienza el curso cond1 y  cond2
		
		boolean esMartes = true;
		boolean horario19 = false;
		boolean curso = esMartes && horario19;
		System.out.println("el valor de verdad de " + esMartes + " && " + horario19 + "="+ curso);
		
		int edadAdulto = 18;
		boolean tieneCarnet = true;
		float altura = 0.75F;
		String nombre1 = "edwin";
		
		
		//Puedo conducir si es mayor Y tiene carnet
		boolean puedeConducir = (edadAdulto >= 18) && tieneCarnet &&(nombre1 == "edwin" || (altura > 1.0));
		System.out.println("Puede conducir = "+ puedeConducir);
		
		boolean aux = true;
		boolean baux = true;
		boolean resAux = aux ^ baux;
		System.out.println("resAux "+ resAux);
		
		
	}

}
