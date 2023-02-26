/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.dao.IActorDAO;
import com.filmrater.filmrater.model.Actor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joswald
 */
@Service
public class ActorServiceImpl implements IActorService{
    
    @Autowired
    IActorDAO actorDao;

    @Override
    public List<Actor> buscarTodos() {
    return actorDao.buscarTodos();
    }

    @Override
    public Actor buscarPorId(Integer idActor) {
        return actorDao.buscarPorId(idActor);
        
    }

    @Override
    public Actor guardarActor(Actor actor) {
        return actorDao.guardarActor(actor);
        
    }

    @Override
    public void actualizarActor(Actor actor) {
         actorDao.actualizarActor(actor);
        
    }

    @Override
    public boolean eliminarActor(Integer idActor) {
        
        
        if(actorDao.buscarPorId(idActor)!= null){
            actorDao.eliminarActor(idActor);
            return true;
        }
        return false;
        
    }
    
}
