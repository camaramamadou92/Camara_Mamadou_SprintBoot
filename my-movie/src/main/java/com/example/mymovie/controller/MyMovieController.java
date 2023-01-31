package com.example.mymovie.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.example.mymovie.movie.Actor;
import com.example.mymovie.movie.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "My Movie API", description = "API pour la gestion des films et des acteurs")
public class MyMovieController {

    private List<Film> films;
    private List<Actor> actors;

    @ApiOperation(value = "Obtenir tous les films ou filtrer par titre ou année de sortie")
    @GetMapping("/films")
    public List<Film> getFilms(@ApiParam(value = "Filtrer par titre")
            @RequestParam(required = false) String title,
                               @ApiParam(value = "Filtrer par année de sortie")
                               @RequestParam(required = false) Integer releaseYear) {
        if (title != null) {
            return films.stream()
                    .filter(film -> film.getTitle().equals(title))
                    .collect(Collectors.toList());
        }
        if (releaseYear != null) {
            return films.stream()
                    .filter(film -> film.getReleaseDate().getYear() == releaseYear)
                    .collect(Collectors.toList());
        }
        return films;
    }
    @ApiOperation(value = "Obtenir tous les acteurs ou filtrer par nom")
    @GetMapping("/actors")
    public List<Actor> getActors(@ApiParam(value = "Filtrer par nom")
            @RequestParam(required = false) String name) {
        if (name != null) {
            return actors.stream()
                    .filter(actor -> actor.getName().equals(name))
                    .collect(Collectors.toList());
        }
        return actors;
    }

}

