package com.ajwalker.dto.response;

import com.ajwalker.entity.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class MovieResponse {
   Long id;
   String movieName;
   List<ESessionHours> hours;
   List<Seat> seats;
   String cinemaName;
}
