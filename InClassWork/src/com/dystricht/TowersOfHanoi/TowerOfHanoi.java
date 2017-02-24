package com.dystricht.TowersOfHanoi;

public class TowerOfHanoi {
	int towers[][];
	int numberOfDiscs;
	
	public TowerOfHanoi(){
		this.numberOfDiscs = 3;
		this.towers = new int[numberOfDiscs][3];
		
		for(int i = 0; i < numberOfDiscs; i++){
			this.towers[i][0] = i + 1;
		}
	}
	
	public TowerOfHanoi(int numberOfDiscs){
		
		this.numberOfDiscs = numberOfDiscs;
		this.towers = new int[numberOfDiscs][3];
	}
	
	public int topDisc(int tower, int something){
		
		return -1;
	}
	public int topDisc(int tower) {
		return this.topDisc(tower, 0);
	}
	public void printTowers(){
		
		for(int i = 0; i < this.towers.length; i++){
			for(int j = 0; j < this.towers[i].length; j++){
				System.out.print(this.towers[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		TowerOfHanoi hanoi = new TowerOfHanoi();
		
		hanoi.printTowers();
		
	}

}
