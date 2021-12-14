package clase9.oop.herencia.interfaces;

public class MainInterfaces {
	public static void main(String[] args) {
		
		Avion a = new Avion();
		Helicoptero h = new Helicoptero();
		Superman s = new Superman();
		
		Volador[] voladores = new Volador[] {a,h,s};
		
		for(Volador v: voladores) {
			
			if(v instanceof Aterrizable) {
				
				Aterrizable atr = (Aterrizable)v;
				
				atr.Aterrizar();
				
			}else {
				System.out.println(v + "- Nopuede aterrizar no cumple el contrato");
			}
		}
	}
}
