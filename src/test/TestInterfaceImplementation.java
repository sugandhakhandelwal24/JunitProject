package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestInterfaceImplementation implements TestInterface{

	@Override
	public void method1() {
		
		
	}
	@Test
	public void test2()
	{
		assertTrue(StringFunctions.isPalindrome("madam"));
	}

}
