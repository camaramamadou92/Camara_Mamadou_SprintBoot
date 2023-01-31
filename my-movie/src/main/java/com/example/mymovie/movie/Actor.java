package com.example.mymovie.movie;

import java.util.Date;
import java.util.List;


public class Actor {
    private String name;
    private String firstName;
    private Date dateOfBirth;
    private Filmography filmography;

    // getters and setters for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Filmography getFilmography() {
        return filmography;
    }

    public void setFilmography(Filmography filmography) {
        this.filmography = filmography;
    }
}





}


