package com.cg.model;

public class CatalogItem {

	private String name;
	private String genre;
	private int rating;

	public CatalogItem(String name, String genre, int rating) {
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CatalogItem [name=" + name + ", genre=" + genre + ", rating=" + rating + "]";
	}

}
