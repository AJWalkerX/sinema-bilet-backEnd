package com.ajwalker.service;

import com.ajwalker.entity.Session;
import com.ajwalker.repository.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionService {
	private final SessionRepository sessionRepository;
	
	
	public List<Session> findSessionsByCinemaId(Long cinemaId) {
		return sessionRepository.findAllByCinemaId(cinemaId);
	}
}