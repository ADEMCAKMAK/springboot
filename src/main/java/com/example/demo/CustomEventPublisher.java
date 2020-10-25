package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

// 

@Component
public class CustomEventPublisher {

	@Autowired private ApplicationEventPublisher appEventPublisher;
	
    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
        CustomEvent customEvent = new CustomEvent(this, message);
        appEventPublisher.publishEvent(customEvent);
    }
}
