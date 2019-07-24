package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void addition()
	{
		RPNCalculator calculator = new RPNCalculator();
		double actual = calculator.solve("15 5 +");
		double expected  = 20;
		assertEquals(expected, actual,0.001);
	}
	
	@Test
	public void substraction()
	{
		RPNCalculator calculator = new RPNCalculator();
		double actual = calculator.solve("3 2 -");
		double expected  = 1;
		assertEquals(expected, actual,0.001);
	}
	@Test
	public void division()
	{
		RPNCalculator calculator = new RPNCalculator();
		double actual = calculator.solve("6 2 /");
		double expected  = 3;
		assertEquals(expected, actual,0.001);
	}
	@Test 
	public void multiplication()
	{
		RPNCalculator calculator = new RPNCalculator();
		double actual = calculator.solve("3 2 *");
		double expected  = 6;
		assertEquals(expected, actual,0.001);
	}
	
	@Test
	public void result1()
	{
		RPNCalculator calculator = new RPNCalculator();
		double actual = calculator.solve("3 2 + 9 6 - 14 7 / + -");
		double expected  = 0;
		assertEquals(expected, actual,0.001);
	}
}
