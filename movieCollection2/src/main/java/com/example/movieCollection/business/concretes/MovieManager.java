package com.example.movieCollection.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieCollection.business.abstracts.MovieService;
import com.example.movieCollection.dataAccess.abstracts.MovieDao;
import com.example.movieCollection.entities.concretes.Movie;

@Service
public class MovieManager implements MovieService{

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public void saveMovie(Movie movie) {
		movieDao.save(movie);
	}

	@Override
	public void deleteMovie(int id) {
		movieDao.deleteById(id);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieDao.findAll();
	}

	@Override
	public Movie getMovieById(int id) {
		return movieDao.findById(id).get();
	}

	@Override
	public List<Movie> movieSearchByNameAndGenre(String keyword) {
		return movieDao.findMoviesByKeyword(keyword);
	}

	@Override
	public List<Movie> getAllOrderedMovies() {
		return movieDao.getOrderedMovies();
	}
}
