package com.example.mymovie.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.example.mymovie.movie.Actor;
import com.example.mymovie.movie.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyMovieController {

    private List<Film> films;
    private List<Actor> actors;

    @GetMapping("/films")
    public List<Film> getFilms(@RequestParam(required = false) String title,
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

    @GetMapping("/actors")
    public List<Actor> getActors(@RequestParam(required = false) String name) {
        if (name != null) {
            return actors.stream()
                    .filter(actor -> actor.getName().equals(name))
                    .collect(Collectors.toList());
        }
        return actors;
    }
}

