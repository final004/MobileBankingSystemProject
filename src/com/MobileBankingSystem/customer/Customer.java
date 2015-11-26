package com.MobileBankingSystem.customer;

public class Customer {

	private String banking_id;
	private String banking_pwd;

	Customer(String banking_id, String banking_pwd){
		this.banking_id=banking_id;
		this.banking_pwd=banking_pwd;
	}
	
	public String getBanking_id() {
		return banking_id;
	}
	public void setBanking_id(String banking_id) {
		this.banking_id = banking_id;
	}
	public String getBanking_pwd() {
		return banking_pwd;
	}
	public void setBanking_pwd(String banking_pwd) {
		this.banking_pwd = banking_pwd;
	}

}
