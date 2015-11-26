package com.MobileBankingSystem.loan;

import java.util.ArrayList;
import java.util.Scanner;

import com.MobileBankingSystem.ui.BankingSystem_UI;

public class Loan_Management {
	private int menu_select_num;
	private int loan_amount;
	private int loan_due_date;
	static private Loan_Management instance = null;
	public ArrayList<Loan_Info> loans = new ArrayList<Loan_Info>();
	ArrayList<Loan_Info> loan;
	Scanner scanner = new Scanner(System.in);
	BankingSystem_UI banking_service_ui = new BankingSystem_UI();
	Loan_Info loan_info;

	private Loan_Management(){
		
	}	
	
	static public Loan_Management getInstance(){
		if(instance == null) instance = new Loan_Management();
		return instance;
	}
	
	public void info_ui(){
		banking_service_ui.loan_management_menu();
		menu_select_num = scanner.nextInt();
		switch(menu_select_num){
			case 1:
				borrow();
				System.out.println(loans.size());
				break;
			case 2:
				repay();
				System.out.println(loans.size());
				break;
			case 3: System.exit(0);
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시입력해주세요.");
				break;
		}		
	}

	public void borrow(){
		System.out.println("-----대출신청 서비스입니다.-----");
		System.out.println("대출하실 금액을 입력해주세요. : ");
		loan_amount = scanner.nextInt();
		System.out.println("대출하실 기간을 입력해주세요. : ");
		loan_due_date = scanner.nextInt();
		
		loan_info = new Loan_Info(loan_amount, loan_due_date);
		loans.add(loan_info);
	}
	
	public void repay(){
		System.out.println("-----대출상환 서비스입니다.-----");
		System.out.println("상환하실 금액을 입력해주세요. : ");
		loan_amount = scanner.nextInt();
		loan = loans;
		for(int i=0;i<loan.size();i++){
			loan_info = loan.get(i);
			loan_info = new Loan_Info(i, loan_amount);
			loans.set(i, loan_info);
			System.out.println("남은 상환액은 : " + loan_info.getLoan_total_amount() + "입니다.");
		}
	}
}
