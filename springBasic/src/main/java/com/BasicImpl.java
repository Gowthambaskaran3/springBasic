package com;

import org.springframework.context.annotation.Bean;

public class BasicImpl{
	@Bean
	public void print(){
		System.out.println("This is printed using XML Configuration");
	}
}
