package com.test;

public class PolyPrac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(3,3);
		
		add(3,3,3);

	}
	
	public static void add(int a, int b){
		int result = a+b;
		System.out.println("Result is "+result);
	}
	
	public static void add(int r, int y,int z){
		int result = r+y+z;
		System.out.println("Result is "+result);
	}

}
