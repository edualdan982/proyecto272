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
 * Clase para representar las Keys de alumnos que realizan tereas
 */
@Data
@Embeddable
public class RealizaATKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "codAlumno")
	private Long codAlumno;
	
	@Column(name = "idTarea")
	private Long idTarea;
	
}
