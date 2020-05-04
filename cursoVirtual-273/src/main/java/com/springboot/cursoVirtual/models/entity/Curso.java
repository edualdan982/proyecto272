/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.cursoVirtual.models.entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 *
 * @author Edual Dan
 */

@Entity
@Table(name = "cursos")
public class Curso implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CURSO_SEQ")
    @SequenceGenerator(sequenceName = "cursos_seq", allocationSize = 1, name = "CURSO_SEQ")
    private Long id;
    
    @NotNull
    @NotEmpty
    private String nombre;
    
    private String descripcion;

    private static final long serialVersionUID = 1L;
    
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Set<Paralelo> parCursos;
    
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Set<ApruebaAM> apruebaAM;
    
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Set<InscritoAP> inscritoAP;
    
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Set<Examen> examenes;
    
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Set<Tarea> tareas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Paralelo> getParCursos() {
		return parCursos;
	}

	public void setParCursos(Set<Paralelo> parCursos) {
		this.parCursos = parCursos;
	}

	public Set<ApruebaAM> getApruebaAM() {
		return apruebaAM;
	}

	public void setApruebaAM(Set<ApruebaAM> apruebaAM) {
		this.apruebaAM = apruebaAM;
	}

	public Set<InscritoAP> getInscritoAP() {
		return inscritoAP;
	}

	public void setInscritoAP(Set<InscritoAP> inscritoAP) {
		this.inscritoAP = inscritoAP;
	}

	public Set<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(Set<Examen> examenes) {
		this.examenes = examenes;
	}

	public Set<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(Set<Tarea> tareas) {
		this.tareas = tareas;
	}
    
}
