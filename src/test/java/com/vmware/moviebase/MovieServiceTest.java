package com.vmware.moviebase;


import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class MovieServiceTest {

	@Test
	public void addTwoMovieAndgetTheTotal() {
		MovieService movieService = new MovieService("VMWare Movie Night");
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie(" Wall-E"));
		assertEquals(movieService.getCount(), 2); 
		
		
 
	}
	
	@Test
	public void addOneMovieAndGetTheTotal() {}
	
	@Test
	public void getTheTotalWithNoMoview() {}
	
}
