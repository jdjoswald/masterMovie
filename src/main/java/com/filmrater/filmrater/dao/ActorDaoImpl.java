/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;


import com.filmrater.filmrater.model.Actor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class ActorDaoImpl implements IActorDAO{
    
    @Autowired
    IActorJPA actorJPA;

    @Override
    public List<Actor> buscarTodos() {
        return actorJPA.findAll();    }

    @Override
    public Actor buscarPorId(Integer idActor) {
        
        Optional<Actor> optional = actorJPA.findById(idActor); 
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Actor guardarActor(Actor actor) {
        return actorJPA.save(actor);
    }

    @Override
    public void actualizarActor(Actor actor) {
        actorJPA.save(actor);
    }

    @Override
    public void eliminarActor(Integer idActor) {
        
        Actor act=this.buscarPorId(idActor);
        act.setIdPais(null);
       actorJPA.delete(act);
        //actualizarActor(); 
        //actorJPA.deleteById(idActor);
    }
    
}
