/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Pelicula;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IPeliculaDAO {
    
    List<Pelicula> buscarTodos();
    Pelicula buscarPorId(Integer idPelicula);
    List<Pelicula> buscarPorTitulo(String titulo);
    void guardarPelicula(Pelicula pelicula);
    Pelicula actualizarPelicula(Pelicula pelicula);
    void eliminarPelicula(Integer idPelicula);
}
