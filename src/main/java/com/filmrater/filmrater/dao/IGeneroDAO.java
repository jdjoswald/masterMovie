/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Genero;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IGeneroDAO {
    List<Genero> buscarTodos();
    Genero buscarPorId(Integer idGenero);
    Genero guardarGenero(Genero genero);
    void actualizarGenero(Genero genero);
    void eliminarGenero(Integer idGenero);
}
