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
 * Clase para relacionar alumno que realiza un examen
 */
@Data
@Entity
@Table(name = "realizasae")
public class RealizaAE implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApruebaAMKey id;
	
	private int nota;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codEstudiante")
	@JoinColumn(name = "codEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idExamen")
	@JoinColumn(name = "idExamen")
	private Examen examen;
	
	public RealizaAE() {}
}
