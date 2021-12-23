package ar.com.educacionit.dao.impl;
import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements SociosDao{
	
	
	public Socios save(Socios socio) {
		//Insertaremos luego los datos a la DB
			
		String sql = "INSERT INTO SOCIOS (nombre,apellido,email.direcion)VALUES('Edwin'Caicedo','edwin@gmail.com','cra 29 numero 89-29')"; 
		System.out.println("Ejecutando sql: " + sql);
		
		return new Socios(10L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
	}

	public Socios getOne(Long id) {
		String sql = "SELECT * FROM SOCIOS WHERE  = "+ id;
		System.out.println("ejecutando sql:"+ sql);
		return new Socios (10L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
		
		
	}
	
	public Socios[] findAll() {
		String sql = "select * from socios";
		
		System.out.println("Ejecutando sql: " + sql);
		
	Socios socio1 =	new Socios(1L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
	Socios socio2 =	new Socios(21L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
	Socios socio3 =	new Socios(3L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
	
	return new Socios[] {socio1, socio2, socio3};
	}
	
	/*	public Socios selectCustom() {
	String sql = "select * from socios";
	return new Socios(1L,"Edwin", "Caicedo", "edwin@gmail.com", "cra 29 numero 89-29", 1l);
}
*/

	public void delete(Long id) {
		String sql = "DELETE FROM socios WHERE id = " + id;
		System.out.println(sql);
		
	}

	public void update(Socios entity) {
		String sql = "UPDATE  socios " +
		"SET direccion = '"+entity.getDireccion()+"', APELLIDO = '"+entity.getApellido()+"', paises_id = "+entity.getPaisesId()+
		"WHERE id = 1" ;
		System.out.println(sql);
		
		
	}



	
}
