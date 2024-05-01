package com.vehicleinfo;

import java.time.LocalDate;
import java.util.Date;

public class vehicle {
	private String chasisno;
	private double price;
	private LocalDate date;
	private LocalDate manfdate;
	private double pollu_level;
	private Color color ;
	
	public vehicle(String chasisno , double price , LocalDate date , LocalDate manfdate , Color color) {
		this.chasisno = chasisno;
		this.price = price;
		this.date = date;
		this.manfdate = manfdate;
		this.color = color;
	}
	
	public String getChasisno() {
		return chasisno;
	}

	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return LocalDate;
	}

	public void setDate(Date date) {
		this.date = LocalDaate;
	}

	public Date getManfdate() {
		return manfdate;
	}

	public void setManfdate(Date manfdate) {
		this.manfdate = manfdate;
	}

	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "vehicle [chasisno=" + chasisno + ", price=" + price + ", color=" + color + "]";
	}
	
	
	
}
