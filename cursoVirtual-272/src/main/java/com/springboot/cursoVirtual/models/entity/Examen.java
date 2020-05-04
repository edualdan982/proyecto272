/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Entidad que muestra examen y tiene varias 
 */
@Data
@Entity
@Table(name = "examenes")
public class Examen implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long idExamen;
	
	private String Descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private Date horaInicio;
	private Date horaFin;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idParalelo")
	private Paralelo paralelo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCurso", referencedColumnName = "id")
	private Curso curso;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<RealizaAE> realizaAE;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<PreguntaSimple> PreguntaSimple;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<PreguntaMultiple> preguntaMultiple;
	
	public Examen () {}

}
