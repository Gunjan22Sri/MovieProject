package com.example.MovieReview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.MovieReview.dao.MovieInterface;
import com.example.MovieReview.model.Movie;

@Service
public class MovieService {

    @Autowired
    MovieInterface movieInterface;

    public String save(Movie movie) {
        try {
            return movieInterface.save(movie) != null ? "Created successfully" : "error occured";

        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<Movie> getMovies() {
        try {
            return movieInterface.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String deleteMovie(Long id) {
        try {
            movieInterface.deleteById(id);
            return "Deleted successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public Movie getMovieById(Long id) {
        try {

            return movieInterface.findById(id).orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
