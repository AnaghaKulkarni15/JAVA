package com.app.dao;

import java.util.Map;

import com.app.customException.customException;
import com.app.entity.Cricketer;

public interface cricketerDao {

	//String name,int age,String email_id,String Phone,int rating
	Cricketer addcricketer(String name,int age,String email_id,String Phone,int rating) throws customException;
	
	void displayAllCricketer(Map<Integer, Cricketer> cricketermap)throws customException;

	void UpdateRating(int nextInt, int rating, Map<Integer, Cricketer> cricketermap) throws customException;

	void searchByName(String name, Map<Integer, Cricketer> cricketermap) throws customException;

	
}
