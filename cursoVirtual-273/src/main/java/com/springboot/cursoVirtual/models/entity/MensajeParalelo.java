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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clase para la entidad de mensaje de paralelo
 */
@Data
@Entity
@Table(name = "mensajes_paralelos")
public class MensajeParalelo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long idMensajeMaterial;
	
	private String contenido;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idUser", referencedColumnName = "id")
	private Usuario usuario;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ChatParalelo chat;
	
	public MensajeParalelo() {}

}
