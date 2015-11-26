package com.MobileBankingSystem.info;

import java.util.ArrayList;
import java.util.Scanner;

import com.MobileBankingSystem.ui.BankingSystem_UI;

public class Info_Management {
	private int menu_select_num;
	private String c_name;
	private String c_ssn;
	private String c_phone;
	private String c_address;
	
	static private Info_Management instance = null;
	public ArrayList<Customer_Info> customers = new ArrayList<Customer_Info>();
	ArrayList<Customer_Info> customer;
	Scanner scanner = new Scanner(System.in);
	BankingSystem_UI banking_service_ui = new BankingSystem_UI();
	Customer_Info customer_info;

	private Info_Management(){
		
	}	
	
	static public Info_Management getInstance(){
		if(instance == null) instance = new Info_Management();
		return instance;
	}
	
	public void info_ui(){
		banking_service_ui.info_management_menu();
		menu_select_num = scanner.nextInt();
		switch(menu_select_num){
			case 1: 	
				registerCustomerInfo();
				System.out.println(customers.size());
				break;
			case 2: 
				changeCustomerInfo();
				System.out.println(customers.size());
				break;
			case 3: 
				removeCustomerInfo();
				System.out.println(customers.size());
				break;
			case 4: System.exit(0);
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시입력해주세요.");
				break;
		}		
	}
	
	public void registerCustomerInfo(){
		System.out.println("-----회원정보 등록 서비스입니다.-----");
		System.out.println("성함을 입력해주세요. : ");
		c_name = scanner.next();
		System.out.println("주민등록번호를 입력해주세요. : ");
		c_ssn = scanner.next();
		System.out.println("전화번호를 입력해주세요. : ");
		c_phone = scanner.next();
		System.out.println("주소를 입력해주세요. : ");
		c_address = scanner.next();
		
		customer_info = new Customer_Info(c_name, c_ssn, c_phone, c_address);
		customers.add(customer_info);
	}
	
	public void changeCustomerInfo(){
		System.out.println("-----회원정보 변경 서비스입니다.-----");
		System.out.println("본인확인을 위해서 성함을 입력해주세요. : ");
		c_name = scanner.next();
		System.out.println("본인확인을 위해서 주민등록번호를 입력해주세요. : ");
		c_ssn = scanner.next();
		customer = customers;
		for(int i=0;i<customer.size();i++){
			customer_info = customer.get(i);
			if((customer_info.getC_name().equals(c_name))&&(customer_info.getC_ssn().equals(c_ssn))){
				System.out.println("변경하실 전화번호를 입력해주세요 : ");
				c_phone = scanner.next();
				System.out.println("변경하실 주소를 입력해주세요 : ");
				c_address = scanner.next();
				
				customer_info = new Customer_Info(c_name, c_ssn, c_phone, c_address);
				customer.set(i, customer_info);
			}else{
				System.out.println("해당 회원정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void removeCustomerInfo(){
		System.out.println("-----회원정보 제거 서비스입니다.-----");
		System.out.println("본인확인을 위해서 성함을 입력해주세요. : ");
		c_name = scanner.next();
		System.out.println("본인확인을 위해서 주민등록번호를 입력해주세요. : ");
		c_ssn = scanner.next();
		customer = customers;
		for(int i=0;i<customer.size();i++){
			customer_info = customer.get(i);
			if((customer_info.getC_name().equals(c_name))&&(customer_info.getC_ssn().equals(c_ssn))){
				customer.remove(i);
				System.out.println("해당 회원정보를 삭제하였습니다.");
			}else{
				System.out.println("해당 회원정보가 존재하지 않습니다.");
			}
		}
	}
}
