/**
 * 
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author luisi
 * Esta clase genera la entidad certificado
 */
@Data
@Entity
@Table(name = "certificados")
public class Certificado  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCertificado;
	private String claveValidacion;
	private String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<ApruebaAM> aprueba;
	
	public Certificado() {}

}
