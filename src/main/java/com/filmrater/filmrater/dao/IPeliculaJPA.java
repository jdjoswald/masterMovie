/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Pelicula;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author joswald
 */
public interface IPeliculaJPA extends JpaRepository<Pelicula, Integer>{
    
     List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
    
}
