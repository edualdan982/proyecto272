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
 * Clase de la entidad ApruebaAM
 */
@Data
@Entity
@Table(name = "aprueba_am")
public class ApruebaAM implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApruebaAMKey id;

	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codEstudiante")
	@JoinColumn(name = "codEstudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idCurso")
	@JoinColumn(name = "idCurso", referencedColumnName = "id")
	private Curso curso;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idCertificado")
	@JoinColumn(name = "idCertificado")
	private Certificado certificado;
	
	private int nota;
	
	public ApruebaAM() {}
		
}
