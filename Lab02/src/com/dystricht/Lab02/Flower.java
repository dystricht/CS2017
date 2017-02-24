package com.dystricht.Lab02;

public class Flower {

	//name of the flower
	private String flowerName;
	//is the flower edible?
	private boolean edible;
	
	public Flower(String name){
		this.flowerName = name;
		this.edible = false;
	}
	
	public Flower(String name, boolean edible){
		this.flowerName = name;
		this.edible = edible;
	}
	
	public Flower(){
		
	}
	
	/**
	 * Accessor for the name of the flower.
	 * @return the name of the flower
	 */
	public String getName(){
		return this.flowerName;
	}
	
	public void setName(String name){
		this.flowerName = name;
	}
	
	public void isEdible(){
		if(this.edible == false){
			System.out.println(this.getName() + " is not edible.");
		} else{
			System.out.println(this.getName() + " is edible.");
		}
	}

	
	public static void main(String[] args){
		Flower sunflower = new Flower("Sunflower", true);
		
		Cauliflower broccoli = new Cauliflower("Green");
		
		Iris blueman = new Iris();
		
		sunflower.isEdible();
		broccoli.isEdible();
		blueman.isEdible();
	}
}
