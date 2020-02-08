package com.rest.demo.service;

import com.rest.demo.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository("MyMovieService")
public class MyMovieServiceImpl implements MyMovieService {
    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Movie> findMovieByName(String movieName) {
        return entityManager.createQuery("SELECT M FROM Movie M WHERE M.movieName LIKE:name")
                .setParameter("name", movieName+"%")
                .getResultList();
    }

}
