package com.spring_learning.spring_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Autowired
	private Engine e;
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	@Override
	public void drive() {
		System.out.println("Car with "+e);
	}
	
}
