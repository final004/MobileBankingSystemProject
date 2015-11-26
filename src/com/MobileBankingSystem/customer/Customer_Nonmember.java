package com.MobileBankingSystem.customer;

public class Customer_Nonmember extends Customer{

	private static String c_phone;

	public Customer_Nonmember(String banking_id, String banking_pwd) {
		super(c_phone, banking_pwd);
		// TODO Auto-generated constructor stub
	}
	
	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
}
