package com.ajwalker.controller;

import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.Movie;
import com.ajwalker.entity.Seat;
import com.ajwalker.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ajwalker.constants.RestApis.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(MOVIE)
@CrossOrigin("*")

public class MovieController {

    private final MovieService movieService;

    @GetMapping(FINDALLMOVIE)
    public ResponseEntity<BaseResponse<List<Movie>>> getAllMovie() {
        return ResponseEntity.ok(BaseResponse.<List<Movie>>builder()
                .code(200)
                .success(true)
                .message("FİLMLER")
                .data(movieService.getAllMovies())
                .build());
    }

}
