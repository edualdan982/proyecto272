package com.springboot.cursoVirtual.models.servicesImpl;

import java.util.List;


import com.springboot.cursoVirtual.models.entity.Curso;

public interface ICursoService {

	
	public List<Curso> findAll();
	
	public Curso findById(Long id);
	
	public Curso save(Curso curso);
	
	public void delete(Long id);
	
}
