package com.ajwalker.service;

import com.ajwalker.repository.MovieSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieSessionService {
	private final MovieSessionRepository movieSessionRepository;
	
}