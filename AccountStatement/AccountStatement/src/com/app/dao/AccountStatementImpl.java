package com.app.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import com.app.entity.BankStatement;
import com.app.exception.customException;

public class AccountStatementImpl implements AccountStatementDao {



	

	private String dateofmaxWithdrow;
	private String MaxDepositAmount;

	@Override
	public void writeDetails(String filename, Map<Integer, BankStatement> bankStatementMap) throws customException,IOException{
	Stream<BankStatement> stream=bankStatementMap.values()
			.stream();
	try(PrintWriter pw =new PrintWriter(new FileWriter(filename,true))){
		stream.forEach(entry->pw.println(entry));
		}
		
	}

	@Override
	public void readDetails(String filename) throws customException, FileNotFoundException, IOException {
		try(BufferedReader read =new BufferedReader(new FileReader(filename))){
			read.lines().forEach(entry->System.out.println(entry));
		}
		
	}

	@Override
	public void display(Map<Integer, BankStatement> bankStatement) throws customException {
		double SumofDeposite=calculateSumofDeposite(bankStatement);
		double MaxDepositAmount=calculateMaxDepositAmount(bankStatement);
		double shoppingExpenses=calculateshoppingExpenses(bankStatement);
		Optional<Object> dateofmaxWithdrow=calculatedateofmaxWithdrow(bankStatement);
		
		/*
		 * System.out.println("sum of all deposite: "+ SumofDeposite);
		 * System.out.println("Max deposit amount: "+MaxDepositAmount);
		 * System.out.println("Shopping expenses (sum of withdrawals for shopping): "
		 * +shoppingExpenses);
		 * System.out.println("Date on which maximum amount withdrawn: "
		 * +dateofmaxWithdrow);
		 */
		
	}

	public Optional<Object> calculatedateofmaxWithdrow(Map<Integer, BankStatement> bankStatement) {
		/*
		 * double maxWithdrawalAmount = 0.0; String dateOfMaxWithdrawal = ""; for
		 * (BankStatement statement : bankStatement.values()) { if
		 * (statement.getWithdrawalAmount() > maxWithdrawalAmount) { maxWithdrawalAmount
		 * = statement.getWithdrawalAmount(); dateOfMaxWithdrawal =
		 * statement.getTransactionDate().toString(); }
		 * System.out.println("Date on which maximum amount withdrawn: "
		 * +dateofmaxWithdrow); } return maxWithdrawalAmount;
		 */
		 Optional<Object> maxwithdrawalAmount= bankStatement.values()
		.stream()
		.max(Comparator.comparingDouble(BankStatement::getWithdrawalAmount))
		.map(entry->entry.getTransactionDate().toString());
		System.out.println("Max withdrowal amount: "+maxwithdrawalAmount);
		return maxwithdrawalAmount;
	}

	public double calculateshoppingExpenses(Map<Integer, BankStatement> bankStatement) {
//		double shoppingExpenses = 0.0;
//        for (BankStatement statement : bankStatement.values()) {
//            if (statement.getNarration().toLowerCase().contains("shopping")) {
//                shoppingExpenses += statement.getWithdrawalAmount();
//            }
//            System.out.println("Shopping expenses (sum of withdrawals for shopping): "+shoppingExpenses);
//        }
//		return shoppingExpenses;
		double shoppingExpenses = bankStatement.values()
		.stream()
		.filter(entry -> entry.getNarration().contains("Shopping"))
		.mapToDouble(entry -> entry.getWithdrawalAmount())
		.sum();
		System.out.println("shopping Expenses "+shoppingExpenses);
		return shoppingExpenses;
	}

	public double calculateMaxDepositAmount(Map<Integer, BankStatement> bankStatement) {
//		 double maxDepositAmount = 0.0;
//	        for (BankStatement statement : bankStatement.values()) {
//	            if (statement.getDepositAmount() > maxDepositAmount) {
//	                maxDepositAmount = statement.getDepositAmount();
//		
//	            }
//	            System.out.println("Max deposit amount: "+MaxDepositAmount);
//	        }
//	        return maxDepositAmount;
		double maxDepositAmount=bankStatement.values()
				.stream()
				.mapToDouble(entry -> entry.getDepositAmount())
				.max()
				.orElse(0);
		System.out.println("Max Deposit Amount"+maxDepositAmount);
		return maxDepositAmount;
	        
	}

	public double calculateSumofDeposite(Map<Integer, BankStatement> bankStatement) throws customException{
			double SumofDeposite=0.0;
			for(BankStatement statement : bankStatement.values()) {
				SumofDeposite+=statement.getDepositAmount();
			}
			System.out.println("sum of all deposite: "+ SumofDeposite);
	
			return SumofDeposite;
	}

	
	
}

