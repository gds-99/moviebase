package com.vmware.moviebase;

import java.util.HashSet;
import java.util.Set;

public class MovieService {
	private Set<Movie> movies = new HashSet<Movie>();

	public MovieService(String title) {

	}

	public int getCount() {
		// TODO Auto-generated method stub
		return movies.size();
	}

	public void addMovie(Movie movie)throws MovieException {
if (movies.contain(movie.getName()))
			throw new MovieException("Movie already exist");
		movies.add(movie);

	}

	public void removeByName(String name) throws MovieException {

		if (getCount() == 0)
			throw new MovieException("There are no movies in the service");
		for (Movie m : movies) {
			if (m.getName().equals(name)) {
				movies.remove(m);
				return;
			}
		}

		throw new MovieException("that movie does not exist in the service");

	}

}
