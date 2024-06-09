package com.app.dao;

import java.util.Map;

import com.app.customException.customException;
import com.app.entity.Cricketer;

public class cricketerDaoImpl implements cricketerDao {

	
	@Override
	public Cricketer addcricketer(String name, int age, String email_id, String Phone, int rating)
			throws customException {
		
		return new Cricketer(name,age,email_id,Phone,rating);
	}

	@Override
	public void displayAllCricketer(Map<Integer, Cricketer> cricketermap) throws customException {
		if(cricketermap.isEmpty()) {
			System.out.println("map is empty");
			return;
		}
		cricketermap.forEach((k,v)->System.out.println(v));		
	}

	@Override
	public void UpdateRating(int nextInt , int rating, Map<Integer, Cricketer> cricketermap)throws customException {
		Cricketer cricketer=cricketermap.values()
				.stream()
				.filter(map -> map.getId()==nextInt)
				.findFirst()
				.orElseThrow(()-> new customException("id is invali"));
		cricketer.setRating(rating);
		System.out.println("rating update successful");
		
	}

	@Override
	public void searchByName(String name, Map<Integer, Cricketer> cricketermap) throws customException {
		Cricketer cricketer= cricketermap.values()
				.stream()
				.filter(map->map.getName().equals(name))
				.findFirst()
				.orElseThrow(()->new customException("name is not found"));
		if(cricketer!=null) {
			System.out.println(cricketer);
		}
		
	}
	
	

}
