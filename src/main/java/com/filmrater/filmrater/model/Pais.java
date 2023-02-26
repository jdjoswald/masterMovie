/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.model;




import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Objects;

/**
 *
 * @author joswald
 */
@Entity
@Table(name="Tbl_Pais")
public class Pais {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idPais")
    private Integer id;
    
    @Column(name = "pais", nullable = false, length = 150)
    private String pais;
    
    @OneToMany(mappedBy="idPais",
           cascade = CascadeType.ALL
          )
    private List<Actor> actores;
    
    @OneToMany(mappedBy="idPais",
            cascade = CascadeType.ALL
            )
    private List<Pelicula> pelicula;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais paiss = (Pais) o;
        return (Objects.equals(id, paiss.id) && Objects.equals(pais, paiss.pais));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,pais);
    }
    
    
}
