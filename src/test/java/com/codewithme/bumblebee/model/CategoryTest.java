package com.codewithme.bumblebee.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CategoryTest {

	Category categoryOne = new Category(001,"catOne");
	Category categoryTwo = new Category("catTwo");
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Disabled
	@Test
	void testCategoryIntString() {
		fail("Not yet implemented");
	}
	@Test
	void testGetCategoryId() {
		int expected = 001;
		int actual = categoryOne.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	void testSetCategoryId() {
		int id = 001;
		categoryOne.setCategoryId(id);
		int expected = 001;
		int actual = categoryOne.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	void testGetCategoryName() {
		String expected = "catOne";
		String actual = categoryOne.getCategoryName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetCategoryName() {
		String name ="catOne";
		categoryOne.setCategoryName(name);
		String expected = "catOne";
		String actual = categoryOne.getCategoryName();
		assertEquals(expected,actual);
	}

}
