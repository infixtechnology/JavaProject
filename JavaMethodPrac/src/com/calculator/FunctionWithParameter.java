package com.calculator;

public class FunctionWithParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		add(2,2);
		add(8,8);
		add(5,6);
		sub(20,66);
	}
	public static void add(int a, int b){
		int result = a+b;
		System.out.println("Result is "+result);
		
	}
	public static void sub(int a, int b){
		int result = a-b;
		System.out.println("Result is "+result);
		
	}

}
