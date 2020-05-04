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
 * Clase que representa la entidad de los inscrito de la relacion trinaria
 */
@Data
@Entity
@Table(name = "inscritos_ap")
public class InscritoAP implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private InscritpAPKey id;
	private String periodo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idCurso")
	@JoinColumn(name = "idCurso", referencedColumnName = "id")
	private Curso curso;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idParalelo")
	@JoinColumn(name = "idParalelo")
	private Paralelo paralelo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codEstudiante")
	@JoinColumn(name = "codEstudiante")
	private Estudiante estudiante;
	
	public InscritoAP() {}
}
