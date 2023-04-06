package com.codewithme.bumblebee.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminTest {

	Admin admin = new Admin(001,"admin",0213332,"aduname","adpass") ;
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
	void testGetAdminId() {
		int id = 001;
		admin.setAdminId(id);
		int expected = 001;
		int actual = admin.getAdminId();
		assertEquals(expected,actual);
	}

	@Test
	void testGetName() {
		String expected = "admin";
		String actual = admin.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testGetContact() {
		int cont = 0213332;
		admin.setContact(cont);
		int expected = 0213332;
		int actual = admin.getContact();
		assertEquals(expected,actual);
	}

	@Test
	void testGetUserName() {
		String expected = "aduname";
		String actual = admin.getUserName();
		assertEquals(expected,actual);
	}

}
