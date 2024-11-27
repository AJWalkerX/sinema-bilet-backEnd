package com.ajwalker.utility.generateData;

import com.ajwalker.entity.Session;

import java.util.ArrayList;
import java.util.List;

public class SessionGenerator {

    public static List<Session> generateSessions() {
        Session session1 = Session.builder().sessionName("Salon 1").cinemaId(1L).build();
        Session session2 = Session.builder().sessionName("Salon 2").cinemaId(1L).build();
        Session session3 = Session.builder().sessionName("Salon 3").cinemaId(1L).build();
        Session session4 = Session.builder().sessionName("Salon 1").cinemaId(2L).build();
        Session session5 = Session.builder().sessionName("Salon 2").cinemaId(2L).build();
        Session session6 = Session.builder().sessionName("Salon 3").cinemaId(2L).build();
        Session session7 = Session.builder().sessionName("Salon 1").cinemaId(3L).build();
        Session session8 = Session.builder().sessionName("Salon 2").cinemaId(3L).build();
        Session session9 = Session.builder().sessionName("Salon 3").cinemaId(3L).build();
        return List.of(session1, session2, session3, session4, session5, session6, session7, session8, session9);

    }
}
