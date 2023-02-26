/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author joswald
 */
@Entity
@Table(name="Tbl_genero")
//@JsonIgnoreProperties("generos")

public class Genero {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGenero", nullable = false)
    private Integer id;
    
    @Column(name = "genero", nullable = false, length = 150)
    private String genero;
    
    @ManyToMany(mappedBy = "generos", 
                fetch = FetchType.LAZY, 
                cascade = CascadeType.ALL)
    @JsonBackReference
    Set<Pelicula> peliculas;
    
//    
//    

//  @ManyToMany(targetEntity = Pelicula.class, 
//                mappedBy = "genero2", 
//                cascade = CascadeType.ALL, 
//                fetch = FetchType.LAZY)
//    private Set<Pelicula> peliculas2;

    public Genero() {
    }

    public Genero(String genero) {
        this.genero = genero;
    }

    
    public Set<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return (Objects.equals(id, genero.id) && Objects.equals(genero, genero.genero));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, genero);
    }
    
}
