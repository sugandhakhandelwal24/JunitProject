package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringFunctionTest {

	@Test
	public void test1()
	{
		assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
	@Test
	public void test2()
	{
		assertFalse(StringFunctions.isPalindrome("sugandha"));
	
	}
	
}
