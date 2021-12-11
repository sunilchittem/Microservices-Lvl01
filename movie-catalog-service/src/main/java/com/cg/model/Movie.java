package com.cg.model;

public class Movie {

	private String movieId;
	private String genre;
	private String movieName;

	public Movie() {

	}

	public Movie(String movieId, String genre, String movieName) {
		this.movieId = movieId;
		this.genre = genre;
		this.movieName = movieName;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", genre=" + genre + ", movieName=" + movieName + "]";
	}

}
