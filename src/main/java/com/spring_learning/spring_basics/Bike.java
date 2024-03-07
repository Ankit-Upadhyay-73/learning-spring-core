package com.spring_learning.spring_basics;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

		public void drive() {
			System.out.println("Driving the bike");
		}
		
}
