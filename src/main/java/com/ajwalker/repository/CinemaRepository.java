package com.ajwalker.repository;

import com.ajwalker.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
