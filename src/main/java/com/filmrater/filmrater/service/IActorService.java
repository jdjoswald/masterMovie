/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.model.Actor;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IActorService {
    List<Actor> buscarTodos();
    Actor buscarPorId(Integer idActor);
    Actor guardarActor(Actor actor);
    void actualizarActor(Actor actor);
    boolean eliminarActor(Integer idActor);
    
}
