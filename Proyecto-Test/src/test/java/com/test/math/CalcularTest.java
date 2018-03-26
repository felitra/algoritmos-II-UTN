package com.test.math;

import org.junit.Test;

import junit.framework.Assert;

public class CalcularTest {

	private Calcular calcular = new Calcular();

	@Test
	public void testFactorialRecursivo() {
		Long expected = 120L;
		Assert.assertEquals(expected, calcular.factorialRecursivo(5L));
	}

	@Test
	public void testFactorialIterativo() {
		Long expected = 120L;
		Assert.assertEquals(expected, calcular.factorialIterativo(5L));
	}

	@Test
	public void testFibonacciRecursivo() {
		Long expected = 5L;
		Assert.assertEquals(expected, calcular.fibonacciRecursivo(5L));
	}

	@Test
	public void testFibonacciIterativo() {
		Long expected = 5L;
		Assert.assertEquals(expected, calcular.fibonacciIterativo(5L));
	}

}
