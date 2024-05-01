package com.fruitbasket;

public class mango extends Fruit {
	
	public mango(String name,String color,double weight,enumfresh fresh) {
		super(name,color,weight,fresh);
	}
	
	public String taste() {
		return "Sweet";
	}
	
//	public void pulp() {
//		System.out.println(super.getName()+super.getColor()+"Creating Pulp");
//	}
	
	public void pulp() {
		System.out.println("Name : "+this.name+" Color : "+this.color+" \nCreating Pulp.......");
	}
	
	
}
