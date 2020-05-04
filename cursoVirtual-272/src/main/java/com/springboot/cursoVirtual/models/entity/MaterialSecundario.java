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
 * @author luishi
 * Clase para representar la entidad Maerial secundario
 */
@Data
@Entity
@Table(name = "materiales_secundarios")
public class MaterialSecundario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long idMaterialSecundario;
	
	private String dir;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idMaterialPrincipal")
	private MaterialPrincipal materialPrincipal;
	
	public MaterialSecundario () {}

}
