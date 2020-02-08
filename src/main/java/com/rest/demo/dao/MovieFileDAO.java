package com.rest.demo.dao;

import com.rest.demo.entity.MovieFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieFileDAO extends JpaRepository<MovieFile,Integer> {
}
