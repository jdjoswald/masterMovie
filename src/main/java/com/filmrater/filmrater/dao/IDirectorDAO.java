/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Director;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IDirectorDAO {
    List<Director> buscarTodos();
    Director buscarPorId(Integer idDirector);
    Director guardarDirector(Director director);
    void actualizarDirector(Director director);
    void eliminarDirector(Integer idDirector);
    
}
