package com.ajwalker.controller;

import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.Movie;
import com.ajwalker.entity.Seat;
import com.ajwalker.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(FINDBYIDMOVIE)
    public ResponseEntity<BaseResponse<Movie>> getMovieById(@RequestParam Long id) {
        return ResponseEntity.ok(BaseResponse.<Movie>builder()
                .code(200)
                .success(true)
                .message("FİLMLER")
                .data(movieService.getMovieById(id))
                .build());
    }

}
