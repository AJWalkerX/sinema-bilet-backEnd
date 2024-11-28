package com.ajwalker.controller;
import com.ajwalker.service.MovieSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ajwalker.constants.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MOVIESESSION)
@CrossOrigin("*")
public class MovieSessionController {
	private final MovieSessionService movieSessionService;
	
	
	
}