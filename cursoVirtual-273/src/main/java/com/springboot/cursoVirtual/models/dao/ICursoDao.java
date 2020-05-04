package com.springboot.cursoVirtual.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.cursoVirtual.models.entity.Curso;

public interface ICursoDao extends CrudRepository<Curso, Long>{

}
