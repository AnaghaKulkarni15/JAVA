package com.vehicleinfo; 

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle[] sarr=new vehicle[3];  
		Scanner in= new Scanner(System.in);
		while(true)
		{
			System.out.println("----MENU-----");
			System.out.println("1. Add New Vehicle");
			System.out.println("2. Drive in KM");
			System.out.println("Enter the choice");
			int choice=in.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter Chasis Number:");
				String chasisno = in.next();
				System.out.println("Enter Price of vehicle:");
				double price = in.nextDouble();
				System.out.println("Enter Date:");
				//Date date = in.nextd
				break;
			case 2:
				
				break;
			default:
				return;
			}
	}

}
