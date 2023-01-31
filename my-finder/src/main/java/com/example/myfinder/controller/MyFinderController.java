package com.example.myfinder.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/my-finder")
public class MyFinderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${my-movie.api}")
    private String myMovieApi;

    @GetMapping("/films")
    public ResponseEntity<List<Film>> getAllFilms() {
        try {
            ResponseEntity<List<Film>> response = restTemplate.exchange(
                    myMovieApi + "/films",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Film>>() {}
            );
            return response;
        } catch (Exception e) {
            return handleFailure();
        }
    }

    private ResponseEntity<List<Film>> handleFailure() {
        // return fallback response or message indicating service is unavailable
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
    }
}

