package com.example.movieCollection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.movieCollection.business.abstracts.MovieService;
import com.example.movieCollection.entities.concretes.Movie;

@Controller
public class MovieController {
 
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
	public String viewHomePage(@ModelAttribute("actorName") String actorName, Model model) {
		List<Movie> list = movieService.getAllMovies();
		for (Movie movie : list) {
			System.out.println(movie);
		}
		model.addAttribute("listMovies", list);
		return "index";
	}
	
	@GetMapping("/showNewMovieForm")
	public String showNewMovieForm(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "new_movie";
	}
	
	@PostMapping("/saveMovie")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		movieService.saveMovie(movie);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForEdit/{movieId}")
	public String showFormForEdit(@PathVariable (value = "movieId") int movieId, Model model) {
		Movie movie = movieService.getMovieById(movieId);
		model.addAttribute("movie", movie);
		return "edit_movie";
	}
	
	@GetMapping("/deleteMovie/{movieId}")
	public String deleteMovie(@PathVariable(value = "movieId") int movieId) {
		this.movieService.deleteMovie(movieId);
		return "redirect:/";
	}
	
	@GetMapping("/showNewSearchResult")
	public String showSearchResult(@ModelAttribute("keyword") String keyword, Model model) {
		List<Movie> list = movieService.movieSearchByNameAndGenre(keyword);
		model.addAttribute("listMovies", movieService.getAllMovies());
		if (keyword != null) {
			model.addAttribute("listMovies", list);	
		}
		return "search_result";
	}
	
	@GetMapping("/movieList")
	public String movieList(Model model) {	
		List<Movie> list =  movieService.getAllOrderedMovies();
		model.addAttribute("listMovies", list);
		return "movie_list";
	}
	
}
