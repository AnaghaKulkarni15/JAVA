package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.customer.CustomerMngmt;
import com.app.customer.ServicePlan;
import com.app.utils.CustomerValidations;

public class CustomerApp {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			Boolean exit = false;
			List<CustomerMngmt> customerList = new ArrayList<>();
			while(!exit) {
				System.out.println("--Main Menu--");
				System.out.println("\n1.Create Customer Accounts \n2.Display Customer Accounts \n0.Exit");
				System.out.println("Choose an Option:");
				try {
					switch(in.nextInt()){
					case 1 :
						//register new customer
						//customer signup : all details except custid 
						System.out.println("Enter Customer Details: \n fname,lname,email,passwd,regiamt,dob,plan");
						
						/*System.out.println("Enter Customer Details:");
						System.out.println("\nFirst Name:");
						String fname = in.next();
						System.out.println("\nLast Name:");
						String lname = in.next();
						System.out.println("\nEmail ID:");
						String email = in.next();
						System.out.println("\nPassword:");
						String passwd = in.next();
						System.out.println("\nRegistered Amount:");
						Double regiamt = in.nextDouble();
						System.out.println("\nDate of Birth:");
						String dob = in.next();
						System.out.println("\nService Plan:SILVER GOLD DIAMOND PLATINUM :");
						//ServicePlan sp = ServicePlan.values()*/
						//String plan = in.next();
						
						CustomerMngmt customer = CustomerValidations.validateinputs(in.next(),in.next(),in.next(),in.next(),in.nextDouble(),in.next(),in.next(),customerList);
						customerList.add(customer);
						System.out.println("Customer registered..");
						break;
					
					case 2: //display all accounts
						System.out.println("All accounts Details:");
						for(CustomerMngmt c : customerList )
								System.out.println(c);
						break;
					
					case 0:
						exit = true;
						break;
					}
				}
				catch(Exception e) {
					System.out.println(e);
					in.nextLine();
				}	
				
			}
		}

	}

	private static CustomerMngmt validateinputs(int nextInt, String next, String next2, String next3, String next4,
			String next5, CustomerMngmt[] accounts) {
		// TODO Auto-generated method stub
		return null;
	}


}
