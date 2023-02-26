/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.model.Rol;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IRolService {
    List<Rol> buscarTodos();
    Rol buscarPorId(Integer idRol);
    boolean guardarRol(Rol rol);
    void actualizarRol(Rol rol);
    boolean eliminarRol(Integer idRol);
    
    
}
