package com.example.demo;

import org.springframework.context.ApplicationEvent;


public class CustomEvent extends ApplicationEvent {
	

	private static final long serialVersionUID = 1L;
	private String someInfo;

	public String getSomeInfo() {
		return someInfo;
	}

	public void setSomeInfo(String someInfo) {
		this.someInfo = someInfo;
	}

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public CustomEvent(Object source, String someInfo) {
		super(source);
		this.someInfo = someInfo;
	}
	
	
}
