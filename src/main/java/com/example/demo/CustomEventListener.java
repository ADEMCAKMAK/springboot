package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Received spring custom event - " + event.getSomeInfo());
	}

}
