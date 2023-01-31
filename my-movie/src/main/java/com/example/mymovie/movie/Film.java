package com.example.mymovie.movie;

import java.util.Date;
import java.util.List;

public class Film {
    private String title;
    private String director;
    private Actor leadActor;
    private Date releaseDate;

    // getters and setters for each field

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Actor getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(Actor leadActor) {
        this.leadActor = leadActor;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", leadActor=" + leadActor +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
