/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Usuario;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IUsuarioDAO {
    
    List<Usuario> buscarTodos();
    Usuario buscarPorId(Integer idUsuario);
    void guardarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    void eliminarUsuario(Integer idUsuario);
    
}
