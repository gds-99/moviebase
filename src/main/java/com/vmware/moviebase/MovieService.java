package com.vmware.moviebase;

public class MovieService {
	private int count = 0;
	
		
	public MovieService(String name) {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return  count;
	}

	public void addMovie(Movie movie) {
				count++;
		
	}

	public void removeByName(String string) {
		// TODO Auto-generated method stub
		  count--;
	}

}
