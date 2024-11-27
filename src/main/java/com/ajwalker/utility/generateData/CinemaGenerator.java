package com.ajwalker.utility.generateData;

import com.ajwalker.entity.Cinema;

import java.util.List;

public class CinemaGenerator {

    public static List<Cinema> generateCinema(){
        Cinema cinema1 = Cinema.builder()
                .cinemaName("Cinetime Özdilek Eskişehir")
                .build();
        Cinema cinema2 = Cinema.builder()
                .cinemaName("Eskişehir Kanatlı Cinemapink")
                .build();
        Cinema cinema3 = Cinema.builder()
                .cinemaName("Eskişehir Prestige")
                .build();
        return List.of(cinema1, cinema2, cinema3);
    }
}
