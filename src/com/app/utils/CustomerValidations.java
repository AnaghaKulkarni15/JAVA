package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.Custom_Exception.CustomerException;
import com.app.customer.CustomerMngmt;
import com.app.customer.ServicePlan;

//1. Sign up (customer registration)
//Accept customer details
//Validate all inputs.
//In case of successful validations , 
//add customer details in the D.S , 
//display customer details via toString or display error mesg via custom exception.


public class CustomerValidations {
	public static CustomerMngmt validateinputs(String fname,String lname,String email,String passwd,
			double regiamt,String dob,String plan , List<CustomerMngmt> CustomerMngmt) throws CustomerException{
			
			checkfordupEmail(email,CustomerMngmt);
			ServicePlan serviceplan = checkplan_amt(plan,regiamt);
			LocalDate bdate = LocalDate.parse(dob);
			
			return new CustomerMngmt(fname,lname,email,passwd,regiamt,bdate,serviceplan);
		}

	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	//check for duplicate customer(by email)
	public static void checkfordupEmail(String email,List<CustomerMngmt> customerList) throws CustomerException{
		CustomerMngmt newCust = new CustomerMngmt(email);
		if(customerList.contains(newCust))
				throw new CustomerException("Duplicate Email ID Found");
	}
	
	//plan must be supported and registered amount 
	public static ServicePlan checkplan_amt(String plan , double regiamt ) throws CustomerException {
		ServicePlan serviceplan = ServicePlan.valueOf(plan.toUpperCase());
		
		if(serviceplan.getPlancost() == regiamt) {
			return serviceplan;
		}
		throw new CustomerException("Register amount does not match with registered amount");
	
	}
	
	//check Invalid Email and password
	public static void check_invalid_emailpasswd(String email,String passwd,List<CustomerMngmt> customerList) throws CustomerException{
		CustomerMngmt custempd = new CustomerMngmt(email,passwd);
		for(CustomerMngmt c : customerList)
			if(c.equals(custempd)) {			
				throw new CustomerException("Invalid Email and invalid password");			
			}	
			
	}
	
	//index of -- cust with email id // if index for email = -1 return exception 
	//password -- get method
}



