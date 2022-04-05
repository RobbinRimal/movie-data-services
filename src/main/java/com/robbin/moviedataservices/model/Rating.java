package com.robbin.moviedataservices.model;

public class Rating {
    private String movieId;
    private Double rating;

    public Rating() {
    }

    public Rating(String movieId, Double rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public Rating setMovieId(String movieId) {
        this.movieId = movieId;
        return this;
    }

    public Double getRating() {
        return rating;
    }

    public Rating setRating(Double rating) {
        this.rating = rating;
        return this;
    }
}
