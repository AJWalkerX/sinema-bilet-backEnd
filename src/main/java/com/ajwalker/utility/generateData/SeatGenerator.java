package com.ajwalker.utility.generateData;


import com.ajwalker.entity.Seat;
import com.ajwalker.repository.SeatRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor

public class SeatGenerator {

    private final SeatRepository seatRepository;

    @PostConstruct
    public void generateSeat(){
        if(seatRepository.findAll().isEmpty()){
            for(char i = 'a';i<'g';i++){
                for(int j=1;j<=14;j++){
                    Seat seat = Seat.builder()
                            .no(j)
                            .letter(String.valueOf(i))
                            .isFull(false)
                            .build();
                    seatRepository.save(seat);
                }
            }
        }
    }

}
