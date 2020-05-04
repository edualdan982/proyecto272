package com.springboot.cursoVirtual.models.servicesImpl;

import java.util.List;


import com.springboot.cursoVirtual.models.entity.Curso;
import com.springboot.cursoVirtual.models.entity.Docente;

public interface IDocenteService {
	
	public List<Docente> findAll();
	
	public Docente findById(Long id);
	
	public Docente save(Docente docente);
	
	public void delete(Long id);
	
	public List<Curso> findAllCursos();
}
