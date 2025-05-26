package com.example.MovieReview.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieReview.model.Movie;

public interface MovieInterface extends JpaRepository<Movie, Long> {
    // This interface will automatically provide CRUD operations for the Movie
    // entity
    // Additional custom query methods can be defined here if needed

}
