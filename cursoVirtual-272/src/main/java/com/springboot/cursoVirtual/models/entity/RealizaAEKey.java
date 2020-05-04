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
 * Clase para definir las Keys de la
 */
@Data
@Embeddable
public class RealizaAEKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "idExamen")
	private Long idExamen;
	
	@Column(name = "codAlumnos")
	private Long codAlumno;
	
	public RealizaAEKey () {}
}
