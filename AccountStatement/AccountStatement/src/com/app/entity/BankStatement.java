package com.app.entity;

import java.time.LocalDate;

//TransactionDate,Narration,WithdrawalAmount,DepositAmount
public class BankStatement {
	private static int counter;
	private int id;
	private LocalDate TransactionDate;
	private String Narration;
	private double WithdrawalAmount;
	private double DepositAmount;
	
	static {
		counter=0;
	}
	public BankStatement() {
		// TODO Auto-generated constructor stub
	}
	public BankStatement( LocalDate transactionDate, String narration, double withdrawalAmount,
			double depositAmount) {
		super();
		this.id = ++counter;
		TransactionDate = transactionDate;
		Narration = narration;
		WithdrawalAmount = withdrawalAmount;
		DepositAmount = depositAmount;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		BankStatement.counter = counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getNarration() {
		return Narration;
	}
	public void setNarration(String narration) {
		Narration = narration;
	}
	public double getWithdrawalAmount() {
		return WithdrawalAmount;
	}
	public void setWithdrawalAmount(double withdrawalAmount) {
		WithdrawalAmount = withdrawalAmount;
	}
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		DepositAmount = depositAmount;
	}
	@Override
	public String toString() {
		return "BankStatement [id=" + id + ", TransactionDate=" + TransactionDate + ", Narration=" + Narration
				+ ", WithdrawalAmount=" + WithdrawalAmount + ", DepositAmount=" + DepositAmount + "]";
	}
	
	
	
	
}
