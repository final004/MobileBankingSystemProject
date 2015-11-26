package com.MobileBankingSystem.account;

import java.util.Scanner;

import com.MobileBankingSystem.ui.BankingSystem_UI;

public class Account_Management {
	private int menu_select_num;
	
	static private Account_Management instance = null;
	
	Scanner scanner = new Scanner(System.in);
	BankingSystem_UI banking_service_ui = new BankingSystem_UI();

	public Account_Management(){
				
	}
	
	static public Account_Management getInstance(){
		if(instance==null) instance = new Account_Management();
		return instance;
	}
	
	public void info_ui(){
		banking_service_ui.account_management_menu();
		menu_select_num = scanner.nextInt();
		switch(menu_select_num){
			case 1:
				break;
			case 2:
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			case 6: 
				break;
			case 7: System.exit(0);
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시입력해주세요.");
				break;
		}
	}
	
	
	public void registerAccount(){
		
	}
	
	public void removeAccount(){
		
	}
	
	public void deposit(){
		
	}
	
	public void search(){
	
	}
	
	public void withdrawal(){
		
	}
	
	public void payment(){
		
	}
}
