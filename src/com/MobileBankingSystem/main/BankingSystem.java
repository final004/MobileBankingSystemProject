package com.MobileBankingSystem.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.MobileBankingSystem.customer.Customer;
import com.MobileBankingSystem.customer.Customer_Member;
import com.MobileBankingSystem.info.Customer_Info;
import com.MobileBankingSystem.ui.BankingSystem_UI;
import com.MobileBankingSystem.ui.Management;

// BankingSystem
public class BankingSystem {

	public ArrayList<Customer> members;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu_select_num;

		BankingSystem_UI banking_system_ui = new BankingSystem_UI();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			banking_system_ui.customer_menu();
			menu_select_num = scanner.nextInt();
			switch(menu_select_num){
				case 1: new Management();
					break;
				case 2: new Management();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("�뜝�룞�삕�샇�뜝�룞�삕 �뜝�뙥紐뚯삕�뜝�뙃琉꾩삕�뜝�떦�뀲�룞�삕�뜝�떦�뙋�삕. �뜝�뙐�룞�삕�뜝�뙃琉꾩삕�뜝�룞�삕�뜝�뙇�눦�삕�뜝�룞�삕.");
					break;
			}
		}
	}
	
	public BankingSystem(){
		members = new ArrayList<Customer>();
		members.add(new Customer_Member("1", "1"));
		members.add(new Customer_Member("2", "2"));
//		members.add(new Customer_Nonmember("01046190225","1"));
//		System.out.println(members.size());
//		System.out.println(Arrays.asList(members));
	}
}
