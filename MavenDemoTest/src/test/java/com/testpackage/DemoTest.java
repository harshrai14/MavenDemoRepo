package com.testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum() {
		System.out.println("SUM");
		int a=10,b=20;
		Assert.assertEquals(a+b, 30);	
	}
	
	@Test
	public void div() {
		System.out.println("DIVIDE");
		int a=10,b=20;
		Assert.assertEquals(b/a,2);	
	}
	
	@Test
	public void mul() {
		System.out.println("MULTIPLY");
		int a=10,b=20;
		Assert.assertEquals(a*b, 200);	
	}
	
	@Test
	public void sub() {
		System.out.println("SUBTRACT");
		int a=10,b=20;
		Assert.assertEquals(b-a, 10);	
	}
}
