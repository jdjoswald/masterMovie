/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author joswald
 */
public interface IUsuarioJPA extends JpaRepository<Usuario, Integer> {
    
}
