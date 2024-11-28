package com.ajwalker.utility.generateData;


import com.ajwalker.entity.*;
import com.ajwalker.repository.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataGenerator {

    private final SeatRepository seatRepository;
    private final MovieRepository movieRepository;
    private final MovieGenreRepository movieGenreRepository;
    private final CinemaRepository cinemaRepository;
    private final SessionRepository sessionRepository;
    private final MovieSessionRepository movieSessionRepository;

    @PostConstruct
    public void dataGenerator(){


        //sinema özdilek vs.
        if(cinemaRepository.findAll().isEmpty()){
            List<Cinema> cinemaList = CinemaGenerator.generateCinema();
            cinemaRepository.saveAll(cinemaList);
        }
//        sessions
        if(sessionRepository.findAll().isEmpty()){
            List<Session> sessionList = SessionGenerator.generateSessions();
            sessionRepository.saveAll(sessionList);
        }
        //seats
        if(seatRepository.findAll().isEmpty()){
            seatRepository.saveAll(SeatGenerator.generateSeats());
        }
//        movieSession
        if(movieSessionRepository.findAll().isEmpty()){
            List<MovieSession> movieSessionList = MovieSessionGenerator.generateMovieSessions();
            movieSessionRepository.saveAll(movieSessionList);
        }

        //movie
        if (movieRepository.count() == 0) {
            movieRepository.saveAll(MovieGenerator.generateMovies());

        }
        //movieGenres
        if (movieGenreRepository.count() == 0) {
            movieGenreRepository.saveAll(MovieGenresGenerator.generateMovieGenres());
        }
    }

}
