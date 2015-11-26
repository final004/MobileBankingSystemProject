package com.MobileBankingSystem.customer;

public class Customer_Member extends Customer {

	private int c_id;
	private String c_name;
	private String c_phone;

	public Customer_Member(String banking_id, String banking_pwd) {
		super(banking_id, banking_pwd);
		// TODO Auto-generated constructor stub
	}
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
}
