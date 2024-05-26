package com.app.customer;

//ServicePlans n their charges -
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double plancost;
	
	ServicePlan(double cost) {
		this.plancost = cost;
		
	}

	public double getPlancost() {
		return plancost;
	}

//	public void setPlancost(double plancost) {
//		this.plancost = plancost;
//	}
//	
	
	
	
	
}
