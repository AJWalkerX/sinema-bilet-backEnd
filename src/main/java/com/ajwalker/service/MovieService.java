package com.ajwalker.service;


import com.ajwalker.entity.Movie;
import com.ajwalker.exceptions.ErrorType;
import com.ajwalker.exceptions.SinemaBiletException;
import com.ajwalker.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    public Movie getMovieById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            return movie.get();
        }
        throw new SinemaBiletException(ErrorType.MOVIE_NOT_FOUND);
    }
}
