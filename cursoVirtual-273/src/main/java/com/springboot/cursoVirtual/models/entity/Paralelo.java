/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clse que representa los paralelos de los cursos
 */
@Data
@Entity
@Table(name = "paralelos")
public class Paralelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idParalelo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCurso", referencedColumnName = "id")
	private Curso curso;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codDocente")
	private Docente docente;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Anuncio> anuncios;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Leccion> leccion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idChatParalelo")
	private ChatParalelo chatParalelo;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<InscritoAP> inscritoAP;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Examen> examenes;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Tarea> Tareas;
	
	public Paralelo () {}	
}
