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
 * @author luishi
 * Clase que de refiere a entidad anuncio
 */
@Data
@Entity
@Table(name = "anuncios")
public class Anuncio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long idAnuncio;
	
	private String mensaje;
	private String prioridad;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idParalelo")
	private Paralelo paralelo;
	
	public Anuncio () {}
	
}
