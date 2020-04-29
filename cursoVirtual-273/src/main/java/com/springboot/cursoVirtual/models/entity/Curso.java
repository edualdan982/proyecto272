/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 *
 * @author Edual Dan
 */
@Data
@Entity
@Table(name = "cursos")
public class Curso implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(sequenceName = "usuarios_seq", allocationSize = 1, name = "USERS_SEQ")
    private Long id;
    
    @NotNull
    @NotEmpty
    private String nombre;

    private String descripcion;

    private static final long serialVersionUID = 1L;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Paralelo> parCursos;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<ApruebaAM> apruebaAM;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<InscritoAP> inscritoAP;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Examen> examenes;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Tarea> tareas;
    
    
    public Curso () {}
}
