/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.model;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joswald
 */
@Entity
@Table(name="Tbl_Rol")
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol", nullable = false)
    private Integer id;
    
    @Column(name = "rol", nullable = false, length = 150)
    private String rol;
    
    @OneToMany(mappedBy="idRol",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Usuario> usuarios;



    public Rol() {
    }

    public Rol(String rol) {
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol roll = (Rol) o;
        return (Objects.equals(id, roll.id) && Objects.equals(rol, roll.rol));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rol);
    }
    
}
