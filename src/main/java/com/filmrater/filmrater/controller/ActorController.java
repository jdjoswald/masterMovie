/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import com.filmrater.filmrater.model.Actor;
import com.filmrater.filmrater.model.Pelicula;
import com.filmrater.filmrater.service.IActorService;
import com.filmrater.filmrater.service.IPaisService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joswald
 */
@RestController
@RequestMapping("actor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ActorController {
    @Autowired
    IActorService actorService;
     @Autowired
    IPaisService paisService;
    
   
    
    @GetMapping("/all")
    public List<Actor> buscarTodos() {
        return actorService.buscarTodos();
    }
    @GetMapping("/actor/{id}")
    public Actor actorPorId(@PathVariable("id") Integer id) {
        return actorService.buscarPorId(id);
    }
    
     @GetMapping("/actorpeliculas/{id}")
    public Set<Pelicula> peliculasdelactor(@PathVariable("id") Integer id) {
        Actor actor= actorService.buscarPorId(id);
        return actor.getPeliculas();
    }
    
    @PostMapping("/save")
    public Actor guardarActor(@RequestBody Actor actor){
        var pais=actor.getIdPais();
        actor.setIdPais(paisService.buscarPorId(pais.getId()));
        return actorService.guardarActor(actor);
    }
    @PutMapping("/update")
    public Actor editarActor(@RequestBody Actor actor){
        var pais=actor.getIdPais();
        actor.setIdPais(paisService.buscarPorId(pais.getId()));
        return actorService.guardarActor(actor);
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarCurso(@PathVariable("id") Integer id) {
    return String.valueOf(actorService.eliminarActor(id));
    }

    
}
