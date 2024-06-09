package com.app.tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.dao.AccountStatementDao;
import com.app.dao.AccountStatementImpl;
import com.app.entity.BankStatement;

public class AccountTester {
	
	public static void main(String[] args) {
		try(Scanner sc =new Scanner (System.in)){
			boolean exit =false;
			AccountStatementDao accountStatementDao=new AccountStatementImpl();
			Map<Integer,BankStatement> bankMap =new HashMap<>();
		    bankMap.put(2, new BankStatement(LocalDate.parse("2023-01-01"),"Mobile Recharge",300.0,0.0));
		    bankMap.put(3, new BankStatement(LocalDate.parse("2023-02-01"),"DTH Recharge",1000.0,0.0));
		    bankMap.put(4, new BankStatement(LocalDate.parse("2023-02-01"),"Rent Transfer",11000.0,0));
		    bankMap.put(5, new BankStatement(LocalDate.parse("2023-02-01"),"Cashback Paytm",0.0,1000.0));
		    bankMap.put(6, new BankStatement(LocalDate.parse("2023-05-01"),"Shopping",5000.0,0.0));
		    bankMap.put(7, new BankStatement(LocalDate.parse("2023-10-01"),"Shopping",7000.0,0.0));
		    bankMap.put(8, new BankStatement(LocalDate.parse("2023-12-01"),"Cashback",0.0,3000.0));
		    bankMap.put(9, new BankStatement(LocalDate.parse("2023-02-01"),"Mobile Purchase",10000.0,0.0));
		    bankMap.put(10, new BankStatement(LocalDate.parse("2023-01-31"),"Dining",1200.0,0.0));
		    bankMap.put(11, new BankStatement(LocalDate.parse("2023-01-01"),"Salary Credit",0.0,50000.0));
		    
		    while(!exit) {
		    	System.out.println("0.exit\n1.write data into file\n2.display onto the console\n3.Max deposit amount\n4.Sum of all deposits"
		    			+ "\n5.Date on which maximum amount withdrawn\n6.Shopping expenses (sum of withdrawals for shopping)\n7.display");
		    	System.out.println("choose");
		    	try {
		    		switch (sc.nextInt()) {
		    		case 0:
		    			exit = true;
		    			break;
		    		case 1:
		    			System.out.println("enter filename in which you write the data");
		    			accountStatementDao.writeDetails(sc.next(), bankMap);
		    			System.out.println("data write successful");
		    			break;
		    		case 2:
		    			System.out.println("enter filename to display");
		    			accountStatementDao.readDetails(sc.next());
		    			break;
		    		case 3:
		    			accountStatementDao.calculateMaxDepositAmount(bankMap);
		    			break;
		    			
		    		case 4:
		    			accountStatementDao.calculateSumofDeposite(bankMap);
		    			break;
		    		case 5:
		    			accountStatementDao.calculatedateofmaxWithdrow(bankMap);
		    			break;
		    		case 6:
		    			accountStatementDao.calculateshoppingExpenses(bankMap);
		    			break;
		    		case 7:
		    			accountStatementDao.display(bankMap);
		    			break;   			
		    		}
		    	}catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
		    }
		
		
		}	
	}
}
