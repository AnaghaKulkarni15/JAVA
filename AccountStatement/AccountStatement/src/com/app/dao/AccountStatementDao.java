package com.app.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import com.app.entity.BankStatement;
import com.app.exception.customException;

public interface AccountStatementDao {
	void writeDetails(String filename, Map<Integer, BankStatement> bankStatement) throws customException, IOException;

	void readDetails(String filename) throws customException, FileNotFoundException, IOException;

	void display(Map<Integer, BankStatement> bankStatement) throws customException;

	double calculateMaxDepositAmount(Map<Integer, BankStatement> bankStatement);

	double calculateshoppingExpenses(Map<Integer, BankStatement> bankStatement);

	double calculateSumofDeposite(Map<Integer, BankStatement> bankStatement) throws customException;
	
	Optional<Object> calculatedateofmaxWithdrow(Map<Integer, BankStatement> bankStatement);
}
