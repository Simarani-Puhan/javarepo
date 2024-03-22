package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {

	public List<String> showMovies(String language) {

		List<String> movies = null;
		if (language.equals("English"))
			movies = Arrays.asList("English1", "English2", "English3");
		if (language.equals("Hindi"))
			movies = Arrays.asList("Hindi1", "Hindi2", "Hindi3");
		if (language.equals("Kannada"))
			movies = Arrays.asList("kannada1", "kannada2");

		return movies;

	}

}
