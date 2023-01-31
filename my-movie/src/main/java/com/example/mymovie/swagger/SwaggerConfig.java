package com.example.mymovie.swagger;

import com.example.mymovie.movie.Actor;
import com.example.mymovie.movie.Film;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @ApiModelProperty(notes = "Titre du film")
    private String title;
    @ApiModelProperty(notes = "Réalisateur du film")
    private String director;
    @ApiModelProperty(notes = "Acteur principal du film")
    private Actor leadActor;
    @ApiModelProperty(notes = "Date de sortie du film")
    private LocalDate releaseDate;
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}

