package com.example.mymovie.service;

import com.example.mymovie.movie.Film;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {
    private final List<Film> films;

    public FilmService(List<Film> films) {
        this.films = films;
    }

    public List<Film> getAllFilms() {
        return films;
    }

    public List<Film> getFilmsByTitle(String title) {
        return films.stream()
                .filter(film -> film.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Film> getFilmsByReleaseDate(Date date) {
        return films.stream()
                .filter(film -> film.getReleaseDate() == date)
                .collect(Collectors.toList());
    }
}

