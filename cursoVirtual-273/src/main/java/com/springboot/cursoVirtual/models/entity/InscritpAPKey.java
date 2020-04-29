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
 * Clase que ayuda definir la gestion de Keys de las clases de la relacion de muchos a muchos
 */
@Data
@Embeddable
public class InscritpAPKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "idParalelo")
	private Long codEstudiante;
	
	@Column(name = "idParalelo")
	private String idParalelo;
	
	@Column(name = "idCurso")
	private Long idCurso;
	
	public InscritpAPKey() {}

}
