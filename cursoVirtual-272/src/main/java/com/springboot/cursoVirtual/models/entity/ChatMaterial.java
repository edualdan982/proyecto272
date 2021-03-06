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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clase que de la entidad Chat
 */
@Data
@Entity
@Table(name = "chats_materiales")
public class ChatMaterial implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idChatMaterial;
	
	private String nombre;
	private String descripcion;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MaterialPrincipal materialPrincipal;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<MensajeMaterial> Mensaje;
	
	public ChatMaterial() {}
}
