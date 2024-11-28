package com.ajwalker.controller;

import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.Cinema;
import com.ajwalker.entity.Session;
import com.ajwalker.repository.SessionRepository;
import com.ajwalker.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ajwalker.constants.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(SESSION)
@CrossOrigin("*")
public class SessionController {
	private final SessionService sessionService;
	
	@GetMapping(FINDSESSIONSBYCINEMAID)
	public ResponseEntity<BaseResponse<List<Session>>> findSessionsByCinemaId(@RequestParam("cinemaId") Long cinemaId) {
		return ResponseEntity.ok(
				BaseResponse.<List<Session>>builder()
				            .code(200)
				            .success(true)
				            .data(sessionService.findSessionsByCinemaId(cinemaId))
				            .build()
		);
	}
}