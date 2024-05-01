package com.fruitbasket;

public class Fruit {
	protected String name ;
	protected String color;
	protected double weight;
	protected enumfresh fresh;
    
	public Fruit(String name , String color , double weight ,enumfresh fresh) {
		this.name = name ;
		this.color = color ;
		this.weight = weight;
		this.fresh = true;
	}
	
	public abstract String taste();
	
	public enumfresh isFresh() {
		return fresh;
	}
	public void setFresh(enumfresh fresh) {
		this.fresh = fresh;
	}
	
	public String toString() {
		return "Name: "+this.name+" Color: "+this.color+ " Weight: "+this.weight+" Fresh: "+this.fresh;
	}
	
	
}
