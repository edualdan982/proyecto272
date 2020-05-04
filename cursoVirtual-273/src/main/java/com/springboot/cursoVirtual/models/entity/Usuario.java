/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;



/**
 *
 * @author Edual Dan
 */

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(sequenceName = "usuarios_seq", allocationSize = 1, name = "USERS_SEQ")
    private Long id;

    @NotEmpty
    @Column(unique = true, length = 20)
    private String username;

    private Boolean estado;

    @NotEmpty
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"),
            uniqueConstraints = {
                @UniqueConstraint(columnNames = {"usuario_id", "rol_id"})})
    private List<Rol> roles;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<MensajeMaterial> mensaje_materia;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<MensajeParalelo> mensaje_paralelo;
    
    private static final long serialVersionUID = 1L;

    public Usuario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	public Set<MensajeMaterial> getMensajeMateria() {
		return mensaje_materia;
	}

	public void setMensajeMateria(Set<MensajeMaterial> mensajeMateria) {
		this.mensaje_materia = mensajeMateria;
	}

	public Set<MensajeParalelo> getMensajeParalelo() {
		return mensaje_paralelo;
	}

	public void setMensajeParalelo(Set<MensajeParalelo> mensajeParalelo) {
		this.mensaje_paralelo = mensajeParalelo;
	}
   
    
}
