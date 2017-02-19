package com.dystricht.Lab02;

public class Cauliflower extends Flower {
	
	private String color;
	
	public Cauliflower(){
		super("Cauliflower", true);
		this.color = "White";
	}
	
	public Cauliflower(String color){
		super("Cauliflower", true);
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String c){
		this.color = c;
	}
}
