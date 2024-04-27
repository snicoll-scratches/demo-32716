package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
class MyRepository extends AbstractComponent {

	public String hello() {
		return lookup("hello");
	}

}
