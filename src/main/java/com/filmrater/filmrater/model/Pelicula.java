/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.sql.Date;
import java.sql.Time;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author joswald
 */
@Entity
@Table(name="Tbl_Pelicula")
//@JsonIgnoreProperties("Peliculas")

public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPelicula", nullable = false)
    private Integer id;
    
    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;
    @Column(name = "duracion", nullable = false, length = 150)
    private String duracion;
    @Column(name = "sinopsis", nullable = false, columnDefinition = "LONGTEXT")
    private String sinopsis;
    @Column(name = "imagen", nullable = false, columnDefinition = "LONGTEXT")
    private String imagen;
    @Column(name = "anno", nullable = false)
    private Date anno;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "paisId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties("Tbl_Pelicula")
    private Pais idPais;
    
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Tbl_genero_pelicula", 
               joinColumns = { @JoinColumn( name="fk_pelicula") },
               inverseJoinColumns = { @JoinColumn(name = "fk_genero") })  
    //@JsonIgnoreProperties("fk_pelicula")
    @JsonBackReference
    Set<Genero> generos;
    
      @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Tbl_director_pelicula", 
               joinColumns = { @JoinColumn( name="fk_pelicula") },
               inverseJoinColumns = { @JoinColumn(name = "fk_director") })    
    Set<Director> director;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Tbl_actor_pelicula", 
               joinColumns = { @JoinColumn( name="fk_pelicula") },
               inverseJoinColumns = { @JoinColumn(name = "fk_actor") })    
    Set<Actor> actores;

 

      
//  @ManyToMany(targetEntity = Genero.class,
//                cascade = CascadeType.ALL )
//    private Set<Genero> genero2;

    public Pelicula() {
    }

    public Pelicula(String titulo, String duracion, String sinopsis, String imagen, Date anno, Pais idPais) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.imagen = imagen;
        this.anno = anno;
        this.idPais = idPais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getAnno() {
        return anno;
    }

    public void setAnno(Date anno) {
        this.anno = anno;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    //@JsonBackReference
    public Set<Genero> getGenero() {
        return generos;
    }

    public void setGenero(Set<Genero> genero) {
        this.generos = genero;
    }
    
    //@JsonBackReference
    public Set<Director> getDirector() {
        return director;
    }

    public void setDirector(Set<Director> director) {
        this.director = director;
    }

    public Set<Actor> getActor() {
        return actores;
    }

    public void setActor(Set<Actor> actor) {
        this.actores = actor;
    }

  
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return (Objects.equals(id, pelicula.id) && Objects.equals(titulo, pelicula.titulo)
                && Objects.equals(duracion, pelicula.duracion) && Objects.equals(sinopsis, pelicula.sinopsis)
                 && Objects.equals(imagen, pelicula.imagen) && Objects.equals(anno, pelicula.anno) && Objects.equals(idPais, pelicula.idPais));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo,duracion,sinopsis,imagen,anno,idPais);
    }
}
