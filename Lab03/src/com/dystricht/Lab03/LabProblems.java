package com.dystricht.Lab03;

public class LabProblems {
	
	public static void printSomething(int x){
		if(x<1){
			System.out.println(x);
			return;
		}
		System.out.println(x);
		printSomething(x-1);
	}
	
	public static int recursive(int a){
		
		if(a==0){
			return 1;
		}
		
		return 3*recursive(a-1);
		
	}
	
	public static int rangeSum(int[] array, int start, int end){
		
		if(start > end)
			return 0;
		else
			return array[start] + rangeSum(array, start+1, end);
	}

}
