package com.rest.demo.service;

import com.rest.demo.entity.Movie;

import java.util.List;

public interface MyMovieService {
    List<Movie> findMovieByName(String movieName);
}
