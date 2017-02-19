package com.dystricht.InClassWork;

public class AsciiCanvas {
	
	int sizeX;
	int sizeY;
	static char[][] charray;
	
	public AsciiCanvas(){
		this.sizeX = 10;
		this.sizeY = 20;
		charray = new char[sizeX][sizeY];
		
	}
	

	
	//
	static void replaceChar(int[] charSpot, char replacement){
		
		charray[charSpot[0]] [charSpot[1]] = replacement;
	}
	
	void fillCanvas(char character){
		
		for(int i=0; i < this.sizeX; i++){
			for(int j=0; j < this.sizeY; j++){
				this.charray[i][j] = character;
			}
		}
	}

	void dispCanvas(){
		
		for(int i=0; i < this.sizeX; i++){
			for(int j=0; j < this.sizeY; j++){
				System.out.print(this.charray[i][j]);
			}
			System.out.println();
		}
	}
	
	
	static void clrConsole(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	static void drawObj(AsciiObject obj){
		
		replaceChar(new int[] {obj.x, obj.y}, obj.getChar());
	}
}
