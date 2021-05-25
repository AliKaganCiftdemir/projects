package com.example.movieCollection.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int movieId;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "movie_description")
	private String movieDescription;
	
	@Column(name = "movie_genre")
	private String movieGenre;
	
	@Column(name = "movie_year_of_publication")
	private Date movieYearOfPublication;
	
	@Column(name = "movie_language")
	private String movieLanguage;
	
	@Column(name = "movie_media")
	private String movieMedia;
	
	public Movie() {
		
	}

	public Movie(int movieId, String movieName, String movieDescription, String movieGenre,
			Date movieYearOfPublication, String movieLanguage, String movieMedia) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.movieGenre = movieGenre;
		this.movieYearOfPublication = movieYearOfPublication;
		this.movieLanguage = movieLanguage;
		this.movieMedia = movieMedia;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public Date getMovieYearOfPublication() {
		return movieYearOfPublication;
	}

	public void setMovieYearOfPublication(Date movieYearOfPublication) {
		this.movieYearOfPublication = movieYearOfPublication;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieMedia() {
		return movieMedia;
	}

	public void setMovieMedia(String movieMedia) {
		this.movieMedia = movieMedia;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDescription=" + movieDescription
				+ ", movieGenre=" + movieGenre + ", movieYearOfPublication=" + movieYearOfPublication
				+ ", movieLanguage=" + movieLanguage + ", movieMedia=" + movieMedia + "]";
	}
}
