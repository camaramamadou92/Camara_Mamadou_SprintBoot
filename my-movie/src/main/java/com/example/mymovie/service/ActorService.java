package com.example.mymovie.service;

import com.example.mymovie.movie.Actor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorService {
    private final List<Actor> actors;

    public ActorService(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> getAllActors() {
        return actors;
    }

    public List<Actor> getActorsByName(String name) {
        return actors.stream()
                .filter(actor -> actor.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public void updateActor(String name, Actor actor) {
        int index = actors.indexOf(actors.stream().filter(a -> a.getName().equalsIgnoreCase(name)).findFirst().get());
    }
}

