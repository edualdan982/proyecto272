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
 * Clase para referenciar Keys de aprueba y materia
 */
@Data
@Embeddable
public class ApruebaAMKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "codEstudiante")
	private Long codEstudiante;
	
	@Column(name = "idCurso")
	private Long idCurso;
	
	@Column(name = "idCertificado")
	private String idCertificado;
	
	public ApruebaAMKey() {}

}
