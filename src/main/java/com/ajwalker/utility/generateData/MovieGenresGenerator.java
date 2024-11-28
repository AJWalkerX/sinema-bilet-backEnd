package com.ajwalker.utility.generateData;

import com.ajwalker.entity.MovieGenres;

import java.util.List;

public class MovieGenresGenerator {
    public static List<MovieGenres> generateMovieGenres() {
            MovieGenres gladyetor2genre1 = MovieGenres.builder()
                    .movieId(1L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres gladyetor2genre2 = MovieGenres.builder()
                    .movieId(1L)
                    .genre("Dram")
                    .build();
            MovieGenres gladyetor2genre3 = MovieGenres.builder()
                    .movieId(1L)
                    .genre("Macera")
                    .build();
//
            MovieGenres robotGenre1 = MovieGenres.builder()
                    .movieId(2L)
                    .genre("Animasyon")
                    .build();
            MovieGenres robotGenre2 = MovieGenres.builder()
                    .movieId(2L)
                    .genre("Bilim Kurgu")
                    .build();
            MovieGenres robotGenre3 = MovieGenres.builder()
                    .movieId(2L)
                    .genre("Aile")
                    .build();
//
            MovieGenres cumhuriyetSarkisiGenre1 = MovieGenres.builder()
                    .movieId(3L)
                    .genre("Dram")
                    .build();
            MovieGenres cumhuriyetSarkisiGenre2 = MovieGenres.builder()
                    .movieId(3L)
                    .genre("Tarih")
                    .build();
//
            MovieGenres meclisGenre1 = MovieGenres.builder()
                    .movieId(4L)
                    .genre("Komedi")
                    .build();
//
            MovieGenres siyahKanaryaGenre1 = MovieGenres.builder()
                    .movieId(5L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres siyahKanaryaGenre2 = MovieGenres.builder()
                    .movieId(5L)
                    .genre("Dram")
                    .build();
//
            MovieGenres genisAlie4Genre1 = MovieGenres.builder()
                    .movieId(6L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres genisAlie4Genre2 = MovieGenres.builder()
                    .movieId(6L)
                    .genre("Komedi")
                    .build();
//
            MovieGenres venomGenre1 = MovieGenres.builder()
                    .movieId(7L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres venomGenre2 = MovieGenres.builder()
                    .movieId(7L)
                    .genre("Macera")
                    .build();
            MovieGenres venomGenre3 = MovieGenres.builder()
                    .movieId(7L)
                    .genre("Bilim Kurgu")
                    .build();
//
            MovieGenres kurtGenre1 = MovieGenres.builder()
                    .movieId(8L)
                    .genre("Animasyon")
                    .build();
//
            MovieGenres cille2069Genre1 = MovieGenres.builder()
                    .movieId(9L)
                    .genre("Animasyon")
                    .build();
//
            MovieGenres terrifier3genre1 = MovieGenres.builder()
                    .movieId(10L)
                    .genre("Korku")
                    .build();

            return List.of(gladyetor2genre1,gladyetor2genre2,gladyetor2genre3,robotGenre1,robotGenre2,robotGenre3,
                    cumhuriyetSarkisiGenre1,cumhuriyetSarkisiGenre2,meclisGenre1,siyahKanaryaGenre1,siyahKanaryaGenre2
                    ,genisAlie4Genre1,genisAlie4Genre2,venomGenre1,venomGenre2,venomGenre3,kurtGenre1,cille2069Genre1, terrifier3genre1);
        }
}
