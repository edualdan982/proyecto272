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
 * Clase de entidad opciones de preguntas de seleccion multiple
 */
@Data
@Entity
@Table(name="opciones")
public class Opcion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idOpcion;
	
	private String opcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idPreguntaMultiple")
	private PreguntaMultiple preguntaMultiple;
	
	public Opcion() {}

}
