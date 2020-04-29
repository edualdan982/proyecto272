/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @author luisi
 * Clase que representa los id's de respondeAPS
 */
@Data
@Embeddable
public class RespondeAPSKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name="codEstudiante")
	private Long codEstudiante;
	

	@Column(name="idPreguntaSimple")
	private Long idPreguntaSimple;
	
	public RespondeAPSKey () {}

}
