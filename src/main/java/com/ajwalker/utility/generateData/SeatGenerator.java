package com.ajwalker.utility.generateData;

import com.ajwalker.entity.Seat;

import java.util.ArrayList;
import java.util.List;

public class SeatGenerator {
    public static List<Seat> generateSeats(){
        List<Seat> seats = new ArrayList<Seat>();
        for (long k = 1; k <= 9; k++) {
            for(char i = 'a';i<'g';i++){
                for(int j=1;j<=14;j++){
                    Seat seat = Seat.builder()
                            .seatNo(i + " "+ j)
                            .sessionId(k)
                            .isFull(false)
                            .build();
                    seats.add(seat);
                }
            }
        }
        return seats;
    }
}
