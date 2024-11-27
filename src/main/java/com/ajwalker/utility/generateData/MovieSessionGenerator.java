package com.ajwalker.utility.generateData;

import com.ajwalker.entity.ESessionHours;
import com.ajwalker.entity.MovieSession;

import java.util.ArrayList;
import java.util.List;

public class MovieSessionGenerator {

    public static List<MovieSession> generateMovieSessions(){
        List<MovieSession> movieSessions = new ArrayList<>();

        // Enum değerlerini alıyoruz
        ESessionHours[] sessionHours = ESessionHours.values();

        // movieId 1'den 9'a kadar
        for (long movieId = 1; movieId <= 10; movieId++) {
            // sessionId 1'den 9'a kadar
            for (long sessionId = 1; sessionId <= 9; sessionId++) {
                // Her oturum saatini kullanarak MovieSession nesnesi oluştur
                for (ESessionHours sessionHour : sessionHours) {
                    MovieSession movieSession = MovieSession.builder()
                            .sessionHours(sessionHour)
                            .movieId(movieId)
                            .sessionId(sessionId)
                            .build();
                    movieSessions.add(movieSession);
                }
            }
        }
    return movieSessions;

    }
}
