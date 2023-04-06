package com.codewithme.bumblebee.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	Product product = new Product(001,"bat",2000,"cricket bat","sport");
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

	@Test
	void testGetProductCode() {
		int expected = 001;
		int actual = product.getProductCode();
		assertEquals(expected,actual);
	}

	@Test
	void testSetProductCode() {
		int id = 001;
		product.setProductCode(id);
		int expected = 001;
		int actual = product.getProductCode();
		assertEquals(expected,actual);
	}

	@Test
	void testGetName() {
		String expected = "bat";
		String actual = product.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testSetName() {
		String name = "bat";
		product.setName(name);
		String expected = "bat";
		String actual = product.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testGetPrice() {
		double expected = 2000;
		double actual = product.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	void testSetPrice() {
		double price = 2000;
		product.setPrice(price);
		double expected = 2000;
		double actual = product.getPrice();
		assertEquals(expected,actual);
	}

}
