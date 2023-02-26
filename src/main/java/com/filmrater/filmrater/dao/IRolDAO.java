/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Rol;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IRolDAO {
    List<Rol> buscarTodos();
    Rol buscarPorId(Integer idRol);
    void guardarRol(Rol rol);
    void actualizarRol(Rol rol);
    void eliminarRol(Integer idRol);
    
}
