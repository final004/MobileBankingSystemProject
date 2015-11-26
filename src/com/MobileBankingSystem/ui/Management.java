package com.MobileBankingSystem.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.MobileBankingSystem.account.Account_Management;
import com.MobileBankingSystem.customer.Customer;
import com.MobileBankingSystem.emoney.Emoney_Management;
import com.MobileBankingSystem.info.Info_Management;
import com.MobileBankingSystem.loan.Loan_Management;
import com.MobileBankingSystem.main.BankingSystem;

public class Management {
	private int menu_select_num;
	private boolean login_check;
	private String banking_id;
	private String banking_pwd;
	
	private ArrayList<Customer> member;
	
	Scanner scanner = new Scanner(System.in);
	BankingSystem banking_system = new BankingSystem();
	BankingSystem_UI banking_service_ui = new BankingSystem_UI();
	Info_Management info_management = Info_Management.getInstance();
	Account_Management account_management = Account_Management.getInstance();
	Loan_Management loan_management = Loan_Management.getInstance();
	Emoney_Management emoney_management = Emoney_Management.getInstance();
	
	public Management(){

		System.out.println("-----로그인이 필요한 서비스입니다.-----");
		System.out.println("아이디를 입력해주세요. : ");
		banking_id = scanner.next();
		System.out.println("비밀번호를 입력해주세요. : ");
		banking_pwd = scanner.next();
		
		login_check = loginCheck(banking_id, banking_pwd);
		
		if(login_check == true){
			banking_service_ui.management_menu();
			menu_select_num = scanner.nextInt();
			
			switch(menu_select_num){
			case 1: info_management.info_ui();
			break;
			case 2: account_management.info_ui();
			break;
			case 3: loan_management.info_ui();
			break;
			case 4: emoney_management.info_ui();
			break;
			case 5: System.exit(0);
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시입력해주세요.");
				break;
			}
		}
		else{
			System.out.println("초기화면으로 돌아갑니다.");
		}
	}

	public boolean loginCheck(String banking_id, String banking_pwd){
		
		member = banking_system.members;
		for(int i=0;i<member.size();i++){
			Customer customer = member.get(i);
			if((customer.getBanking_id().equals(banking_id))&&(customer.getBanking_pwd().equals(banking_pwd))){
				System.out.println("로그인 성공");
				return true;
			}
		}
		System.out.println("로그인 실패");
		return false;
	}
}
