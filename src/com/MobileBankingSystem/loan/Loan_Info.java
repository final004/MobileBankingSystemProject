package com.MobileBankingSystem.loan;

public class Loan_Info {
	private int loan_amount;
	private int loan_due_date;
	private double loan_interest;
	private double loan_total_amount;
	
	public Loan_Info(int loan_amount){
		super();
		if(loan_total_amount<0){
			loan_total_amount=0;
		}else{
			this.loan_total_amount = loan_total_amount - ~(loan_amount);
		}
	}
	
	public Loan_Info(int loan_amount, int loan_due_date) {
		super();
		this.loan_amount = loan_amount;
		this.loan_due_date = loan_due_date;
		loanTotal();
	}
	
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public int getLoan_due_date() {
		return loan_due_date;
	}
	public void setLoan_due_date(int loan_due_date) {
		this.loan_due_date = loan_due_date;
	}
	public double getLoan_interest() {
		return loan_interest;
	}
	public void setLoan_interest(int loan_interest) {
		this.loan_interest = loan_interest;
	}
	public double getLoan_total_amount() {
		return loan_total_amount;
	}
	public void setLoan_total_amount(int loan_total_amount) {
		this.loan_total_amount = loan_total_amount;
	}
	
	public double loanTotal(){
		
		if(loan_due_date<0){
			loan_due_date=0;
			loan_interest=0;
		}
		else if(loan_due_date<6){
			loan_interest = 0.1;
		}
		else if(loan_due_date<12){
			loan_interest = 0.2;
		}else{
			loan_interest = 0.3;
		}
		loan_total_amount = loan_amount + (loan_amount * loan_due_date * loan_interest);
		
		return loan_total_amount;
	}
	
}
