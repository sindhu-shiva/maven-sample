package com.qa.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	@Test
	public void TestAddition() {
		System.out.println("sum");
		int a = 5;
		int b = 4;
		int actual = a+b;
		int expected = 9;
		
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void TestSubstraction() {
		System.out.println("subtraction");
		int a = 5;
		int b = 4;
		int actual = a-b;
		int expected = 1;
		
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void TesMultiplication() {
		System.out.println("Multiply");
		int a = 5;
		int b = 4;
		int actual = a*b;
		int expected = 20;
		
		Assert.assertEquals(actual, expected);	
	}
	
}


