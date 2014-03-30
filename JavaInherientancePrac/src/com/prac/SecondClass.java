package com.prac;

public class SecondClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculator(5, 5);

	}

	public static void calculator(int a, int b) {
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;

		System.out.println("add result " + add);
		System.out.println("subtruct result " + sub);
		System.out.println("multiply result " + mul);
		System.out.println("Division result " + div);
	}

}
