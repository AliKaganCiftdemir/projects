package com.example.movieCollection.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.movieCollection.entities.concretes.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

	@Query(value="SELECT * FROM movies m WHERE m.movie_name LIKE %:keyword% OR m.movie_genre LIKE %:keyword%", nativeQuery=true)
	List<Movie> findMoviesByKeyword(@Param("keyword") String keyword);	
	
	@Query(value="SELECT * FROM movies m ORDER BY m.movie_year_of_publication ASC", nativeQuery=true)
	List<Movie> getOrderedMovies();

}
