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
 * clase que representa la entidad de chat con meterial principal
 */
@Data
@Entity
@Table(name = "mensajes_materiales")
public class MensajeMaterial  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long idMensajeMaterial;
	
	private String contenido;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_user", referencedColumnName = "id")
	private Usuario usuario;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ChatMaterial chat;
	
	public MensajeMaterial() {}

}
