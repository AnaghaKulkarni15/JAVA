package com.app.customer;

import java.time.LocalDate;

//Customer should be assigned system generated (auto increment) customer id : int
//Store - first name, last name email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Unique ID - email (2 customers CAN NOT have SAME email id)


public class CustomerMngmt {
	private int custid;
	private String fname;
	private String lname;
	private String email;
	private String passwd;
	private double regiamt;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idgenerator;
	
	public CustomerMngmt(String fname,String lname,String email,String passwd,
			double regiamt,LocalDate dob,ServicePlan plan)
	{
		super();
		//this.custid =custid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.passwd = passwd;
		this.regiamt= regiamt;
		this.dob = dob;
		this.plan = plan;
		this.custid=idgenerator++;
		
	}
	
	
	//add overloaded constructor 
	public CustomerMngmt(String email) {
		this.email = email;
	}
	
	
	public CustomerMngmt(String email, String passwd) {
		this.email = email;
		this.passwd = passwd;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	@Override
	public String toString() {
		return "CustomerMngmt [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", passwd=" + passwd
				+ ", regiamt=" + regiamt + ", dob=" + dob + ", plan=" + plan + "]";
	}


	public boolean equals(Object o) {
		System.out.println("in customer equals");
		if(o instanceof CustomerMngmt) {
			CustomerMngmt c = (CustomerMngmt)o;
			return this.email.equals(this.email);
			
		}
		return false;
	}


	public static String indexof() {
		// TODO Auto-generated method stub
		return null;
	}
			
}
