package com.spring_learning.spring_basics;

import org.springframework.stereotype.Component;

@Component("powerful")
public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		// TODO Auto-generated method stub

		System.out.println("World powerful cpu designer");
		
	}

	
	
}
