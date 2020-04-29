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
 * Clase para agregar las keys de responde a pregunta multiple
 */
@Data
@Embeddable
public class RespondeAPMKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="codEstudiante")
	private Long codEstudiante;
	
	@Column(name="idPreguntaMultiple")
	private Long idPreguntaMultiple;
	
	public RespondeAPMKey () {}

}
