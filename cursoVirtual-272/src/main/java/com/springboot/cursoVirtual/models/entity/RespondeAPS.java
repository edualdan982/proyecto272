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
 * clase que representa la entidad Responde a preguna simple
 */
@Data
@Entity
@Table(name = "respondesaps")
public class RespondeAPS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespondeAPSKey id;
	
	private int nota;
	private String respuesta;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codEstudiante")
	@JoinColumn(name = "codEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idPreguntaSimple")
	@JoinColumn(name = "idPreguntaSimple")
	private PreguntaSimple preguntaSimple;
	
	public RespondeAPS () {}
}
