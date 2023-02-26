package com.filmrater.filmrater;

import com.filmrater.filmrater.model.Actor;
import com.filmrater.filmrater.model.Director;
import com.filmrater.filmrater.model.Genero;
import com.filmrater.filmrater.model.Pais;
import com.filmrater.filmrater.model.Rol;
import com.filmrater.filmrater.service.IActorService;
import com.filmrater.filmrater.service.IDirectorService;
import com.filmrater.filmrater.service.IGeneroService;
import com.filmrater.filmrater.service.IPaisService;
import com.filmrater.filmrater.service.IRolService;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmraterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmraterApplication.class, args);
	}
         @Bean
      InitializingBean sendDatabase() {
         
        return () -> {
            
            
        };
      } 
      
      
        @Bean
    public CommandLineRunner mappingDemo(IRolService rolService,
                                         IPaisService paisService,
                                         IGeneroService generoSerice,
                                         IDirectorService directorSerice,
                                         IActorService actorService) {
        return args -> {

           
            
            /*
            rolService.guardarRol(new Rol("Admin"));
            rolService.guardarRol(new Rol("USer"));
            
            paisService.guardarPais(new Pais("RepDom"));
            paisService.guardarPais(new Pais("españa"));
            generoSerice.guardarGenero(new Genero("Accion"));
            generoSerice.guardarGenero(new Genero("Comedia"));
            generoSerice.guardarGenero(new Genero("Terror"));
            generoSerice.guardarGenero(new Genero("Romance"));
            directorSerice.guardarDirector(new Director("director de prueba"));
            directorSerice.guardarDirector(new Director("director de prueba2"));
            
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998");  
            Pais pais=new Pais("prueba");
            Actor actor=new Actor( "nombre",date1 ,pais );
            
            actorService.guardarActor(actor);*/
            
           
         

       
           
        };
    }

}
