package com.MobileBankingSystem.customer;

import java.util.ArrayList;
import java.util.Scanner;

import com.MobileBankingSystem.customer.Customer;
import com.MobileBankingSystem.main.BankingSystem;
import com.MobileBankingSystem.ui.BankingSystem_UI;

public class Info_Management {
	int menu_select_num;
	
	ArrayList<Customer> member;
	
	Scanner scanner = new Scanner(System.in);
	BankingSystem banking_system = new BankingSystem();
	BankingSystem_UI banking_service_ui = new BankingSystem_UI();

	public Info_Management(){
		banking_service_ui.info_management_menu();
		menu_select_num = scanner.nextInt();
		switch(menu_select_num){
			case 1: registerCustomerInfo();
				break;
			case 2: changeCustomerInfo();
				break;
			case 3: removeCustomerInfo();
				break;
			case 4: System.exit(0);
			default:
				System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				break;
		}		
	}	
	
	public void registerCustomerInfo(){
		
	}
	
	public void changeCustomerInfo(){
		
	}
	
	public void removeCustomerInfo(){
		
	}
}
