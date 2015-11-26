package com.MobileBankingSystem.emoney;

import java.util.Scanner;

import com.MobileBankingSystem.ui.BankingSystem_UI;

public class Emoney_Management {
	private int menu_select_num;

	static private Emoney_Management instance = null;
	Scanner scanner = new Scanner(System.in);
	BankingSystem_UI banking_service_ui = new BankingSystem_UI();

	private Emoney_Management(){
				
	}
	
	static public Emoney_Management getInstance(){
		if(instance == null) instance = new Emoney_Management();
		return instance;
	}
	
	public void info_ui(){
		banking_service_ui.emoney_management_menu();
		menu_select_num = scanner.nextInt();
		switch(menu_select_num){
			case 1:
				break;
			case 2:
				break;
			case 3: System.exit(0);
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시입력해주세요.");
				break;
		}
	}
	
	public void buyEmoney(){
		
	}
	
	public void sellEmoney(){
		
	}
}
