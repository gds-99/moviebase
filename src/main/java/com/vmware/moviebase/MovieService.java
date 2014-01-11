package com.vmware.moviebase;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
	private List<Movie> movies = new ArrayList<Movie>();
	private int count = 0;
	
		
	public  MovieService(String title) {
		
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return  count;
	}

	public void addMovie(Movie movie) {
				count++;
				movies.add(movie);
		
	}

	public void removeByName(String name)throws MovieException {
		// TODO Auto-generated method stub
		  if (count == 0) 
			  	throw new MovieException( "There are no movies in the service");
		  for (Movie m : movies) {
			  if (m.getName() .equals (name)){
				  	movies.remove(m) ;
				  	count--;
				  	return;
			  }
		  }
		  	
		  throw new MovieException("that movie does not exist in the service");
		  
		  }
		  
	}

	
	
	
 
