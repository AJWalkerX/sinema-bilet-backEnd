package com.ajwalker.repository;

import com.ajwalker.entity.MovieSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieSessionRepository extends JpaRepository<MovieSession,Long> {
}
