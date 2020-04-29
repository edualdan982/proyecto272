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
 *
 */

@Data
@Entity
@Table(name="preguntas_multiples")
public class PreguntaMultiple implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPreguntaMultiple;
	
	private String Enunciado;
	private String tipo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idExamen")
	private Examen examen;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Opcion> opciones;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<RespondeAPM> respondeAPM;
	
	public PreguntaMultiple() {}
}
