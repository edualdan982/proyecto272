/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.cursoVirtual.models.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 *
 * @author Edual Dan
 */
@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTUD_SEQ")
    @SequenceGenerator(sequenceName = "estud_seq", allocationSize = 1, name = "ESTUD_SEQ")
    private Long codEstudiante;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;    

    @OneToMany
    private Set<ApruebaAM> apruebaAM;
    
    @OneToMany
    private Set<InscritoAP> inscritoAP;
    
    @OneToMany
    private Set<RealizaAE> realizaAE;
    
    @OneToMany
    private Set<RealizaAT> realizaAT;
    
    @OneToMany
    private Set<RespondeAPS> respondeAPS;
    
    @OneToMany
    private Set<RespondeAPM> respondeAPM;

    private static final long serialVersionUID = 1L;

    public Estudiante() {}
}
