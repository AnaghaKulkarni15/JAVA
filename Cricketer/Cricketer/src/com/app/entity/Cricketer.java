package com.app.entity;
//String name,int age,String email_id,String Phone,int rating
public class Cricketer {
	private static int counter;
	private int id;
	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;
	
	static {
		counter=0;
	}

	public Cricketer(String name, int age, String email_id, String phone, int rating) {
		super();
		this.id = ++counter;
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Cricketer.counter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone=" + phone
				+ ", rating=" + rating + "]";
	}
	
	
	
	

}
