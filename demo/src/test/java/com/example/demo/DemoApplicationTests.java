package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testIsTrue() {
		assertTrue(DemoApplication.isTrue());
	}
	
	@Test
	void testIsFalse() {
		assertFalse(DemoApplication.isFalse());
	}

}
