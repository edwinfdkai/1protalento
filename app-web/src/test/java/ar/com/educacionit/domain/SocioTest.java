package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class SocioTest {

	public static void main(String[] args) {
		// alguien cargo los datos desde teclado
		String nombre = "JUAN";
		String apellido = "CRUZ";
		String dni= "123456";
		String email = "unemal@gmail.com";
		String direccion = "calle 13";
		Long pais = 1l;
		
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		//uso del constructor de la clase socios
		Socios socio = socioImpl.create (new Socios (nombre, apellido, email, direccion, pais));
		
		System.out.println("se ha creado el socio id: "+ socio.getId());
		
		Socios otroSocio = socioImpl.findById(5l);		
		
		if(otroSocio != null) {
			System.out.println("Se ha creado el seocio id:"+ otroSocio.getId());
		}else {
			System.out.println("Se ha creado el seocio id:" + otroSocio);
		}

	}

}
