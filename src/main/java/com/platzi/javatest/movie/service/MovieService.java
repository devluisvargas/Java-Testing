package com.platzi.javatest.movie.service;

import com.platzi.javatest.movie.data.MovieRepository;
import com.platzi.javatest.movie.model.Genre;
import com.platzi.javatest.movie.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    public MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll()
                .stream()
                .filter(movie->movie.getGenre()==genre)
                .collect(Collectors.toList());
    }

    public Collection<Movie> findByName(String name){
        return movieRepository.findAll().stream()
                .filter(movie->movie.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Collection<Movie> findMovieByLenght(int duration) {
        return movieRepository.findAll()
                .stream()
                .filter(movie -> movie.getMinutes()<=duration)
                .collect(Collectors.toList());
    }
}
