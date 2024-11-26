package com.ajwalker.repository;

import com.ajwalker.entity.MovieGenres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieGenreRepository extends JpaRepository<MovieGenres,Long> {
}
