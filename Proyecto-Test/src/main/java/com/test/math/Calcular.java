package com.test.math;

public class Calcular {

	public Long factorialRecursivo(Long n) {
		if (n <= 1) {
			return n;
		}
		Long result = n * factorialRecursivo(n - 1);
		return result;
	}

	public Long factorialIterativo(Long n) {
		if (n <= 1) {
			return n;
		}
		Long result = n;
		for (int i = 1; i < n; i++) {
			result *= i;
		}
		return result;
	}

	public Long fibonacciRecursivo(Long n) {
		Long result = null;
		if (n <= 1) {
			return n;
		} else {
			result = fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
		}
		return result;
	}

	public Long fibonacciIterativo(Long n) {
		if (n <= 1) {
			return n;
		}

		Long result = 1L;
		Long prevFib = 1L;
		for (int i = 2; i < n; i++) {
			Long temp = result;
			result += prevFib;
			prevFib = temp;
		}

		return result;
	}
}
