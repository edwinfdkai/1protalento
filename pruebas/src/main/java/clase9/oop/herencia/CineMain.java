package clase9.oop.herencia;

public class CineMain {
	
	public static void main(String[] args) {
		
		//Persona persona = new Persona("Persona1","apellido1","negro");
		Persona empleado = new Empleado("Empleado1","apellidoemp1","rojo",1);
		Persona efectivo = new Efectivo("nombre efectivo1","apellido efectivo1","rubio",1);
		Persona contratado = new Contratado("nombre contratado1", "apellido contratado 1", "azul", 1,3);
		
		
		Director director = new Director("nombre director", "apellido director", "negro", 10);
		
		//Todas las personas pueden ir al cine
		Persona[] personas = new Persona[4];
		//personas[0] = persona;
		personas[0] = empleado;
		personas[1] = efectivo;
		personas[2] = contratado;
		personas[3] = director;
		
		//recorer las personar que entran al cine y quiero saber si es un director
		
		for(Persona aux : personas) {
			aux.detallar();
				
			if(aux instanceof Director) {
				//toma al director que esta dentro de la persona
				Director d = (Director)aux;
				
				aux.getApellido();
				d.getApellido();
				
				System.out.println("Director tiene a cargo : "+ d.getEmpACargo()+" empleados va en una silla especial !!");
				
			}else {
				
			}
			
		}
			
		Empleado empleado2 = new Empleado("empleado2", "apellidoemp2", "rojo", 2);
		
		Director.delegar(empleado2, "arcivhar");
		

		
				
		
	}
}
