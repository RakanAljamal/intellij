package com.rest.demo.service;

import com.rest.demo.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {
    public List<Movie> findAllMovies();

    public Movie findMovieById(int movieId);

    public void saveMovie(Movie movie);

    public void deleteMovie(int movieId);

    public Page<Movie> findAllByPage(Pageable page);
}
