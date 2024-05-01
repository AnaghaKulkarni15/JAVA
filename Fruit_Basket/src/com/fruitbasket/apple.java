package com.fruitbasket;

public class apple extends Fruit{
	
	public apple(String color,double weight,enumfresh fresh) {
		super(name,color,weight,fresh);
	}
	
	public String taste() {
		return "Sweet and Sour";
	}
	
	public void jam() {
		System.out.println("Name:"+this.name+"\n Making Jam..");
	}
	
//	public void jam() {
//		
//		System.out.println(super.getName()+"Making jam");
//	}
	
	
}
