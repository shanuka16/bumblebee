package com.codewithme.bumblebee.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest {
	
	Loan loan = new Loan(1,001,12000,3000,4000,4000,4000,java.sql.Date.valueOf("2023-01-10"),java.sql.Date.valueOf("2023-04-05"));
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
	void testGetIdLoan() {
		int expected = 1;
		int actual = loan.getIdLoan();
		assertEquals(expected,actual);
	}

	@Test
	void testGetCustomerIdLoan() {
		int expected = 001;
		int actual = loan.getCustomerIdLoan();
		assertEquals(expected,actual);
	}

	@Test
	void testGetUsedAmount() {
		double expected = 12000;
		double actual = loan.getUsedAmount();
		assertEquals(expected,actual);
	}

	@Test
	void testGetLoanBalance() {
		double expected = 3000;
		double actual = loan.getLoanBalance();
		assertEquals(expected,actual);
	}

	@Test
	void testGetInstallmentOne() {
		double expected = 4000;
		double actual = loan.getInstallmentOne();
		assertEquals(expected,actual);
	}

	@Test
	void testGetStartDate() {
		java.sql.Date expected = java.sql.Date.valueOf("2023-01-10");
		java.sql.Date actual = loan.getStartDate();
		assertEquals(expected,actual);
	}

}
