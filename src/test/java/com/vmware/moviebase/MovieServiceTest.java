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
	public void removeAMovieAndgetTheTotal() throws MovieException{
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie(" Wall-E"));
		movieService.removeByName("Wall-E");
		assertEquals(movieService.getCount(), 1); 
	}
	@Test
	public void removeAMovieFromAnEmptyService() { 
		try {
			movieService.removeByName("Wall-E");
			fail("Was expecting an Exception in remove movie");
	} catch (MovieException e)  {
		assertEquals(e.getMessage(), "There are no movies in the service");	
		}
		
	}
	
	@Test
	public void removeAMovieThatDoesntExist(){
		
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie(" Wall-E"));
		try{
		movieService.removeByName("Titiantic");
		fail("Was expecting exception in removeAMovieThatDoesntExist");
		} catch (MovieException e) {
			assertEquals(e.getMessage(), "That movie does not exist in the service");
			
		}
		
	}	
		


	
	
	@Test
	public void removeAMovieFooThatDoesntExist(){
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie(" Wall-E"));
		try{
		movieService.removeByName("Foo");
		fail("Was expecting exception in removeAMovieThatDoesntExist");
		} catch (MovieException e) {
			assertEquals(e.getMessage(), "That movie does not exist in the service");
		}
		
	}
	
}

