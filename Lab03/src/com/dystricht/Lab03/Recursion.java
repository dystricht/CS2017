package com.dystricht.Lab03;

public class Recursion{

	static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	static int sum;
	public static void main(String[] args){
		
		/**
		 * Problem #1
		 */
		LabProblems.printSomething(4);
		
		
		/**
		 * Problem #2
		 */
		int answer2;
		
		answer2 = LabProblems.recursive(4);
		System.out.println(answer2);

		
		/**
		 * Problem #3
		 */
		sum = LabProblems.rangeSum(numbers, 3, 7);
		System.out.println(sum);
		
	}
}