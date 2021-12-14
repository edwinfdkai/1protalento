package clase9.oop.herencia;

public class Empleado extends Persona {
	
	//atributos propios del empleado
	private Integer id;
		
	public Empleado(String nombre,String apellido,String colorPelo,Integer id) {
		//antes de nacer el empleado nace la persona
		super(nombre,apellido,colorPelo);
		
		//puedo setear los atributos propios
		this.id = id;
	}
	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	/*
	public void detalle() {
		super.detalle();
		//muestre lo propio
		System.out.println("Id: "+ this.getId());
	}
	*/
	
	
	public void detallar() {
		System.out.println("Id: " + this.getId());
		
	}

}
