/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.service;

import java.util.List;
import com.filmrater.filmrater.model.Pais;

/**
 *
 * @author joswald
 */

public interface IPaisService {
    List<Pais> buscarTodos();
    Pais buscarPorId(Integer idPais);
    Pais guardarPais(Pais pais);
    void actualizarPais(Pais pais);
    boolean eliminarPais(Integer idPais);
    
}
