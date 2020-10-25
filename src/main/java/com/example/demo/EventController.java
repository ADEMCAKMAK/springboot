package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "event-create")
public class EventController {

	@Autowired private CustomEventPublisher cep;
	
	@GetMapping
	public void createEvent() {
		cep.publishCustomEvent("event sending broo");
	}
}
