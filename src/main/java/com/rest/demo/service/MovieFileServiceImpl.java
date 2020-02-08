package com.rest.demo.service;

import com.rest.demo.dao.MovieFileDAO;
import com.rest.demo.entity.MovieFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("MovieFileService")
public class MovieFileServiceImpl implements MovieFileService {
    @Autowired
    private MovieFileDAO movieFileDAO;


    @Override
    public List<MovieFile> findAllMovieFiles() {
        return movieFileDAO.findAll();
    }

    @Override
    public MovieFile findMovieById(int movieId) {
        return movieFileDAO.findById(movieId).get();
    }

    @Override
    public void saveMovie(MovieFile movie) {
        movieFileDAO.save(movie);
    }

    @Override
    public void deleteMovie(int movieId) {
        movieFileDAO.delete(findMovieById(movieId));
    }
}
