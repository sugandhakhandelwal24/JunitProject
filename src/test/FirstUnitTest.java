package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstUnitTest {
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Inside before all");
	}
	
	@BeforeEach
	public void beforeEachMethod()
	{
		System.out.println("Inside before each");
	}

	@Test
	public void testcase1()
	{
		System.out.println("Inside Testcase1");
		boolean flag = false;
        
        Assertions.assertTrue(flag);
	}

	@AfterEach
	public void afterEachMethod()
	{
		System.out.println("Inside after each");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("Inside after all");
	}
}
