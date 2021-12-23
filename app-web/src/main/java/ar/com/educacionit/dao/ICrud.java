package ar.com.educacionit.dao;

import ar.com.educacionit.domain.Socios;

public interface ICrud {
	public Socios create(Socios socioAcrear);
		
	public Socios findById(Long id);
	
	public Socios[] findAll();

}
