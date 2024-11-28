package com.ajwalker.service;

import com.ajwalker.entity.Cinema;
import com.ajwalker.repository.CinemaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CinemaService {
	private final CinemaRepository cinemaRepository;
	
	
	public List<Cinema> getAllCinema() {
		return cinemaRepository.findAll();
		
	}
	
}