package com.ajwalker.service;

import com.ajwalker.entity.Seat;
import com.ajwalker.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {
    private final SeatRepository seatRepository;

    public List<Seat> getAllSeats(){
        return seatRepository.findAllByOrderByLetterAscNoAsc();
    }

}
