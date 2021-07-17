package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;

public class AssumptionsExample {
	
	@BeforeAll
	public static void setup() {
		
		System.setProperty("ENV", "DEV");		
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	
	@Test
	public void test2() {
		
	//assumeFalse("PROD".equals(System.getProperty("ENV")));
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		assertFalse(StringFunctions.isPalindrome("sugandha"));
	}

}


