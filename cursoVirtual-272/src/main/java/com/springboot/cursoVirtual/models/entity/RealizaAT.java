/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clase que representa la entidad de la relacion de muchos a muchos de alumnos y tareas
 */
@Data
@Entity
@Table(name = "realizasat")
public class RealizaAT implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RealizaATKey id;
	
	private String contenido;
	private String tipo;
	private int nota;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codEstudiante")
	@JoinColumn(name = "codEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idTarea")
	@JoinColumn(name = "idTarea")
	private Tarea tarea;
	
	public RealizaAT() {}

}
