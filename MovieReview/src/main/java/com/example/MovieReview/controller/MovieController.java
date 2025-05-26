package com.example.MovieReview.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.MovieReview.model.Movie;
import com.example.MovieReview.service.MovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie/details")
    public List<Movie> getMovieDetails() {
        return movieService.getMovies();

    }

    @PostMapping("/movie/add")
    public String addMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @DeleteMapping("/movie/delete/{id}")
    public String deleteMovie(@PathVariable Long id) {
        return movieService.deleteMovie(id);
    }

    @GetMapping("/movie/get/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

}
