package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals; //this import is for static assertions
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExample {

	@Test
	public void test1()
	{
		String expected = "Hi There";
		String actual = "Hi There";
		//String actual = "Hello There";
		//Assertions.assertEquals(expected, actual);
		assertEquals(expected, actual); //static assertions
		
		String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "three"};
	    assertArrayEquals(expectedArray,resultArray);
	    
	    boolean flag = true;
	    assertTrue(flag);
	      
	      
	}
}
