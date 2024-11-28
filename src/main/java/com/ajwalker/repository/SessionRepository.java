package com.ajwalker.repository;

import com.ajwalker.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session,Long> {
	
	List<Session> findAllByCinemaId(Long cinemaId);
}