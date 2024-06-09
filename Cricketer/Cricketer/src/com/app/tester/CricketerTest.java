package com.app.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.dao.cricketerDao;
import com.app.dao.cricketerDaoImpl;
import com.app.entity.Cricketer;

public class CricketerTest {
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			boolean exit=false;
			Map<Integer, Cricketer> cricketermap =new HashMap<>();
			cricketerDao cricketdao = new cricketerDaoImpl();
			while (!exit) {
				System.out.println("0.exit\n1.add new Cricketer\n2.display all cricketer\n3.UpdateRating\n4.searchByName");
				System.out.println("choose:");
				try {
					
					switch (sc.nextInt()) {
					case 0:
						exit =true;
						break;
					case 1:
						System.out.println("Enter name,age,email_id,Phone,rating");
						Cricketer cricketer =cricketdao.addcricketer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
						cricketermap.put(cricketer.getId(), cricketer);
						System.out.println("successful add cricketer");
						break;
					case 2:
						cricketdao.displayAllCricketer(cricketermap);
						 break;
					case 3:
						cricketdao.UpdateRating(sc.nextInt(),sc.nextInt(),cricketermap);
						break;
					case 4:
						cricketdao.searchByName(sc.next(),cricketermap);
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
