package com.vmware.moviebase;


import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MovieServiceTest {

	private MovieService movieService; 
	
	@BeforeMethod
	public void setUp() {
		 movieService = new MovieService("VMWare Movie Night");
		
	}
		
	@Test
	public void addTwoMovieAndgetTheTotal() {
		
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie(" Wall-E"));
		assertEquals(movieService.getCount(), 2); 
		
		 
	}
	
	@Test
	public void addOneMovieAndGetTheTotal() {

	
	movieService.addMovie(new Movie(" Wall-E"));
	assertEquals(movieService.getCount(), 1); 
	}
	
	@Test
	public void getTheTotalWithNoMoview() {
	
		assertEquals(movieService.getCount(), 0); 
		
	}

	@Test
	public void removeAMovieAndgetTheTotal(){
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie(" Wall-E"));
		movieService.removeByName("Wall-E");
		assertEquals(movieService.getCount(), 1); 
	}
	@Test
	public void removeAMovieFromAnEmptyService() {}
	
	@Test
	public void removeAMovieThatDoesntExist(){}  
		
		
	}
	

