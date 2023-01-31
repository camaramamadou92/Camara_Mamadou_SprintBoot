package com.example.mymovie.movie;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@ApiModel(description = "Détail de la classe Film")
public class Film {
    @ApiModelProperty(notes = "Titre du film")
    private String title;
    @ApiModelProperty(notes = "Réalisateur du film")
    private String director;
    @ApiModelProperty(notes = "Acteur principal du film")
    private Actor leadActor;
    @ApiModelProperty(notes = "Date de sortie du film")
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
