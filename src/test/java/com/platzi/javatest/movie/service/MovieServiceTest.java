package com.platzi.javatest.movie.service;

import com.platzi.javatest.movie.data.MovieRepository;
import com.platzi.javatest.movie.model.Genre;
import com.platzi.javatest.movie.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MovieServiceTest {

    MovieService movieService;

    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION),
                        new Movie(8, "Superman", 120, Genre.THRILLER)

                )
        );
        movieService = new MovieService(movieRepository);


    }

    @Test
    public void return_movies_by_genre() {



        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);


        assertThat(getMoviesId(movies), is(Arrays.asList(3,6)));
    }


    @Test
    public void return_movies_by_lenght(){
        Collection<Movie> movies = movieService.findMovieByLenght(119);
        assertThat(getMoviesId(movies), is(Arrays.asList(2,3,4,5,6)));
    }

    @Test
    public void return_movies_by_name(){
        Collection<Movie> movies = movieService.findByName("super");
        assertThat(getMoviesId(movies), is(Arrays.asList(4,8)));
    }

    private static List<Integer> getMoviesId(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }


}