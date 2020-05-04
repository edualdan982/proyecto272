/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clase que representa la pregunta la entidad pelicula
 */
@Data
@Entity
@Table(name="preguntas_simples")
public class PreguntaSimple implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPreguntaSimple;
	
	private String Enunciado;
	private String tipo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idExamen")
	private Examen examen;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<RespondeAPS> respondeAPS;
	
	public PreguntaSimple() {}
}
