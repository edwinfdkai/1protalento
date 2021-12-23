package ar.com.educacionit.domain;


import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.SocioServiceImpl;

public class SocioTest {

	public static void main(String[] args) {
		// alguien cargo los datos desde teclado
		String nombre = "JUAN";
		String apellido = "CRUZ";
		String dni= "123456";
		String email = "unemal@gmail.com";
		String direccion = "calle 13";
		Long pais = 1l;
		
		SociosService service = new SocioServiceImpl();
		Socios socio = new Socios(nombre, apellido, email, direccion, pais);
		service.save(socio);
		
		CategoriaService cservice = new CategoriaServiceImpl();
		Categorias categoria = new Categorias("televisores", "1234");
		cservice.save(categoria);
	}

}
