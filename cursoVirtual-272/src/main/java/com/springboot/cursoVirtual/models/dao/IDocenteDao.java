package com.springboot.cursoVirtual.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.cursoVirtual.models.entity.Docente;

public interface IDocenteDao extends CrudRepository<Docente, Long>{

}
