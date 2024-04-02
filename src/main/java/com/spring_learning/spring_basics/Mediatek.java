package com.spring_learning.spring_basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Not good as Snap");
	}

}
