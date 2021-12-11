package com.cg.movieinfoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {

		return new Movie("1234","Action", "no time to die");
	}
}
