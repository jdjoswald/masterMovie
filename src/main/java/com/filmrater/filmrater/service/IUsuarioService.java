/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.model.Usuario;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IUsuarioService {
    List<Usuario> buscarTodos();
    Usuario buscarPorId(Integer idUsuario);
    Usuario guardarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    boolean eliminarUsuario(Integer idUsuario);
    
}
