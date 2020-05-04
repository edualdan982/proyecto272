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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author luisi
 * Clase que representa la entidad de material principal
 */
@Data
@Entity
@Table(name="materiales_principales")
public class MaterialPrincipal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long idMaterialPrincipal;
	
	private String tipo;
	private String direccion;
	private String descripcion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idChatMaterial")
	private ChatMaterial chat;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<MaterialSecundario> materialSecundario;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Codigo> codigo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idLeccion")
	private Leccion leccion;
	
	public MaterialPrincipal () {}
	
	
}
