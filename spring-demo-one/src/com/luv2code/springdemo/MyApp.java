package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		Coach theCoach = new TrackCoach(null);
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
