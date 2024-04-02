package com.spring_learning.spring_basics;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String engineType;
		
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + "]";
	}
	
}
