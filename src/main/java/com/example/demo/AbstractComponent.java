package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

abstract class AbstractComponent {

	@Autowired
	private Environment environment;

	protected String lookup(String key) {
		return this.environment.getProperty(key, "Hello World");
	}

}
