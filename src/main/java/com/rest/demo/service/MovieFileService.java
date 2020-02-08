package com.rest.demo.service;

import com.rest.demo.entity.MovieFile;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieFileService {
    public List<MovieFile> findAllMovieFiles();

    public MovieFile findMovieById(int movieId);

    public void saveMovie(MovieFile movie);

    public void deleteMovie(int movieId);

}
