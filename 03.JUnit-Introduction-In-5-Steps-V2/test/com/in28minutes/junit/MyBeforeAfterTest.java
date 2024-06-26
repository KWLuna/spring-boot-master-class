package com.in28minutes.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	// Executed before all tests (executed only once)
	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}
	
	// Executed before each test
	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach");
	}

	@Test
	void test1() {
		System.out.println("test1");
	}

	@Test
	void test2() {
		System.out.println("test2");
	}

	@Test
	void test3() {
		System.out.println("test3");
	}

	// Executed each test
	@AfterEach
	void afterEach() {
		System.out.println("AfterEach");
	}

	// Executed after all tests (executed only once)
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}

}
