package com.dystricht.InClassWork;

public class Main {

	static AsciiCanvas canvas = new AsciiCanvas();
	static AsciiObject obj = new AsciiObject();

	public static void main(String[] args) {
		
		
		makeCanvas();
		
		AsciiCanvas.drawObj(obj);
		
//		canvas.replaceChar(new int[] {3,3}, 'D');
//		canvas.dispCanvas();
		
	}
	
	public static void makeCanvas(){
		canvas.fillCanvas('X');
		canvas.dispCanvas();
	}
	
	public void movement(){
		
	}
}
