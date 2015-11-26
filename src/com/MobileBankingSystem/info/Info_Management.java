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
				System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				break;
		}		
	}
	
	public void registerCustomerInfo(){
		System.out.println("-----ȸ������ ��� �����Դϴ�.-----");
		System.out.println("������ �Է����ּ���. : ");
		c_name = scanner.next();
		System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���. : ");
		c_ssn = scanner.next();
		System.out.println("��ȭ��ȣ�� �Է����ּ���. : ");
		c_phone = scanner.next();
		System.out.println("�ּҸ� �Է����ּ���. : ");
		c_address = scanner.next();
		
		customer_info = new Customer_Info(c_name, c_ssn, c_phone, c_address);
		customers.add(customer_info);
	}
	
	public void changeCustomerInfo(){
		System.out.println("-----ȸ������ ���� �����Դϴ�.-----");
		System.out.println("����Ȯ���� ���ؼ� ������ �Է����ּ���. : ");
		c_name = scanner.next();
		System.out.println("����Ȯ���� ���ؼ� �ֹε�Ϲ�ȣ�� �Է����ּ���. : ");
		c_ssn = scanner.next();
		customer = customers;
		for(int i=0;i<customer.size();i++){
			customer_info = customer.get(i);
			if((customer_info.getC_name().equals(c_name))&&(customer_info.getC_ssn().equals(c_ssn))){
				System.out.println("�����Ͻ� ��ȭ��ȣ�� �Է����ּ��� : ");
				c_phone = scanner.next();
				System.out.println("�����Ͻ� �ּҸ� �Է����ּ��� : ");
				c_address = scanner.next();
				
				customer_info = new Customer_Info(c_name, c_ssn, c_phone, c_address);
				customer.set(i, customer_info);
			}else{
				System.out.println("�ش� ȸ�������� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void removeCustomerInfo(){
		System.out.println("-----ȸ������ ���� �����Դϴ�.-----");
		System.out.println("����Ȯ���� ���ؼ� ������ �Է����ּ���. : ");
		c_name = scanner.next();
		System.out.println("����Ȯ���� ���ؼ� �ֹε�Ϲ�ȣ�� �Է����ּ���. : ");
		c_ssn = scanner.next();
		customer = customers;
		for(int i=0;i<customer.size();i++){
			customer_info = customer.get(i);
			if((customer_info.getC_name().equals(c_name))&&(customer_info.getC_ssn().equals(c_ssn))){
				customer.remove(i);
				System.out.println("�ش� ȸ�������� �����Ͽ����ϴ�.");
			}else{
				System.out.println("�ش� ȸ�������� �������� �ʽ��ϴ�.");
			}
		}
	}
}
