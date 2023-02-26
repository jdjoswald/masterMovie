/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Actor;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IActorDAO {
    List<Actor> buscarTodos();
    Actor buscarPorId(Integer idActor);
    Actor guardarActor(Actor actor);
    void actualizarActor(Actor actor);
    void eliminarActor(Integer idActor);
    
}
