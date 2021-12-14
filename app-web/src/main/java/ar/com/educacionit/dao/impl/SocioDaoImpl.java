package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements ICrud {

	public Socios create(Socios socio) {
		//Insertaremos luego los datos a la DB
		
		String sql = "INSERT INTO SOCIOS (nombre,apellido,email.direcion)VALUES('Edwin'Caicedo','edwin@gmail.com','cra 29 numero 89-29')"; 
		System.out.println("Ejecuantando sql: " + sql);
		return new Socios(10L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
	}

	public Socios findById(Long id) {
		String sql = "SELECT * FROM SOCIOS WHERE  = "+ id;
		
		return new Socios (10L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
		
		
	}
	
}
