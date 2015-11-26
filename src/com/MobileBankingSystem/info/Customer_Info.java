package com.MobileBankingSystem.info;

public class Customer_Info {
	private String c_name;
	private String c_ssn;
	private String c_phone;
	private String c_address;
	
	public Customer_Info(String c_name, String c_ssn, String c_phone, String c_address) {
		super();
		this.c_name = c_name;
		this.c_ssn = c_ssn;
		this.c_phone = c_phone;
		this.c_address = c_address;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_ssn() {
		return c_ssn;
	}
	public void setC_ssn(String c_ssn) {
		this.c_ssn = c_ssn;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String c_address) {
		this.c_address = c_address;
	}
}
