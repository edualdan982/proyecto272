package com.springboot.cursoVirtual.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.cursoVirtual.models.dao.ICursoDao;
import com.springboot.cursoVirtual.models.entity.Curso;
import com.springboot.cursoVirtual.models.servicesImpl.ICursoService;

@Service
public class CursoService implements ICursoService{
	
	@Autowired
	private ICursoDao cursoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		return (List<Curso>) cursoDao.findAll();
	}

	@Override
	public Curso findById(Long id) {
		return cursoDao.findById(id).orElse(null);
	}

	@Override
	public Curso save(Curso curso) {
		return cursoDao.save(curso);
	}

	@Override
	public void delete(Long id) {
		cursoDao.deleteById(id);
	}

}
