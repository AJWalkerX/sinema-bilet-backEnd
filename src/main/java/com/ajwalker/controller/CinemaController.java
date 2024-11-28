package com.ajwalker.controller;

import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.Cinema;
import com.ajwalker.service.CinemaService;
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
@RequestMapping(CINEMA)
@CrossOrigin("*")
public class CinemaController {
	private final CinemaService cinemaService;
	
	
	@GetMapping(GETALLCINEMA)
	public ResponseEntity<BaseResponse<List<Cinema>>> getAllCinema(){
		return ResponseEntity.ok(
				BaseResponse.<List<Cinema>>builder()
						.code(200)
						.success(true)
						.data(cinemaService.getAllCinema())
				            .build()
		);
	}
	
}