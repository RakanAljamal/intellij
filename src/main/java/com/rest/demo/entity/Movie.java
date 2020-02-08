package com.rest.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_description")
    private String movieDescription;
    @Column(name = "movie_photo")
    private String moviePhoto;

    @Column(name = "movie_youtube")
    private String movieYoutube;

    public Movie() {
    }

    public Movie(String movieName, String movieDescription, String moviePhoto, String movieYoutube) {
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.moviePhoto = moviePhoto;
        this.movieYoutube = movieYoutube;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMoviePhoto() {
        return moviePhoto;
    }

    public void setMoviePhoto(String moviePhoto) {
        this.moviePhoto = moviePhoto;
    }

    public String getMovieYoutube() {
        return movieYoutube;
    }

    public void setMovieYoutube(String movieYoutube) {
        this.movieYoutube = movieYoutube;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", moviePhoto='" + moviePhoto + '\'' +
                ", movieYoutube='" + movieYoutube + '\'' +
                '}';
    }
}
