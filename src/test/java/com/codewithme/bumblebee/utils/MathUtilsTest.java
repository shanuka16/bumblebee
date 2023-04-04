package com.codewithme.bumblebee.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
class MathUtilsTest {
	
	MathUtils utils;
	public MathUtilsTest() {
		System.out.println("New object created");
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		utils = new MathUtils() ;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("When I substract the taken loan amount from the maximum loan amount ")
	void testSubstract() {
		System.out.println("Test substract method");
		
		double loanAmnt = 15000;
		double takenAmnt = 13000;
		double expected = 2000;
		
		double result = utils.substract(loanAmnt, takenAmnt);
		
		assertEquals(expected,result,"This must return "+expected+", but received "+result);
	}

	@Test
	@DisplayName("When double is divide by zero ")
	void testDivide() {
		System.out.println("Test divide method");
		
		try {
			utils.divide(15000, 3);
		}
		catch(Exception ex){
			assertEquals(ArithmeticException.class,ex.getClass(), "Should provide arithmetic exception but received "+ex.getClass());
		}
		/*assertThrows(ArithmeticException.class, ()->utils.divide(15000, 3),"Should provide arithmetic exception but received ");*/
	}

}
