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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 *
 * @author Edual Dan
 */
@Data
@Entity
@Table(name = "docentes")
public class Docente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTUD_SEQ")
    @SequenceGenerator(sequenceName = "estud_seq", allocationSize = 1, name = "ESTUD_SEQ")
    private Long codDocente;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String paterno;

    @NotEmpty
    private String materno;

    @NotEmpty
    @Email
    @Column(nullable = true, unique = true)
    private String email;

    private String foto;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "imparte_curso", joinColumns = @JoinColumn(name = "docente_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id"),
            uniqueConstraints = {
                @UniqueConstraint(columnNames = {"docente_id", "curso_id"})})
    private List<Curso> cursos;   

    private static final long serialVersionUID = 1L;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Paralelo> paralelos;

    public Docente () {}
    
}
