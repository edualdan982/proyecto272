/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clase para representar el codigo del material principal
 */
@Data
@Entity
@Table(name="codigos")
public class Codigo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCodigo;
	
	private String lenguaje;
	private String contenido;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idMaterialPrincipal")
	private MaterialPrincipal materialPrincipal;
	
	public Codigo () {}

}
