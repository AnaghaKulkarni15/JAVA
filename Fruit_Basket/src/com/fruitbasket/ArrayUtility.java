package com.fruitbasket;
import java.util.Scanner;

public class ArrayUtility {

	
	public static void acceptdetails(Fruit farr[],enumfresh fresh) {
		
		static int i ;
		Scanner in = new Scanner(System.in);
		
		System.out.println("---Accept Fruit Deatils---");
		System.out.println("\n 1.Mango\n 2.Orange\n 3.Apple");
		System.out.println("Enter which fruit want to add in basket:");
		int ch = in.nextInt();
		
		System.out.println("Enter name:");
		String name = in.next();
		System.out.println("Enter color:");
		String color =in.next();
		System.out.println("Enter weight:");
		double weight =in.nextDouble();
		
		switch(ch) {
		case 1:
			farr[i] = new mango(name,color,weight,fresh);
			i++;
			break;
		
		case 2:
			farr[i] = new orange(name,color,weight,fresh);
			i++;
			break;
		case 3:
			farr[i] = new apple(name,color,weight,fresh);
			i++;
			break;
		}
	}
	
	

	
	public static void displaydetails(Fruit[] farr)
	{
		for(int i=0;i<farr.length;i++)
		{
			System.out.println(farr[i]);
		}
	}
}

