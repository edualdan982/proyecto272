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
 * Clase que representa a entidad leccion
 */
@Data
@Entity
@Table(name = "lecciones")
public class Leccion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long idLeccion;
	
	private String nombre;
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idParalelo")
	private Paralelo paralelo;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<MaterialPrincipal> materialPrincipal;
	
	public Leccion() {}

}
