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
 * Clase que implemetna la entidad de responde a pregunta simple
 */
@Data
@Entity
@Table(name = "respondesapm")
public class RespondeAPM implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespondeAPMKey id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codEstudiante")
	@JoinColumn(name = "codEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idPreguntaMultiple")
	@JoinColumn(name = "idPreguntaMultiple")
	private PreguntaMultiple preguntaMultiple;
	
	public RespondeAPM() {}

}
