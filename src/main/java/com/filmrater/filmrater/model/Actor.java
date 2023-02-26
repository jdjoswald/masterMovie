/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author joswald
 */
@Entity
@Table(name="Tbl_Actor")
public class Actor {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idActor", nullable = false)
    private Integer id;
    
     @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;
  
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimeinto", nullable = false, length = 150)
    Date fechaNacimiento;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "paisId", nullable = false)
    @JsonIgnoreProperties("Tbl_Actor")
    private Pais idPais;
    
     @ManyToMany(mappedBy = "actores", 
                fetch = FetchType.LAZY 
                )
    @JsonBackReference
    Set<Pelicula> peliculas;

    public Actor() {
    }

    public Actor( String nombre,  Date fechaNacimiento, Pais idPais) {
     
        this.nombre = nombre;
       
        this.fechaNacimiento = fechaNacimiento;
        this.idPais = idPais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public Set<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (Objects.equals(id, actor.id) && Objects.equals(nombre, actor.nombre)
                && Objects.equals(fechaNacimiento, actor.fechaNacimiento));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre,fechaNacimiento);
    }
    
}

