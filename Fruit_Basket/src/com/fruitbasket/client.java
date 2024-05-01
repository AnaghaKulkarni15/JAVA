package com.fruitbasket;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter size of basket:");
		basket_size = in.nextInt();
		
		Fruit[] f =new Fruit[basket_size]; 
		//int fruit_count = 0 ;
		ArrayUtility au = new ArrayUtility();
		
		
		while(true)
		{
			System.out.println("MAIN MENU---------------");
			System.out.println("1. Add Fruit");
			System.out.println("2. Display all fruits:");
			System.out.println("3. Display details of fresh fruits:");
			System.out.println("4. Mark fruit as stale");
			System.out.println("5. Mark all sour fruit as stale");
			System.out.println("6. Invoke fruit Specific Functionality");
			System.out.println("7. Exit");
			
			System.out.println("Enter the choice:");
			int choice=in.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Select\n1.Fresh \n 2.Stale");
				System.out.println("Enter choice:");
				int ch = in.nextInt();
				
				if(ch==1) {
					enumfresh fresh = fresh.FRESH;
						au.acceptdetails(f,fresh);
				}
				else {
					enumfresh fresh = enumfresh.STALE;
				}
				break;
				
			case 2:
				au.displaydetails(f);
				break;
				
			case 3:
				System.out.println("Enter index: ");
				int i=sc.nextInt();
				try {
					if(i>f.length) {
						throw new Exception("Wrong index");
					}
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				f[i].setFresh(enumfresh.STALE);
                break;
                
			case 4:
				String taste="sweet";
				for(int j=0; j<f.length; j++) {
					if(f[j] instanceof mango) {
						mango m =(mango) f[j];
						taste = m.taste();	
					}
					else if(f[j] instanceof orange) {
						orange o =(orange) f[j];
						taste = o.taste();	
					}
					else if(f[j] instanceof apple) {
						apple a =(apple) f[j];
						taste = a.taste();	
					}
					if(taste.equals("sour")) {
						enumfresh fresh = enumfresh.STALE;
					}
				}
				break;
				
			case 5:
				for(int j=0; j<f.length; j++) {
					if(f[j] instanceof mango) {
						mango m =(mango) f[j];
						m.pulp();	
					}
					else if(f[j] instanceof orange) {
						orange o =(orange) f[j];
						o.juice();
					}
					else if(f[j] instanceof apple) {
						apple a =(apple) f[j];
						a.jam();
					}
				}
				break;
			
			case 6:
				System.exit(0);
             
			}

		}
	}

}
