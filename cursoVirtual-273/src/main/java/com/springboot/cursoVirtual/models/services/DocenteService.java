package com.springboot.cursoVirtual.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.cursoVirtual.models.dao.IDocenteDao;
import com.springboot.cursoVirtual.models.entity.Curso;
import com.springboot.cursoVirtual.models.entity.Docente;
import com.springboot.cursoVirtual.models.servicesImpl.IDocenteService;

@Service
public class DocenteService implements IDocenteService {
	
	@Autowired
	private IDocenteDao docenteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Docente> findAll() {
		return (List<Docente>) docenteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Docente findById(Long id) {
		return docenteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Docente save(Docente docente) {
		return docenteDao.save(docente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		docenteDao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Curso> findAllCursos() {
		// TODO Auto-generated method stub
		return null;
	}

}
