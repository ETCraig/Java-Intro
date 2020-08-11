package com.etcraig.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {

		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= number - 1; i++) {
			if (number % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUpToN() {

		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {

		int sum = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(j + " ");
			}
			System.out.println();
		}
	}
}
