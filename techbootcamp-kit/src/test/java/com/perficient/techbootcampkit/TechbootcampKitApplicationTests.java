package com.perficient.techbootcampkit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TechbootcampKitApplicationTests {

	
	@Test
	void contextLoads() {
	}
	
	
	TechbootcampKitApplication c;
	@BeforeEach
	void setUp() {
		c = new TechbootcampKitApplication();
	}
	
	@Test
	void test_add5() {
		assertEquals(10, c.add5(5));
	}

}
