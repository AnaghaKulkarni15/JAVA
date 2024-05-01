package com.fruitbasket;

public class orange extends Fruit {
	public orange(String name,String color,double weight,enumfresh fresh) {
		super(name,color,weight,fresh);
	}
	
	public String taste() {
		return "Sour";
	}
	
//	public void juice() {
//		System.out.println(super.getName()+super.getWeight()+"Extracting Juice");
//	}

	public void juice() {
		System.out.println("Name: "+this.name+" Weight: "+this.weight+"\nExtracting Juice....");
	}

}
