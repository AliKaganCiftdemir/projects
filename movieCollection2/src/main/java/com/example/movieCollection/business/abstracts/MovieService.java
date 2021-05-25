package com.example.movieCollection.business.abstracts;

import java.util.List;

import com.example.movieCollection.entities.concretes.Movie;

public interface MovieService {

	void saveMovie(Movie movie);
	void deleteMovie(int id);
	List<Movie> getAllMovies();
	List<Movie> movieSearchByNameAndGenre(String keyword);
	Movie getMovieById(int id);
	List<Movie> getAllOrderedMovies();
	
}
