package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.services.SociosService;

public class SocioServiceImpl extends AbstracBaseServie<Socios> implements SociosService {

	
	
	public SocioServiceImpl() {
		super (new SocioDaoImpl());
	}
	
	

}
