package com.example.greeting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingApplicationTests {

	@Autowired
	private GreetingService greetingService;

	@Test
	public void testGreetingService()
	{
		assertEquals(new Greeting("Hello", "LeiXu"), greetingService.helloGreeting("LeiXu"));
	}

}
