/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * Clase que hace referencia a las entidad tareas que dejan en cada paralelo
 */
@Data
@Entity
@Table(name="tareas")
public class Tarea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long idTarea;
	
	private String Descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private Date horaInicio;
	private Date horaFin;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idParalelo")
	private Paralelo paralelo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCurso", referencedColumnName = "id")
	private Curso curso;
	
	@OneToMany
	private Set<RealizaAT> realizaAT;
	
	public Tarea() {}

}
