package com.vehicleinfo;

import java.util.Scanner;
import static com.vehicleinfo.VehicleValidationRule.validatepollution;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Level");
			int lvl=in.nextInt();
			validatepollution(lvl);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

//	private static void validatepollution(int lvl) {
//		// TODO Auto-generated method stub
//		
//	}

	

}
